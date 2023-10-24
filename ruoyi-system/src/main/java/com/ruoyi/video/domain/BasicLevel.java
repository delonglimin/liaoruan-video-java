package com.ruoyi.video.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 基础数据-家长引导对象 basic_level
 *
 * @author ruoyi
 * @date 2023-10-20
 */
public class BasicLevel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 国家Id */
    @Excel(name = "国家Id")
    private Long countryId;

    /** 家长引导 */
    @Excel(name = "家长引导")
    private String level;

    /** 引导中文 */
    @Excel(name = "引导中文")
    private String levelZh;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long version;

    /** 状态 */
    @Excel(name = "状态")
    private Long status;

    /** 引导模板 */
    @Excel(name = "引导模板")
    private String descript;

    /** 国家管理信息 */
    private BasicCountry country;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setCountryId(Long countryId)
    {
        this.countryId = countryId;
    }

    public Long getCountryId()
    {
        return countryId;
    }
    public void setLevel(String level)
    {
        this.level = level;
    }

    public String getLevel()
    {
        return level;
    }
    public void setLevelZh(String levelZh)
    {
        this.levelZh = levelZh;
    }

    public String getLevelZh()
    {
        return levelZh;
    }
    public void setVersion(Long version)
    {
        this.version = version;
    }

    public Long getVersion()
    {
        return version;
    }
    public void setStatus(Long status)
    {
        this.status = status;
    }

    public Long getStatus()
    {
        return status;
    }
    public void setDescript(String descript)
    {
        this.descript = descript;
    }

    public String getDescript()
    {
        return descript;
    }

    public BasicCountry getCountry()
    {
        return country;
    }

    public void setCountry(BasicCountry basicCountry)
    {
        this.country = basicCountry;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("countryId", getCountryId())
                .append("level", getLevel())
                .append("levelZh", getLevelZh())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .append("createBy", getCreateBy())
                .append("updateBy", getUpdateBy())
                .append("remark", getRemark())
                .append("version", getVersion())
                .append("status", getStatus())
                .append("descript", getDescript())
                .append("basicCountry", getCountry())
                .toString();
    }
}
