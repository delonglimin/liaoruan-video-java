package com.ruoyi.video.mapper;

import java.util.List;
import com.ruoyi.video.domain.Columns;

/**
 * 栏目管理Mapper接口
 *
 * @author ruoyi
 * @date 2023-10-12
 */
public interface ColumnsMapper
{
    /**
     * 查询栏目管理
     *
     * @param id 栏目管理主键
     * @return 栏目管理
     */
    public Columns selectColumnsById(Long id);

    /**
     * 查询栏目管理列表
     *
     * @param columns 栏目管理
     * @return 栏目管理集合
     */
    public List<Columns> selectColumnsList(Columns columns);

    /**
     * 新增栏目管理
     *
     * @param columns 栏目管理
     * @return 结果
     */
    public int insertColumns(Columns columns);

    /**
     * 修改栏目管理
     *
     * @param columns 栏目管理
     * @return 结果
     */
    public int updateColumns(Columns columns);

    /**
     * 删除栏目管理
     *
     * @param id 栏目管理主键
     * @return 结果
     */
    public int deleteColumnsById(Long id);

    /**
     * 批量删除栏目管理
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteColumnsByIds(Long[] ids);
}
