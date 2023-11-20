package com.ruoyi.video.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 签到对象 user_sign_log
 *
 * @author ruoyi
 * @date 2023-11-20
 */
public class UserSignLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 备注 */
    @Excel(name = "备注")
    private String signReward;

    /** 签到时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "签到时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date signTime;

    /** 1=签到 2=补签 */
    @Excel(name = "1=签到 2=补签")
    private Long signType;


    private String beginSignTime;

    public String getBeginSignTime() {
        return beginSignTime;
    }

    public void setBeginSignTime(String beginSignTime) {
        this.beginSignTime = beginSignTime;
    }

    public String getEndSignTime() {
        return endSignTime;
    }

    public void setEndSignTime(String endSignTime) {
        this.endSignTime = endSignTime;
    }

    private String endSignTime;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }
    public void setSignReward(String signReward)
    {
        this.signReward = signReward;
    }

    public String getSignReward()
    {
        return signReward;
    }
    public void setSignTime(Date signTime)
    {
        this.signTime = signTime;
    }

    public Date getSignTime()
    {
        return signTime;
    }
    public void setSignType(Long signType)
    {
        this.signType = signType;
    }

    public Long getSignType()
    {
        return signType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("userId", getUserId())
                .append("signReward", getSignReward())
                .append("signTime", getSignTime())
                .append("signType", getSignType())
                .toString();
    }
}
