package com.ruoyi.video.domain;

import com.ruoyi.common.annotation.Excels;
import com.ruoyi.common.core.domain.entity.SysDept;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 基础数据-语言管理对象 basic_language
 *
 * @author ruoyi
 * @date 2023-10-13
 */
public class BasicLanguage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 中文简称 */
    @Excel(name = "中文简称")
    private String name;

    /** 中文全称 */
    @Excel(name = "中文全称")
    private String fullname;

    /** 所属国家 */
    @Excel(name = "所属国家")
    private Long countryId;

    /** 国家对象 */
    @Excels({
            @Excel(name = "国家名称", targetAttr = "name", type = Excel.Type.EXPORT),
    })
    private BasicCountry country;

    /** 英文简称 */
    @Excel(name = "英文简称")
    private String nameEn;

    /** 英文全称 */
    @Excel(name = "英文全称")
    private String fullnameEn;

    /** 原名简称 */
    @Excel(name = "原名简称")
    private String originalName;

    /** 原名全称 */
    @Excel(name = "原名全称")
    private String originalFullname;

    /** 简介 */
    @Excel(name = "简介")
    private String brief;

    /** 影视数量 */
    @Excel(name = "影视数量")
    private String movieCount;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long version;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setFullname(String fullname)
    {
        this.fullname = fullname;
    }

    public String getFullname()
    {
        return fullname;
    }
    public void setCountryId(Long countryId)
    {
        this.countryId = countryId;
    }

    public Long getCountryId()
    {
        return countryId;
    }
    public void setNameEn(String nameEn)
    {
        this.nameEn = nameEn;
    }

    public String getNameEn()
    {
        return nameEn;
    }
    public void setFullnameEn(String fullnameEn)
    {
        this.fullnameEn = fullnameEn;
    }

    public String getFullnameEn()
    {
        return fullnameEn;
    }
    public void setOriginalName(String originalName)
    {
        this.originalName = originalName;
    }

    public String getOriginalName()
    {
        return originalName;
    }
    public void setOriginalFullname(String originalFullname)
    {
        this.originalFullname = originalFullname;
    }

    public String getOriginalFullname()
    {
        return originalFullname;
    }
    public void setBrief(String brief)
    {
        this.brief = brief;
    }

    public String getBrief()
    {
        return brief;
    }
    public void setVersion(Long version)
    {
        this.version = version;
    }

    public Long getVersion()
    {
        return version;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("name", getName())
                .append("fullname", getFullname())
                .append("countryId", getCountryId())
                .append("nameEn", getNameEn())
                .append("fullnameEn", getFullnameEn())
                .append("originalName", getOriginalName())
                .append("originalFullname", getOriginalFullname())
                .append("brief", getBrief())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .append("createBy", getCreateBy())
                .append("updateBy", getUpdateBy())
                .append("remark", getRemark())
                .append("version", getVersion())
                .toString();
    }

    public BasicCountry getCountry() {
        return country;
    }

    public void setCountry(BasicCountry country) {
        this.country = country;
    }

    public String getMovieCount() {
        return movieCount;
    }

    public void setMovieCount(String movieCount) {
        this.movieCount = movieCount;
    }
}
