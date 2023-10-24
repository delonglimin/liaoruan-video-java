package com.ruoyi.video.mapper;

import java.util.List;
import com.ruoyi.video.domain.BasicLevel;
import com.ruoyi.video.domain.BasicCountry;

/**
 * 基础数据-家长引导Mapper接口
 *
 * @author ruoyi
 * @date 2023-10-20
 */
public interface BasicLevelMapper
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
     * 删除基础数据-家长引导
     *
     * @param id 基础数据-家长引导主键
     * @return 结果
     */
    public int deleteBasicLevelById(Long id);

    /**
     * 批量删除基础数据-家长引导
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBasicLevelByIds(Long[] ids);

    /**
     * 批量删除国家管理
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBasicCountryByIds(Long[] ids);

    /**
     * 批量新增国家管理
     *
     * @param basicCountryList 国家管理列表
     * @return 结果
     */
    public int batchBasicCountry(List<BasicCountry> basicCountryList);


    /**
     * 通过基础数据-家长引导主键删除国家管理信息
     *
     * @param id 基础数据-家长引导ID
     * @return 结果
     */
    public int deleteBasicCountryById(Long id);
}
