package com.ruoyi.api.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.video.domain.BasicBanner;
import com.ruoyi.video.domain.UserMovie;
import com.ruoyi.video.domain.UserRate;
import com.ruoyi.video.domain.WebUser;
import com.ruoyi.video.service.IBasicBannerService;
import com.ruoyi.video.service.IUserMovieService;
import com.ruoyi.video.service.IUserRateService;
import com.ruoyi.video.service.IWebUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * userController
 *
 * @author ruoyi
 * @date 2023-10-20
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private IWebUserService webUserService;

    @Autowired
    private IUserRateService userRateService;

    @Autowired
    private IUserMovieService userMovieService;


    @GetMapping("/info")
    public AjaxResult getInfo() {
        WebUser userDetail  = webUserService.selectWebUserByUserId(getUserId());
        return success(userDetail);
    }

    // todo 检查权限前置
    @GetMapping("/collect/find")
    public AjaxResult getCollectInfo(@RequestParam("movieId") Long movieId) {
        Long userId = getUserId();
        Boolean res = webUserService.checkCollect(userId, movieId);
        return success(res);
    }


    @GetMapping("/collect/findByPage")
    public TableDataInfo getMyCollet() {
        Long userId = getUserId();
        List<HashMap> res = webUserService.findCollectList(userId);
        return getDataTable(res);
    }


    @PostMapping("/collect")
    public AjaxResult addCollect(@RequestBody HashMap<String,String> params) {
        Long userId = getUserId();
        Long res = webUserService.addCollect(userId, Long.parseLong(params.get("movieId")));
        return success(res);
    }

    @GetMapping("/collect/cancel")
    public AjaxResult cancelCollet(@RequestParam("movieId") Long movieId) {
        Long userId = getUserId();
        Long res = webUserService.cancelCollect(userId, movieId);
        return success(res);
    }


    @PostMapping("/rate")
    public AjaxResult userRate(@RequestBody UserRate rate) {
        Long userId = getUserId();
        rate.setUserId(userId);
        List<UserRate> userRate = userRateService.selectUserRateList(rate);
        if (!userRate.isEmpty()) {
            return error("已评分过当前影视");
        } else {
            int res = userRateService.insertUserRate(rate);
            return success(res);
        }
    }

    @GetMapping("/rate/find")
    public AjaxResult checkRate(@RequestParam("movieId") Long movieId) {
        Long userId = getUserId();
        Boolean res = userRateService.checkRate(userId, movieId);
        return success(res);
    }

    /**
     * 查看用户是否购买过
     * @param movieId
     * @return
     */

    @GetMapping("/movie")
    public AjaxResult userMovie(@RequestParam("movieId") Long movieId) {
        Long userId = getUserId();
        UserMovie p = new UserMovie();
        p.setMovieId(movieId);
        p.setUserId(userId);
        List res = userMovieService.selectUserMovieList(p);
        return success(!res.isEmpty());
    }




}
