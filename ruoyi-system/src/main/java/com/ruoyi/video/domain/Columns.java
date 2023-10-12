package com.ruoyi.video.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 栏目管理对象 columns
 *
 * @author ruoyi
 * @date 2023-10-12
 */
public class Columns extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long version;

    /** $column.columnComment */
    private Long id;

    /** 栏目名称 */
    @Excel(name = "栏目名称")
    private String name;

    /** 目录名 */
    @Excel(name = "目录名")
    private String value;

    /** 排序 */
    @Excel(name = "排序")
    private Long order;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 栏目类型 */
    @Excel(name = "栏目类型")
    private String type;

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
    public void setValue(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }
    public void setOrder(Long order)
    {
        this.order = order;
    }

    public Long getOrder()
    {
        return order;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
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
                .append("value", getValue())
                .append("order", getOrder())
                .append("status", getStatus())
                .append("type", getType())
                .toString();
    }
}
