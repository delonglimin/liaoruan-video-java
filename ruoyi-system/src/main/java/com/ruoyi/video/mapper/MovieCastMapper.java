package com.ruoyi.video.mapper;

import java.util.List;
import java.util.Map;

import com.ruoyi.video.domain.MovieCast;

/**
 * movie castMapper接口
 *
 * @author ruoyi
 * @date 2023-10-24
 */
public interface MovieCastMapper
{
    /**
     * 查询movie cast
     *
     * @param id movie cast主键
     * @return movie cast
     */
    public MovieCast selectMovieCastById(Long id);

    /**
     * 查询movie cast列表
     *
     * @param movieCast movie cast
     * @return movie cast集合
     */
    public List<MovieCast> selectMovieCastList(MovieCast movieCast);
    public List<Map> selectMovieCastListMap(MovieCast movieCast);

    /**
     * 新增movie cast
     *
     * @param movieCast movie cast
     * @return 结果
     */
    public int insertMovieCast(MovieCast movieCast);

    /**
     * 修改movie cast
     *
     * @param movieCast movie cast
     * @return 结果
     */
    public int updateMovieCast(MovieCast movieCast);

    /**
     * 删除movie cast
     *
     * @param id movie cast主键
     * @return 结果
     */
    public int deleteMovieCastById(Long id);

    /**
     * 批量删除movie cast
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMovieCastByIds(Long[] ids);
}
