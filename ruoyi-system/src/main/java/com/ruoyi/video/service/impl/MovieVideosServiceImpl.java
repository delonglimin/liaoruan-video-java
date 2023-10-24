package com.ruoyi.video.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.MovieVideosMapper;
import com.ruoyi.video.domain.MovieVideos;
import com.ruoyi.video.service.IMovieVideosService;

/**
 * 影视视频Service业务层处理
 *
 * @author ruoyi
 * @date 2023-10-24
 */
@Service
public class MovieVideosServiceImpl implements IMovieVideosService
{
    @Autowired
    private MovieVideosMapper movieVideosMapper;

    /**
     * 查询影视视频
     *
     * @param id 影视视频主键
     * @return 影视视频
     */
    @Override
    public MovieVideos selectMovieVideosById(Long id)
    {
        return movieVideosMapper.selectMovieVideosById(id);
    }

    /**
     * 查询影视视频列表
     *
     * @param movieVideos 影视视频
     * @return 影视视频
     */
    @Override
    public List<MovieVideos> selectMovieVideosList(MovieVideos movieVideos)
    {
        return movieVideosMapper.selectMovieVideosList(movieVideos);
    }

    /**
     * 新增影视视频
     *
     * @param movieVideos 影视视频
     * @return 结果
     */
    @Override
    public int insertMovieVideos(MovieVideos movieVideos)
    {
        movieVideos.setCreateTime(DateUtils.getNowDate());
        return movieVideosMapper.insertMovieVideos(movieVideos);
    }

    /**
     * 修改影视视频
     *
     * @param movieVideos 影视视频
     * @return 结果
     */
    @Override
    public int updateMovieVideos(MovieVideos movieVideos)
    {
        movieVideos.setUpdateTime(DateUtils.getNowDate());
        return movieVideosMapper.updateMovieVideos(movieVideos);
    }

    /**
     * 批量删除影视视频
     *
     * @param ids 需要删除的影视视频主键
     * @return 结果
     */
    @Override
    public int deleteMovieVideosByIds(Long[] ids)
    {
        return movieVideosMapper.deleteMovieVideosByIds(ids);
    }

    /**
     * 删除影视视频信息
     *
     * @param id 影视视频主键
     * @return 结果
     */
    @Override
    public int deleteMovieVideosById(Long id)
    {
        return movieVideosMapper.deleteMovieVideosById(id);
    }
}
