package com.ruoyi.api.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.service.ISysConfigService;
import com.ruoyi.video.domain.*;
import com.ruoyi.video.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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
    ISysConfigService configService;

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
    @Transactional
    public AjaxResult sign() {
        if(this.getSignStatus().isEmpty()){
            Long reward = 100L;
            String configReward = configService.selectConfigByKey("user.sign.reward");
            if(!configReward.isEmpty()){
                reward = Long.parseLong(configReward);
            }

            UserSignLog p = new UserSignLog();
            p.setUserId(getUserId());
            p.setSignReward("签到+"+reward);
            userSignLogService.insertUserSignLog(p);

            UserWalletLog l = new UserWalletLog();
            l.setUserId(getUserId());
            l.setType(1L);
            l.setRemark("签到+"+reward);
            l.setGold(reward);
            userWalletLogService.insertUserWalletLog(l);

            WebUser user = webUserService.selectWebUserByUserId(getUserId());
            user.setWalletGold(user.getWalletGold() + reward);
            webUserService.updateWebUser(user);
            return AjaxResult.success("签到+"+reward,true);
        }
        return error("已经签到过啦");
    }




}
