package com.ruoyi.video.service;

import java.util.List;
import com.ruoyi.video.domain.BasicGenre;

/**
 * 基础数据-类型管理Service接口
 *
 * @author ruoyi
 * @date 2023-10-17
 */
public interface IBasicGenreService
{
    /**
     * 查询基础数据-类型管理
     *
     * @param id 基础数据-类型管理主键
     * @return 基础数据-类型管理
     */
    public BasicGenre selectBasicGenreById(Long id);

    /**
     * 查询基础数据-类型管理列表
     *
     * @param basicGenre 基础数据-类型管理
     * @return 基础数据-类型管理集合
     */
    public List<BasicGenre> selectBasicGenreList(BasicGenre basicGenre);

    /**
     * 新增基础数据-类型管理
     *
     * @param basicGenre 基础数据-类型管理
     * @return 结果
     */
    public int insertBasicGenre(BasicGenre basicGenre);

    /**
     * 修改基础数据-类型管理
     *
     * @param basicGenre 基础数据-类型管理
     * @return 结果
     */
    public int updateBasicGenre(BasicGenre basicGenre);

    /**
     * 批量删除基础数据-类型管理
     *
     * @param ids 需要删除的基础数据-类型管理主键集合
     * @return 结果
     */
    public int deleteBasicGenreByIds(Long[] ids);

    /**
     * 删除基础数据-类型管理信息
     *
     * @param id 基础数据-类型管理主键
     * @return 结果
     */
    public int deleteBasicGenreById(Long id);
}
