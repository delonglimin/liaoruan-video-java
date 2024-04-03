package com.ruoyi.video.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.MoviePubDateMapper;
import com.ruoyi.video.domain.MoviePubDate;
import com.ruoyi.video.service.IMoviePubDateService;

/**
 * 上映时间Service业务层处理
 *
 * @author ruoyi
 * @date 2023-10-24
 */
@Service
public class MoviePubDateServiceImpl implements IMoviePubDateService
{
    @Autowired
    private MoviePubDateMapper moviePubDateMapper;

    /**
     * 查询上映时间
     *
     * @param id 上映时间主键
     * @return 上映时间
     */
    @Override
    public MoviePubDate selectMoviePubDateById(Long id)
    {
        return moviePubDateMapper.selectMoviePubDateById(id);
    }

    /**
     * 查询上映时间列表
     *
     * @param moviePubDate 上映时间
     * @return 上映时间
     */
    @Override
    public List<MoviePubDate> selectMoviePubDateList(MoviePubDate moviePubDate)
    {
        return moviePubDateMapper.selectMoviePubDateList(moviePubDate);
    }

    /**
     * 新增上映时间
     *
     * @param moviePubDate 上映时间
     * @return 结果
     */
    @Override
    public int insertMoviePubDate(MoviePubDate moviePubDate)
    {
        moviePubDate.setCreateTime(DateUtils.getNowDate());
        return moviePubDateMapper.insertMoviePubDate(moviePubDate);
    }

    /**
     * 修改上映时间
     *
     * @param moviePubDate 上映时间
     * @return 结果
     */
    @Override
    public int updateMoviePubDate(MoviePubDate moviePubDate)
    {
        moviePubDate.setUpdateTime(DateUtils.getNowDate());
        return moviePubDateMapper.updateMoviePubDate(moviePubDate);
    }

    /**
     * 批量删除上映时间
     *
     * @param ids 需要删除的上映时间主键
     * @return 结果
     */
    @Override
    public int deleteMoviePubDateByIds(Long[] ids)
    {
        return moviePubDateMapper.deleteMoviePubDateByIds(ids);
    }

    /**
     * 删除上映时间信息
     *
     * @param id 上映时间主键
     * @return 结果
     */
    @Override
    public int deleteMoviePubDateById(Long id)
    {
        return moviePubDateMapper.deleteMoviePubDateById(id);
    }
}
