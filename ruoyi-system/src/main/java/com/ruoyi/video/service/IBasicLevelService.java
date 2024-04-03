package com.ruoyi.video.service;

import java.util.List;
import com.ruoyi.video.domain.BasicLevel;

/**
 * 基础数据-家长引导Service接口
 *
 * @author ruoyi
 * @date 2023-10-20
 */
public interface IBasicLevelService
{
    /**
     * 查询基础数据-家长引导
     *
     * @param id 基础数据-家长引导主键
     * @return 基础数据-家长引导
     */
    public BasicLevel selectBasicLevelById(Long id);

    /**
     * 查询基础数据-家长引导列表
     *
     * @param basicLevel 基础数据-家长引导
     * @return 基础数据-家长引导集合
     */
    public List<BasicLevel> selectBasicLevelList(BasicLevel basicLevel);

    /**
     * 新增基础数据-家长引导
     *
     * @param basicLevel 基础数据-家长引导
     * @return 结果
     */
    public int insertBasicLevel(BasicLevel basicLevel);

    /**
     * 修改基础数据-家长引导
     *
     * @param basicLevel 基础数据-家长引导
     * @return 结果
     */
    public int updateBasicLevel(BasicLevel basicLevel);

    /**
     * 批量删除基础数据-家长引导
     *
     * @param ids 需要删除的基础数据-家长引导主键集合
     * @return 结果
     */
    public int deleteBasicLevelByIds(Long[] ids);

    /**
     * 删除基础数据-家长引导信息
     *
     * @param id 基础数据-家长引导主键
     * @return 结果
     */
    public int deleteBasicLevelById(Long id);
}
