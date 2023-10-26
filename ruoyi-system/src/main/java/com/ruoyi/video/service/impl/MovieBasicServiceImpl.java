package com.ruoyi.video.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.MovieBasicMapper;
import com.ruoyi.video.domain.MovieBasic;
import com.ruoyi.video.service.IMovieBasicService;

/**
 * 影视Service业务层处理
 *
 * @author ruoyi
 * @date 2023-10-23
 */
@Service
public class MovieBasicServiceImpl implements IMovieBasicService
{
    @Autowired
    private MovieBasicMapper movieBasicMapper;

    /**
     * 查询影视
     *
     * @param id 影视主键
     * @return 影视
     */
    @Override
    public MovieBasic selectMovieBasicById(Long id)
    {
        return movieBasicMapper.selectMovieBasicById(id);
    }

    /**
     * 查询影视列表
     *
     * @param movieBasic 影视
     * @return 影视
     */
    @Override
    public List<MovieBasic> selectMovieBasicList(MovieBasic movieBasic)
    {
        return movieBasicMapper.selectMovieBasicList(movieBasic);
    }

    /**
     * 新增影视
     *
     * @param movieBasic 影视
     * @return 结果
     */
    @Override
    public int insertMovieBasic(MovieBasic movieBasic)
    {
        movieBasic.setCreateTime(DateUtils.getNowDate());
        return movieBasicMapper.insertMovieBasic(movieBasic);
    }

    /**
     * 修改影视
     *
     * @param movieBasic 影视
     * @return 结果
     */
    @Override
    public int updateMovieBasic(MovieBasic movieBasic)
    {
        movieBasic.setUpdateTime(DateUtils.getNowDate());
        return movieBasicMapper.updateMovieBasic(movieBasic);
    }

    /**
     * 批量删除影视
     *
     * @param ids 需要删除的影视主键
     * @return 结果
     */
    @Override
    public int deleteMovieBasicByIds(Long[] ids)
    {
        return movieBasicMapper.deleteMovieBasicByIds(ids);
    }

    /**
     * 删除影视信息
     *
     * @param id 影视主键
     * @return 结果
     */
    @Override
    public int deleteMovieBasicById(Long id)
    {
        return movieBasicMapper.deleteMovieBasicById(id);
    }
}
