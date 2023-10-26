package com.ruoyi.video.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 基础数据-影人职务对象 basic_profession
 *
 * @author ruoyi
 * @date 2023-10-20
 */
public class BasicProfession extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** 中文名称 */
    @Excel(name = "中文名称")
    private String name;

    /** 英文简称 */
    @Excel(name = "英文简称")
    private String nameEn;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long version;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String parentId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mpath;

    /** 状态 */
    @Excel(name = "状态")
    private Long status;

    /** 简介 */
    @Excel(name = "简介")
    private String brief;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
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
    public void setNameEn(String nameEn)
    {
        this.nameEn = nameEn;
    }

    public String getNameEn()
    {
        return nameEn;
    }
    public void setVersion(Long version)
    {
        this.version = version;
    }

    public Long getVersion()
    {
        return version;
    }
    public void setParentId(String parentId)
    {
        this.parentId = parentId;
    }

    public String getParentId()
    {
        return parentId;
    }
    public void setMpath(String mpath)
    {
        this.mpath = mpath;
    }

    public String getMpath()
    {
        return mpath;
    }
    public void setStatus(Long status)
    {
        this.status = status;
    }

    public Long getStatus()
    {
        return status;
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
                .append("id", getId())
                .append("name", getName())
                .append("nameEn", getNameEn())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .append("createBy", getCreateBy())
                .append("updateBy", getUpdateBy())
                .append("remark", getRemark())
                .append("version", getVersion())
                .append("parentId", getParentId())
                .append("mpath", getMpath())
                .append("status", getStatus())
                .append("brief", getBrief())
                .toString();
    }
}
