package com.ruoyi.video.service;

import java.util.List;
import com.ruoyi.video.domain.MovieVideos;

/**
 * 影视视频Service接口
 *
 * @author ruoyi
 * @date 2023-10-24
 */
public interface IMovieVideosService
{
    /**
     * 查询影视视频
     *
     * @param id 影视视频主键
     * @return 影视视频
     */
    public MovieVideos selectMovieVideosById(Long id);

    /**
     * 查询影视视频列表
     *
     * @param movieVideos 影视视频
     * @return 影视视频集合
     */
    public List<MovieVideos> selectMovieVideosList(MovieVideos movieVideos);

    /**
     * 新增影视视频
     *
     * @param movieVideos 影视视频
     * @return 结果
     */
    public int insertMovieVideos(MovieVideos movieVideos);

    /**
     * 修改影视视频
     *
     * @param movieVideos 影视视频
     * @return 结果
     */
    public int updateMovieVideos(MovieVideos movieVideos);

    /**
     * 批量删除影视视频
     *
     * @param ids 需要删除的影视视频主键集合
     * @return 结果
     */
    public int deleteMovieVideosByIds(Long[] ids);

    /**
     * 删除影视视频信息
     *
     * @param id 影视视频主键
     * @return 结果
     */
    public int deleteMovieVideosById(Long id);
}
