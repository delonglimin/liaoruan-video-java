package com.ruoyi.video.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 影视视频对象 movie_videos
 *
 * @author ruoyi
 * @date 2023-10-24
 */
public class MovieVideos extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long version;

    /** $column.columnComment */
    private Long id;

    /** 封面 */
    @Excel(name = "封面")
    private String cover;

    /** 排序 */
    @Excel(name = "排序")
    private Long sort;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 关联的影视id */
    @Excel(name = "关联的影视id")
    private Long movieId;

    /** 分类Id */
    @Excel(name = "分类Id")
    private String typeId;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long movieIdId;

    /** 关联的视频 */
    @Excel(name = "关联的视频")
    private Long videoId;

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
    public void setCover(String cover)
    {
        this.cover = cover;
    }

    public String getCover()
    {
        return cover;
    }
    public void setSort(Long sort)
    {
        this.sort = sort;
    }

    public Long getSort()
    {
        return sort;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
    public void setMovieId(Long movieId)
    {
        this.movieId = movieId;
    }

    public Long getMovieId()
    {
        return movieId;
    }
    public void setTypeId(String typeId)
    {
        this.typeId = typeId;
    }

    public String getTypeId()
    {
        return typeId;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setMovieIdId(Long movieIdId)
    {
        this.movieIdId = movieIdId;
    }

    public Long getMovieIdId()
    {
        return movieIdId;
    }
    public void setVideoId(Long videoId)
    {
        this.videoId = videoId;
    }

    public Long getVideoId()
    {
        return videoId;
    }

    private Video video;

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
                .append("cover", getCover())
                .append("sort", getSort())
                .append("title", getTitle())
                .append("movieId", getMovieId())
                .append("typeId", getTypeId())
                .append("status", getStatus())
                .append("movieIdId", getMovieIdId())
                .append("videoId", getVideoId())
                .toString();
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
