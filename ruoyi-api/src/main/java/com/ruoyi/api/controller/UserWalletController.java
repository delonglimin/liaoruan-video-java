package com.ruoyi.api.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.video.domain.WebUser;
import com.ruoyi.video.service.IUserWalletLogService;
import com.ruoyi.video.service.IWebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * userController
 *
 * @author ruoyi
 * @date 2023-10-20
 */
@RestController
@RequestMapping("/user")
public class UserWalletController extends BaseController {
    @Autowired
    private IWebUserService webUserService;

    @Autowired
    private IUserWalletLogService userWalletLogService;

    /**
     * 获取签到信息
     * @return
     */

    @GetMapping("/wallet/findGold")
    public AjaxResult findGold() {
        return success();
    }





}
