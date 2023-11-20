package com.ruoyi.api.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.video.domain.*;
import com.ruoyi.video.service.*;
import org.springframework.beans.factory.annotation.Autowired;
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
public class UserSignController extends BaseController {
    @Autowired
    private IUserSignLogService userSignLogService;


    @Autowired
    private IUserWalletLogService userWalletLogService;

    @Autowired
    private IWebUserService webUserService;

    /**
     * 获取签到信息
     * @return
     */

    @GetMapping("/sign/getSign")
    public AjaxResult getSign() {

        List<UserSignLog> res = this.getSignStatus();
        return success(!res.isEmpty());
    }

    /**
     * 查询今天有没有签到
     * @return
     */

    private List<UserSignLog> getSignStatus(){
        UserSignLog p = new UserSignLog();
        p.setUserId(getUserId());

        String[] date = DateUtils.calculateDateRange(0);
        p.setBeginSignTime(date[0] + " 00:00:00");
        p.setEndSignTime(date[1] + " 23:59:59");

       return userSignLogService.selectUserSignLogList(p);
    }

    /**
     * 签到
     * @return
     */
    @GetMapping("/sign")
    public AjaxResult sign() {
        if(this.getSignStatus().isEmpty()){
            UserSignLog p = new UserSignLog();
            p.setUserId(getUserId());
            p.setSignReward("签到+100");
            userSignLogService.insertUserSignLog(p);
            // todo 事务处理

            UserWalletLog l = new UserWalletLog();
            l.setUserId(getUserId());
            l.setType(1L);
            l.setRemark("签到+100");
            l.setGold(100L);
            userWalletLogService.insertUserWalletLog(l);
            return success("签到+100");
        }
        return error("已经签到过啦");
    }




}
