package com.ruoyi.video.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.MovieCastMapper;
import com.ruoyi.video.domain.MovieCast;
import com.ruoyi.video.service.IMovieCastService;

/**
 * movie castService业务层处理
 *
 * @author ruoyi
 * @date 2023-10-24
 */
@Service
public class MovieCastServiceImpl implements IMovieCastService
{
    @Autowired
    private MovieCastMapper movieCastMapper;

    /**
     * 查询movie cast
     *
     * @param id movie cast主键
     * @return movie cast
     */
    @Override
    public MovieCast selectMovieCastById(Long id)
    {
        return movieCastMapper.selectMovieCastById(id);
    }

    @Override
    public List<MovieCast>  selectMovieCastListByMovieId(Long id) {
        return movieCastMapper.selectMovieCastListByMovieId(id);
    }

    /**
     * 查询movie cast列表
     *
     * @param movieCast movie cast
     * @return movie cast
     */
    @Override
    public List<MovieCast> selectMovieCastList(MovieCast movieCast)
    {
        return  movieCastMapper.selectMovieCastList(movieCast);
    }

    @Override
    public List<HashMap> selectMovieCastListMap(MovieCast movieCast) {
        return movieCastMapper.selectMovieCastListMap(movieCast);
    }

    /**
     * 新增movie cast
     *
     * @param movieCast movie cast
     * @return 结果
     */
    @Override
    public int insertMovieCast(MovieCast movieCast)
    {
        movieCast.setCreateTime(DateUtils.getNowDate());
        return movieCastMapper.insertMovieCast(movieCast);
    }

    /**
     * 修改movie cast
     *
     * @param movieCast movie cast
     * @return 结果
     */
    @Override
    public int updateMovieCast(MovieCast movieCast)
    {
        movieCast.setUpdateTime(DateUtils.getNowDate());
        return movieCastMapper.updateMovieCast(movieCast);
    }

    /**
     * 批量删除movie cast
     *
     * @param ids 需要删除的movie cast主键
     * @return 结果
     */
    @Override
    public int deleteMovieCastByIds(Long[] ids)
    {
        return movieCastMapper.deleteMovieCastByIds(ids);
    }

    /**
     * 删除movie cast信息
     *
     * @param id movie cast主键
     * @return 结果
     */
    @Override
    public int deleteMovieCastById(Long id)
    {
        return movieCastMapper.deleteMovieCastById(id);
    }
}
