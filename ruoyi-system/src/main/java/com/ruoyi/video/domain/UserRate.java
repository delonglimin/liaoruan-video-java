package com.ruoyi.video.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 评论对象 user_rate
 *
 * @author ruoyi
 * @date 2023-10-31
 */
public class UserRate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 影视id */
    @Excel(name = "影视id")
    private Long movieId;

    /** 评分 */
    @Excel(name = "评分")
    private Long rate;

    /** $column.columnComment */
    private Long id;

    /** 评论 */
    @Excel(name = "评论")
    private String coment;

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }
    public void setMovieId(Long movieId)
    {
        this.movieId = movieId;
    }

    public Long getMovieId()
    {
        return movieId;
    }
    public void setRate(Long rate)
    {
        this.rate = rate;
    }

    public Long getRate()
    {
        return rate;
    }
    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setComent(String coment)
    {
        this.coment = coment;
    }

    public String getComent()
    {
        return coment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("userId", getUserId())
                .append("movieId", getMovieId())
                .append("rate", getRate())
                .append("id", getId())
                .append("coment", getComent())
                .toString();
    }
}
