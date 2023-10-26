package com.ruoyi.video.service;

import java.util.List;
import java.util.Map;

import com.ruoyi.video.domain.BasicCountry;

/**
 * 国家管理Service接口
 *
 * @author ruoyi
 * @date 2023-10-13
 */
public interface IBasicCountryService
{
    /**
     * 查询国家管理
     *
     * @param id 国家管理主键
     * @return 国家管理
     */
    public BasicCountry selectBasicCountryById(Long id);

    /**
     * 查询国家管理列表
     *
     * @param basicCountry 国家管理
     * @return 国家管理集合
     */
    public List<BasicCountry> selectBasicCountryList(BasicCountry basicCountry);


    /**
     * 查询国家管理列表
     *
     * @return 国家管理集合
     */
    public List<Map> selectBasicCountryListAndLevels();

    /**
     * 新增国家管理
     *
     * @param basicCountry 国家管理
     * @return 结果
     */
    public int insertBasicCountry(BasicCountry basicCountry);

    /**
     * 修改国家管理
     *
     * @param basicCountry 国家管理
     * @return 结果
     */
    public int updateBasicCountry(BasicCountry basicCountry);

    /**
     * 批量删除国家管理
     *
     * @param ids 需要删除的国家管理主键集合
     * @return 结果
     */
    public int deleteBasicCountryByIds(Long[] ids);

    /**
     * 删除国家管理信息
     *
     * @param id 国家管理主键
     * @return 结果
     */
    public int deleteBasicCountryById(Long id);
}
