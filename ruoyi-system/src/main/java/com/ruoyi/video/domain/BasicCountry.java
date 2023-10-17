package com.ruoyi.video.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 国家管理对象 basic_country
 *
 * @author ruoyi
 * @date 2023-10-13
 */
public class BasicCountry extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long version;

    /** $column.columnComment */
    private Long id;

    /** 中文简称 */
    @Excel(name = "中文简称")
    private String name;

    /** 编码 */
    @Excel(name = "编码")
    private String code;

    /** 类型 0:国家 1：地区 */
    @Excel(name = "类型 0:国家 1：地区")
    private Long type;

    /** 中文全称 */
    @Excel(name = "中文全称")
    private String fullname;

    /** 所属大洲 */
    @Excel(name = "所属大洲")
    private String continent;

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

    /** 成立日期 */
    @Excel(name = "成立日期")
    private String beginDate;

    /** 消失日期 */
    @Excel(name = "消失日期")
    private String endDate;

    /** 国旗/区旗 */
    @Excel(name = "国旗/区旗")
    private String flag;

    /** 简介 */
    @Excel(name = "简介")
    private String brief;

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
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }
    public void setType(Long type)
    {
        this.type = type;
    }

    public Long getType()
    {
        return type;
    }
    public void setFullname(String fullname)
    {
        this.fullname = fullname;
    }

    public String getFullname()
    {
        return fullname;
    }
    public void setContinent(String continent)
    {
        this.continent = continent;
    }

    public String getContinent()
    {
        return continent;
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
    public void setBeginDate(String beginDate)
    {
        this.beginDate = beginDate;
    }

    public String getBeginDate()
    {
        return beginDate;
    }
    public void setEndDate(String endDate)
    {
        this.endDate = endDate;
    }

    public String getEndDate()
    {
        return endDate;
    }
    public void setFlag(String flag)
    {
        this.flag = flag;
    }

    public String getFlag()
    {
        return flag;
    }
    public void setBrief(String brief)
    {
        this.brief = brief;
    }

    public String getBrief()
    {
        return brief;
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
                .append("name", getName())
                .append("code", getCode())
                .append("type", getType())
                .append("fullname", getFullname())
                .append("continent", getContinent())
                .append("nameEn", getNameEn())
                .append("fullnameEn", getFullnameEn())
                .append("originalName", getOriginalName())
                .append("originalFullname", getOriginalFullname())
                .append("beginDate", getBeginDate())
                .append("endDate", getEndDate())
                .append("flag", getFlag())
                .append("brief", getBrief())
                .toString();
    }
}
