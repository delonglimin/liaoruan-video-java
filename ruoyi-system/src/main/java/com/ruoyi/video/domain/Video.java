package com.ruoyi.video.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 视频管理对象 video
 *
 * @author ruoyi
 * @date 2023-10-23
 */
public class Video extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long version;

    /** $column.columnComment */
    private Long id;

    /** 视频地址 */
    @Excel(name = "视频地址")
    private String url;

    /** 视频高 */
    @Excel(name = "视频高")
    private Long height;

    /** 视频宽 */
    @Excel(name = "视频宽")
    private Long width;

    /** 封面地址 */
    @Excel(name = "封面地址")
    private String poster;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 视频文件名 */
    @Excel(name = "视频文件名")
    private String name;

    /** 视频存放路径 */
    @Excel(name = "视频存放路径")
    private String path;

    /** 视频时长 */
    @Excel(name = "视频时长")
    private Long duration;

    /** 大小 */
    @Excel(name = "大小")
    private Long size;

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
    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getUrl()
    {
        return url;
    }
    public void setHeight(Long height)
    {
        this.height = height;
    }

    public Long getHeight()
    {
        return height;
    }
    public void setWidth(Long width)
    {
        this.width = width;
    }

    public Long getWidth()
    {
        return width;
    }
    public void setPoster(String poster)
    {
        this.poster = poster;
    }

    public String getPoster()
    {
        return poster;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setPath(String path)
    {
        this.path = path;
    }

    public String getPath()
    {
        return path;
    }
    public void setDuration(Long duration)
    {
        this.duration = duration;
    }

    public Long getDuration()
    {
        return duration;
    }
    public void setSize(Long size)
    {
        this.size = size;
    }

    public Long getSize()
    {
        return size;
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
                .append("url", getUrl())
                .append("height", getHeight())
                .append("width", getWidth())
                .append("poster", getPoster())
                .append("title", getTitle())
                .append("name", getName())
                .append("path", getPath())
                .append("duration", getDuration())
                .append("size", getSize())
                .toString();
    }
}
