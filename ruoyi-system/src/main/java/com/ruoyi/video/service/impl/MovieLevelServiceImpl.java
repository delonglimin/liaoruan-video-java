package com.ruoyi.video.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.video.domain.BasicCountry;
import com.ruoyi.video.domain.BasicLevel;
import com.ruoyi.video.mapper.BasicCountryMapper;
import com.ruoyi.video.mapper.BasicLevelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.MovieLevelMapper;
import com.ruoyi.video.domain.MovieLevel;
import com.ruoyi.video.service.IMovieLevelService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2023-10-24
 */
@Service
public class MovieLevelServiceImpl implements IMovieLevelService
{
    @Autowired
    private MovieLevelMapper movieLevelMapper;

    @Autowired
    private BasicLevelMapper basicLevelMapper;

    @Autowired
    private BasicCountryMapper basicCountryMapper;
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public MovieLevel selectMovieLevelById(Long id)
    {
        return movieLevelMapper.selectMovieLevelById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param movieLevel 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<MovieLevel> selectMovieLevelList(MovieLevel movieLevel)
    {
       return  movieLevelMapper.selectMovieLevelList(movieLevel);
    }

    @Override
    public List<Map> selectMovieLevelListOwn(MovieLevel movieLevel) {
        List<MovieLevel> l = movieLevelMapper.selectMovieLevelList(movieLevel);
        List<Map> res = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            MovieLevel temp = l.get(i);
            BasicLevel bl = basicLevelMapper.selectBasicLevelById(temp.getLevelId());
            Map item = new HashMap();
            item.put("countryName",bl.getCountry().getName());
            item.put("level",bl.getLevel());
            item.put("levelZh",bl.getLevelZh());
            item.put("descript",bl.getDescript());
            res.add(item);
        }

        return res;
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param movieLevel 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertMovieLevel(MovieLevel movieLevel)
    {
        movieLevel.setCreateTime(DateUtils.getNowDate());
        return movieLevelMapper.insertMovieLevel(movieLevel);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param movieLevel 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateMovieLevel(MovieLevel movieLevel)
    {
        movieLevel.setUpdateTime(DateUtils.getNowDate());
        return movieLevelMapper.updateMovieLevel(movieLevel);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMovieLevelByIds(Long[] ids)
    {
        return movieLevelMapper.deleteMovieLevelByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMovieLevelById(Long id)
    {
        return movieLevelMapper.deleteMovieLevelById(id);
    }
}
