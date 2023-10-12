package com.ruoyi.video.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.ColumnsMapper;
import com.ruoyi.video.domain.Columns;
import com.ruoyi.video.service.IColumnsService;

/**
 * 栏目管理Service业务层处理
 *
 * @author ruoyi
 * @date 2023-10-12
 */
@Service
public class ColumnsServiceImpl implements IColumnsService
{
    @Autowired
    private ColumnsMapper columnsMapper;

    /**
     * 查询栏目管理
     *
     * @param id 栏目管理主键
     * @return 栏目管理
     */
    @Override
    public Columns selectColumnsById(Long id)
    {
        return columnsMapper.selectColumnsById(id);
    }

    /**
     * 查询栏目管理列表
     *
     * @param columns 栏目管理
     * @return 栏目管理
     */
    @Override
    public List<Columns> selectColumnsList(Columns columns)
    {
        return columnsMapper.selectColumnsList(columns);
    }

    /**
     * 新增栏目管理
     *
     * @param columns 栏目管理
     * @return 结果
     */
    @Override
    public int insertColumns(Columns columns)
    {
        columns.setCreateTime(DateUtils.getNowDate());
        return columnsMapper.insertColumns(columns);
    }

    /**
     * 修改栏目管理
     *
     * @param columns 栏目管理
     * @return 结果
     */
    @Override
    public int updateColumns(Columns columns)
    {
        columns.setUpdateTime(DateUtils.getNowDate());
        return columnsMapper.updateColumns(columns);
    }

    /**
     * 批量删除栏目管理
     *
     * @param ids 需要删除的栏目管理主键
     * @return 结果
     */
    @Override
    public int deleteColumnsByIds(Long[] ids)
    {
        return columnsMapper.deleteColumnsByIds(ids);
    }

    /**
     * 删除栏目管理信息
     *
     * @param id 栏目管理主键
     * @return 结果
     */
    @Override
    public int deleteColumnsById(Long id)
    {
        return columnsMapper.deleteColumnsById(id);
    }
}
