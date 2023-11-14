package com.ruoyi.video.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.MoviePvMapper;
import com.ruoyi.video.domain.MoviePv;
import com.ruoyi.video.service.IMoviePvService;

/**
 * pvService业务层处理
 *
 * @author ruoyi
 * @date 2023-11-14
 */
@Service
public class MoviePvServiceImpl implements IMoviePvService
{
    @Autowired
    private MoviePvMapper moviePvMapper;

    /**
     * 查询pv
     *
     * @param id pv主键
     * @return pv
     */
    @Override
    public MoviePv selectMoviePvById(Long id)
    {
        return moviePvMapper.selectMoviePvById(id);
    }

    /**
     * 查询pv列表
     *
     * @param moviePv pv
     * @return pv
     */
    @Override
    public List<MoviePv> selectMoviePvList(MoviePv moviePv)
    {
        return moviePvMapper.selectMoviePvList(moviePv);
    }

    /**
     * 新增pv
     *
     * @param moviePv pv
     * @return 结果
     */
    @Override
    public int insertMoviePv(MoviePv moviePv)
    {
        moviePv.setCreateTime(DateUtils.getNowDate());
        return moviePvMapper.insertMoviePv(moviePv);
    }

    /**
     * 修改pv
     *
     * @param moviePv pv
     * @return 结果
     */
    @Override
    public int updateMoviePv(MoviePv moviePv)
    {
        moviePv.setUpdateTime(DateUtils.getNowDate());
        return moviePvMapper.updateMoviePv(moviePv);
    }

    /**
     * 批量删除pv
     *
     * @param ids 需要删除的pv主键
     * @return 结果
     */
    @Override
    public int deleteMoviePvByIds(Long[] ids)
    {
        return moviePvMapper.deleteMoviePvByIds(ids);
    }

    /**
     * 删除pv信息
     *
     * @param id pv主键
     * @return 结果
     */
    @Override
    public int deleteMoviePvById(Long id)
    {
        return moviePvMapper.deleteMoviePvById(id);
    }
}
