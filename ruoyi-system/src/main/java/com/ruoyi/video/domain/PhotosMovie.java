package com.ruoyi.video.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 影视相册对象 photos_movie
 *
 * @author ruoyi
 * @date 2023-10-24
 */
public class PhotosMovie extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long version;

    /** $column.columnComment */
    private Long id;

    /** 图片 */
    @Excel(name = "图片")
    private String img;

    /** 图片类型 */
    @Excel(name = "图片类型")
    private String type;

    /** 图片宽度 */
    @Excel(name = "图片宽度")
    private Long imgWidth;

    /** 图片高度 */
    @Excel(name = "图片高度")
    private Long imgHeight;

    /** 图片大小 */
    @Excel(name = "图片大小")
    private Long imgSize;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 关联的影视id */
    @Excel(name = "关联的影视id")
    private Long movieId;

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
    public void setImg(String img)
    {
        this.img = img;
    }

    public String getImg()
    {
        return img;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    public void setImgWidth(Long imgWidth)
    {
        this.imgWidth = imgWidth;
    }

    public Long getImgWidth()
    {
        return imgWidth;
    }
    public void setImgHeight(Long imgHeight)
    {
        this.imgHeight = imgHeight;
    }

    public Long getImgHeight()
    {
        return imgHeight;
    }
    public void setImgSize(Long imgSize)
    {
        this.imgSize = imgSize;
    }

    public Long getImgSize()
    {
        return imgSize;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setDelFlag(String delFlag)
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag()
    {
        return delFlag;
    }
    public void setMovieId(Long movieId)
    {
        this.movieId = movieId;
    }

    public Long getMovieId()
    {
        return movieId;
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
                .append("img", getImg())
                .append("type", getType())
                .append("imgWidth", getImgWidth())
                .append("imgHeight", getImgHeight())
                .append("imgSize", getImgSize())
                .append("status", getStatus())
                .append("delFlag", getDelFlag())
                .append("movieId", getMovieId())
                .toString();
    }
}
