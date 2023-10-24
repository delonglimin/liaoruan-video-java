package com.ruoyi.video.service;

import java.util.List;
import java.util.Map;

import com.ruoyi.video.domain.MovieLevel;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2023-10-24
 */
public interface IMovieLevelService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public MovieLevel selectMovieLevelById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param movieLevel 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<MovieLevel> selectMovieLevelList(MovieLevel movieLevel);

    public List<Map> selectMovieLevelListOwn(MovieLevel movieLevel);

    /**
     * 新增【请填写功能名称】
     *
     * @param movieLevel 【请填写功能名称】
     * @return 结果
     */
    public int insertMovieLevel(MovieLevel movieLevel);

    /**
     * 修改【请填写功能名称】
     *
     * @param movieLevel 【请填写功能名称】
     * @return 结果
     */
    public int updateMovieLevel(MovieLevel movieLevel);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteMovieLevelByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteMovieLevelById(Long id);
}
