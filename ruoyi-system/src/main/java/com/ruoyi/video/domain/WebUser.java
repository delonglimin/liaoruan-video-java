package com.ruoyi.video.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户管理对象 web_user
 *
 * @author ruoyi
 * @date 2023-10-23
 */
public class WebUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long version;

    /** 用户ID */
    private Long userId;

    /** 用户邮箱 */
    @Excel(name = "用户邮箱")
    private String email;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    /** 盐加密 */
    @Excel(name = "盐加密")
    private String salt;

    /** 帐号状态（0正常 1停用） */
    @Excel(name = "帐号状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 最后登录IP */
    @Excel(name = "最后登录IP")
    private String loginIp;

    /** 收藏数 */
    @Excel(name = "收藏数")
    private String userCollectCount;

    /** 最后登录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后登录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date loginDate;

    public void setVersion(Long version)
    {
        this.version = version;
    }

    public Long getVersion()
    {
        return version;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }
    public void setSalt(String salt)
    {
        this.salt = salt;
    }

    public String getSalt()
    {
        return salt;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setLoginIp(String loginIp)
    {
        this.loginIp = loginIp;
    }

    public String getLoginIp()
    {
        return loginIp;
    }
    public void setLoginDate(Date loginDate)
    {
        this.loginDate = loginDate;
    }

    public Date getLoginDate()
    {
        return loginDate;
    }



    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .append("createBy", getCreateBy())
                .append("updateBy", getUpdateBy())
                .append("remark", getRemark())
                .append("version", getVersion())
                .append("userId", getUserId())
                .append("email", getEmail())
                .append("password", getPassword())
                .append("salt", getSalt())
                .append("status", getStatus())
                .append("loginIp", getLoginIp())
                .append("loginDate", getLoginDate())
                .toString();
    }

    public String getUserCollectCount() {
        return userCollectCount;
    }

    public void setUserCollectCount(String userCollectCount) {
        this.userCollectCount = userCollectCount;
    }
}
