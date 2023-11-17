package com.ruoyi.api.controller.common;

import java.util.HashMap;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.model.RegisterBody;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.framework.web.service.CommonUserService;
import com.ruoyi.system.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.core.domain.AjaxResult;


/**
 * 登录验证
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/web/user")
public class LoginController extends BaseController {

    @Autowired
    private CommonUserService commonUserService;

    /**
     * 登录方法
     *
     * @return 结果
     */
    @PostMapping("/login")
    public AjaxResult login(@RequestBody HashMap<String, String> params) {
        AjaxResult ajax = AjaxResult.success();
        // 生成令牌
        String token = commonUserService.login(params.get("phone"), params.get("password"));
        ajax.put(Constants.TOKEN, token);
        return ajax;
    }

    /**
     * 注册方法
     *
     * @return 结果
     */
    @PostMapping("/reg")
    public AjaxResult reg(@RequestBody HashMap<String, String> params) {
//        if (!("true".equals(configService.selectConfigByKey("user.account.registerUser"))))
//        {
//            return error("当前系统没有开启注册功能！");
//        }
        RegisterBody registerBody = new RegisterBody();
        registerBody.setUsername(params.get("phone"));
        registerBody.setPassword(params.get("password"));
        String msg = commonUserService.register(registerBody);
        return StringUtils.isEmpty(msg) ? success() : error(msg);
    }


}
