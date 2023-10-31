package com.ruoyi.video.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 影视对象 movie_basic
 *
 * @author ruoyi
 * @date 2023-10-23
 */
public class MovieBasic extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long version;

    /** $column.columnComment */
    private Long id;

    /** 状态： -9: 处理中 -8: 待完善 -7: 待审核 -1: 隐藏 0: 正常 1: 锁定 */
    @Excel(name = "状态： -9: 处理中 -8: 待完善 -7: 待审核 -1: 隐藏 0: 正常 1: 锁定")
    private Long status;

    /** 上映状态: 0: 无 1: 即将上映 2: 正在热映 */
    @Excel(name = "上映状态: 0: 无 1: 即将上映 2: 正在热映")
    private Long releaseStatus;

    /** 中文名 */
    @Excel(name = "中文名")
    private String title;

    /** 背景色 */
    @Excel(name = "背景色")
    private String bgColor;

    /** 英文名 */
    @Excel(name = "英文名")
    private String titleEn;

    /** 影视原名 */
    @Excel(name = "影视原名")
    private String titleOriginal;

    /** 别名 */
    @Excel(name = "别名")
    private String akas;

    /** 所属类型 */
    @Excel(name = "所属类型")
    private String genres;

    /** 首映时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "首映时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date pubdate;

    /** 上映版片长 */
    @Excel(name = "上映版片长")
    private String duration;

    /** 银幕 */
    @Excel(name = "银幕")
    private String versions;

    /** 片长 */
    @Excel(name = "片长")
    private String durations;

    /** 彩蛋个数 */
    @Excel(name = "彩蛋个数")
    private Long eggHunt;

    /** 色彩 0: 彩色  1：黑白 */
    @Excel(name = "色彩 0: 彩色  1：黑白")
    private Long color;

    /** 总季数 */
    @Excel(name = "总季数")
    private Long seasonCount;

    /** 当前季 */
    @Excel(name = "当前季")
    private Long currentSeason;

    /** 总集数 */
    @Excel(name = "总集数")
    private Long episodeCount;

    /** 当前集数 */
    @Excel(name = "当前集数")
    private Long currentEpisode;

    /** 是否完结 0：否  1：是 */
    @Excel(name = "是否完结 0：否  1：是")
    private Long theEnd;

    /** 国家/地区 */
    @Excel(name = "国家/地区")
    private String countryIds;

    /** 语言 */
    @Excel(name = "语言")
    private String languages;

    /** 标签 */
    @Excel(name = "标签")
    private String tags;

    /** 简介 */
    @Excel(name = "简介")
    private String summary;

    /** 年代 */
    @Excel(name = "年代")
    private Long year;

    /** 海报 */
    @Excel(name = "海报")
    private String poster;

    /** 上映日期 */
    @Excel(name = "上映日期")
    private String releaseDate;

    /** 影视分类 */
    @Excel(name = "影视分类")
    private String columnValue;

    /** 是否付费 */
    @Excel(name = "是否付费")
    private Long isPay;

    /** 视频数量 */
    @Excel(name = "视频数量")
    private Long movieVideosCount;
    /** 收藏数量 */
    @Excel(name = "收藏数量")
    private Long userCollectsCount;



    /** 所需价格 */
    @Excel(name = "所需价格")
    private Long paymentAmount;


    /** 免费时长 */
    @Excel(name = "免费时长")
    private Long freeDuration;


    private List country;

    /**
     * 评分信息
     */
    private HashMap movieRate;



    public Long getFreeDuration() {
        return freeDuration;
    }

    public void setFreeDuration(Long freeDuration) {
        this.freeDuration = freeDuration;
    }

    public Long getMovieVideosCount() {
        return movieVideosCount;
    }

    public void setMovieVideosCount(Long movieVideosCount) {
        this.movieVideosCount = movieVideosCount;
    }

    public Long getUserCollectsCount() {
        return userCollectsCount;
    }

    public void setUserCollectsCount(Long userCollectsCount) {
        this.userCollectsCount = userCollectsCount;
    }




    public Long getIsPay() {
        return isPay;
    }

    public void setIsPay(Long isPay) {
        this.isPay = isPay;
    }

    public Long getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Long paymentAmount) {
        this.paymentAmount = paymentAmount;
    }



    public HashMap getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(HashMap movieRate) {
        this.movieRate = movieRate;
    }

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
    public void setStatus(Long status)
    {
        this.status = status;
    }

    public Long getStatus()
    {
        return status;
    }
    public void setReleaseStatus(Long releaseStatus)
    {
        this.releaseStatus = releaseStatus;
    }

    public Long getReleaseStatus()
    {
        return releaseStatus;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
    public void setBgColor(String bgColor)
    {
        this.bgColor = bgColor;
    }

    public String getBgColor()
    {
        return bgColor;
    }
    public void setTitleEn(String titleEn)
    {
        this.titleEn = titleEn;
    }

    public String getTitleEn()
    {
        return titleEn;
    }
    public void setTitleOriginal(String titleOriginal)
    {
        this.titleOriginal = titleOriginal;
    }

    public String getTitleOriginal()
    {
        return titleOriginal;
    }
    public void setAkas(String akas)
    {
        this.akas = akas;
    }

    public String getAkas()
    {
        return akas;
    }
    public void setGenres(String genres)
    {
        this.genres = genres;
    }

    public String getGenres()
    {
        return genres;
    }
    public void setPubdate(Date pubdate)
    {
        this.pubdate = pubdate;
    }

    public Date getPubdate()
    {
        return pubdate;
    }
    public void setDuration(String duration)
    {
        this.duration = duration;
    }

    public String getDuration()
    {
        return duration;
    }
    public void setVersions(String versions)
    {
        this.versions = versions;
    }

    public String getVersions()
    {
        return versions;
    }
    public void setDurations(String durations)
    {
        this.durations = durations;
    }

    public String getDurations()
    {
        return durations;
    }
    public void setEggHunt(Long eggHunt)
    {
        this.eggHunt = eggHunt;
    }

    public Long getEggHunt()
    {
        return eggHunt;
    }
    public void setColor(Long color)
    {
        this.color = color;
    }

    public Long getColor()
    {
        return color;
    }
    public void setSeasonCount(Long seasonCount)
    {
        this.seasonCount = seasonCount;
    }

    public Long getSeasonCount()
    {
        return seasonCount;
    }
    public void setCurrentSeason(Long currentSeason)
    {
        this.currentSeason = currentSeason;
    }

    public Long getCurrentSeason()
    {
        return currentSeason;
    }
    public void setEpisodeCount(Long episodeCount)
    {
        this.episodeCount = episodeCount;
    }

    public Long getEpisodeCount()
    {
        return episodeCount;
    }
    public void setCurrentEpisode(Long currentEpisode)
    {
        this.currentEpisode = currentEpisode;
    }

    public Long getCurrentEpisode()
    {
        return currentEpisode;
    }
    public void setTheEnd(Long theEnd)
    {
        this.theEnd = theEnd;
    }

    public Long getTheEnd()
    {
        return theEnd;
    }
    public void setCountryIds(String countryIds)
    {
        this.countryIds = countryIds;
    }

    public String getCountryIds()
    {
        return countryIds;
    }
    public void setLanguages(String languages)
    {
        this.languages = languages;
    }

    public String getLanguages()
    {
        return languages;
    }
    public void setTags(String tags)
    {
        this.tags = tags;
    }

    public String getTags()
    {
        return tags;
    }
    public void setSummary(String summary)
    {
        this.summary = summary;
    }

    public String getSummary()
    {
        return summary;
    }
    public void setYear(Long year)
    {
        this.year = year;
    }

    public Long getYear()
    {
        return year;
    }
    public void setPoster(String poster)
    {
        this.poster = poster;
    }

    public String getPoster()
    {
        return poster;
    }
    public void setReleaseDate(String releaseDate)
    {
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate()
    {
        return releaseDate;
    }
    public void setColumnValue(String columnValue)
    {
        this.columnValue = columnValue;
    }

    public String getColumnValue()
    {
        return columnValue;
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
                .append("status", getStatus())
                .append("releaseStatus", getReleaseStatus())
                .append("title", getTitle())
                .append("bgColor", getBgColor())
                .append("titleEn", getTitleEn())
                .append("titleOriginal", getTitleOriginal())
                .append("akas", getAkas())
                .append("genres", getGenres())
                .append("pubdate", getPubdate())
                .append("duration", getDuration())
                .append("versions", getVersions())
                .append("durations", getDurations())
                .append("eggHunt", getEggHunt())
                .append("color", getColor())
                .append("seasonCount", getSeasonCount())
                .append("currentSeason", getCurrentSeason())
                .append("episodeCount", getEpisodeCount())
                .append("currentEpisode", getCurrentEpisode())
                .append("theEnd", getTheEnd())
                .append("countryIds", getCountryIds())
                .append("languages", getLanguages())
                .append("tags", getTags())
                .append("summary", getSummary())
                .append("year", getYear())
                .append("poster", getPoster())
                .append("releaseDate", getReleaseDate())
                .append("columnValue", getColumnValue())
                .toString();
    }

    public List getCountry() {
        return country;
    }

    public void setCountry(List country) {
        this.country = country;
    }
}
