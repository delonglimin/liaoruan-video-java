package com.ruoyi.framework.web.service;

import com.ruoyi.common.utils.ServletUtils;
import com.ruoyi.video.domain.WebUser;
import com.ruoyi.video.service.IWebUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.enums.UserStatus;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.service.ISysUserService;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 用户验证处理
 *
 * @author ruoyi
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private static final Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private ISysUserService userService;

    @Autowired
    private IWebUserService webUserService;

    @Autowired
    private SysPasswordService passwordService;

    @Autowired
    private CommonPasswordService commonPasswordService;

    @Autowired
    private SysPermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        String platform = ServletUtils.getRequest().getHeader("Platform");

        if ("pc".equals(platform)) {
            WebUser user = webUserService.selectWebUserByPhone(username);
            if (StringUtils.isNull(user)) {
                log.info("登录用户：{} 不存在.", username);
                throw new ServiceException("登录用户：" + username + " 不存在");
            } else if (UserStatus.DISABLE.getCode().equals(user.getStatus())) {
                log.info("登录用户：{} 已被停用.", username);
                throw new ServiceException("对不起，您的账号：" + username + " 已停用");
            }

            commonPasswordService.validate(user);

            return createLoginUser(user);

        } else {
            SysUser user = userService.selectUserByUserName(username);
            if (StringUtils.isNull(user)) {
                log.info("登录用户：{} 不存在.", username);
                throw new ServiceException("登录用户：" + username + " 不存在");
            } else if (UserStatus.DELETED.getCode().equals(user.getDelFlag())) {
                log.info("登录用户：{} 已被删除.", username);
                throw new ServiceException("对不起，您的账号：" + username + " 已被删除");
            } else if (UserStatus.DISABLE.getCode().equals(user.getStatus())) {
                log.info("登录用户：{} 已被停用.", username);
                throw new ServiceException("对不起，您的账号：" + username + " 已停用");
            }

            passwordService.validate(user);

            return createLoginUser(user);

        }


    }

    public UserDetails createLoginUser(SysUser user) {
        return new LoginUser(user.getUserId(), user.getDeptId(), user, permissionService.getMenuPermission(user));
    }

    public UserDetails createLoginUser(WebUser user) {

        // 复用认证逻辑，把webuser  转为sysuser
        SysUser temp = new SysUser();
        temp.setUserId(user.getUserId());
        temp.setAvatar(user.getAvator());
        temp.setPassword(user.getPassword());
        temp.setUserName(user.getPhone());
        temp.setPhonenumber(user.getPhone());


        return new LoginUser(user.getUserId(), 0L,temp, new HashSet<String>());
    }
}
