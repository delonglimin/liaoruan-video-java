package com.ruoyi.video.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 影人对象 actor
 *
 * @author ruoyi
 * @date 2023-10-23
 */
public class Actor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long version;

    /** $column.columnComment */
    private Long id;

    /** 封面 */
    @Excel(name = "封面")
    private String avatar;

    /** 中文名 */
    @Excel(name = "中文名")
    private String name;

    /** 英文名 */
    @Excel(name = "英文名")
    private String nameEn;

    /** 中文别名 */
    @Excel(name = "中文别名")
    private String nameMore;

    /** 英文别名 */
    @Excel(name = "英文别名")
    private String nameEnMore;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 逝世日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "逝世日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deathDay;

    /** 出生地址 */
    @Excel(name = "出生地址")
    private String bornPlace;

    /** 简介 */
    @Excel(name = "简介")
    private String brief;

    /** 性别 */
    @Excel(name = "性别")
    private String gender;

    /** 国家id */
    @Excel(name = "国家id")
    private Long countryId;

    private BasicCountry country;


    public void setVersion(Long version)
    {
        this.version = version;
    }

    public Long getVersion()
    {
        return version;
    }
    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setAvatar(String avatar)
    {
        this.avatar = avatar;
    }

    public String getAvatar()
    {
        return avatar;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setNameEn(String nameEn)
    {
        this.nameEn = nameEn;
    }

    public String getNameEn()
    {
        return nameEn;
    }
    public void setNameMore(String nameMore)
    {
        this.nameMore = nameMore;
    }

    public String getNameMore()
    {
        return nameMore;
    }
    public void setNameEnMore(String nameEnMore)
    {
        this.nameEnMore = nameEnMore;
    }

    public String getNameEnMore()
    {
        return nameEnMore;
    }
    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public Date getBirthday()
    {
        return birthday;
    }
    public void setDeathDay(Date deathDay)
    {
        this.deathDay = deathDay;
    }

    public Date getDeathDay()
    {
        return deathDay;
    }
    public void setBornPlace(String bornPlace)
    {
        this.bornPlace = bornPlace;
    }

    public String getBornPlace()
    {
        return bornPlace;
    }
    public void setBrief(String brief)
    {
        this.brief = brief;
    }

    public String getBrief()
    {
        return brief;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getGender()
    {
        return gender;
    }
    public void setCountryId(Long countryId)
    {
        this.countryId = countryId;
    }

    public Long getCountryId()
    {
        return countryId;
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
                .append("id", getId())
                .append("avatar", getAvatar())
                .append("name", getName())
                .append("nameEn", getNameEn())
                .append("nameMore", getNameMore())
                .append("nameEnMore", getNameEnMore())
                .append("birthday", getBirthday())
                .append("deathDay", getDeathDay())
                .append("bornPlace", getBornPlace())
                .append("brief", getBrief())
                .append("gender", getGender())
                .append("countryId", getCountryId())
                .toString();
    }

    public BasicCountry getCountry() {
        return country;
    }

    public void setCountry(BasicCountry country) {
        this.country = country;
    }
}
