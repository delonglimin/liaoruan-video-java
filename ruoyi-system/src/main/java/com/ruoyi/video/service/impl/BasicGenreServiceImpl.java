package com.ruoyi.video.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.BasicGenreMapper;
import com.ruoyi.video.domain.BasicGenre;
import com.ruoyi.video.service.IBasicGenreService;

/**
 * 基础数据-类型管理Service业务层处理
 *
 * @author ruoyi
 * @date 2023-10-17
 */
@Service
public class BasicGenreServiceImpl implements IBasicGenreService
{
    @Autowired
    private BasicGenreMapper basicGenreMapper;

    /**
     * 查询基础数据-类型管理
     *
     * @param id 基础数据-类型管理主键
     * @return 基础数据-类型管理
     */
    @Override
    public BasicGenre selectBasicGenreById(Long id)
    {
        return basicGenreMapper.selectBasicGenreById(id);
    }

    /**
     * 查询基础数据-类型管理列表
     *
     * @param basicGenre 基础数据-类型管理
     * @return 基础数据-类型管理
     */
    @Override
    public List<BasicGenre> selectBasicGenreList(BasicGenre basicGenre)
    {
        return basicGenreMapper.selectBasicGenreList(basicGenre);
    }

    /**
     * 新增基础数据-类型管理
     *
     * @param basicGenre 基础数据-类型管理
     * @return 结果
     */
    @Override
    public int insertBasicGenre(BasicGenre basicGenre)
    {
        basicGenre.setCreateTime(DateUtils.getNowDate());
        return basicGenreMapper.insertBasicGenre(basicGenre);
    }

    /**
     * 修改基础数据-类型管理
     *
     * @param basicGenre 基础数据-类型管理
     * @return 结果
     */
    @Override
    public int updateBasicGenre(BasicGenre basicGenre)
    {
        basicGenre.setUpdateTime(DateUtils.getNowDate());
        return basicGenreMapper.updateBasicGenre(basicGenre);
    }

    /**
     * 批量删除基础数据-类型管理
     *
     * @param ids 需要删除的基础数据-类型管理主键
     * @return 结果
     */
    @Override
    public int deleteBasicGenreByIds(Long[] ids)
    {
        return basicGenreMapper.deleteBasicGenreByIds(ids);
    }

    /**
     * 删除基础数据-类型管理信息
     *
     * @param id 基础数据-类型管理主键
     * @return 结果
     */
    @Override
    public int deleteBasicGenreById(Long id)
    {
        return basicGenreMapper.deleteBasicGenreById(id);
    }
}
