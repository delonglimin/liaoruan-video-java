package com.ruoyi.video.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * movie cast对象 movie_cast
 *
 * @author ruoyi
 * @date 2023-10-24
 */
public class MovieCast extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long version;

    /** $column.columnComment */
    private Long id;

    /** 关联的影视id */
    @Excel(name = "关联的影视id")
    private Long movieId;

    /** 关联的影人id */
    @Excel(name = "关联的影人id")
    private Long actorId;

    /** 影人类型id */
    @Excel(name = "影人类型id")
    private Long professionId;

    /** 饰演角色 */
    @Excel(name = "饰演角色")
    private String role;

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
    public void setMovieId(Long movieId)
    {
        this.movieId = movieId;
    }

    public Long getMovieId()
    {
        return movieId;
    }
    public void setActorId(Long actorId)
    {
        this.actorId = actorId;
    }

    public Long getActorId()
    {
        return actorId;
    }
    public void setProfessionId(Long professionId)
    {
        this.professionId = professionId;
    }

    public Long getProfessionId()
    {
        return professionId;
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
                .append("movieId", getMovieId())
                .append("actorId", getActorId())
                .append("professionId", getProfessionId())
                .toString();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
