package com.ruoyi.video.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 上映时间对象 movie_pub_date
 *
 * @author ruoyi
 * @date 2023-10-24
 */
public class MoviePubDate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long version;

    /** $column.columnComment */
    private Long id;

    /** 上映日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上映日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date pubDate;

    /** 国家Id */
    @Excel(name = "国家Id")
    private Long countryId;

    /** 关联的影视id */
    @Excel(name = "关联的影视id")
    private Long movieId;

    /** 首映/重映 */
    @Excel(name = "首映/重映")
    private String premiere;

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
    public void setPubDate(Date pubDate)
    {
        this.pubDate = pubDate;
    }

    public Date getPubDate()
    {
        return pubDate;
    }
    public void setCountryId(Long countryId)
    {
        this.countryId = countryId;
    }

    public Long getCountryId()
    {
        return countryId;
    }
    public void setMovieId(Long movieId)
    {
        this.movieId = movieId;
    }

    public Long getMovieId()
    {
        return movieId;
    }
    public void setPremiere(String premiere)
    {
        this.premiere = premiere;
    }

    public String getPremiere()
    {
        return premiere;
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
                .append("pubDate", getPubDate())
                .append("countryId", getCountryId())
                .append("movieId", getMovieId())
                .append("premiere", getPremiere())
                .toString();
    }

    public BasicCountry getCountry() {
        return country;
    }

    public void setCountry(BasicCountry country) {
        this.country = country;
    }
}
