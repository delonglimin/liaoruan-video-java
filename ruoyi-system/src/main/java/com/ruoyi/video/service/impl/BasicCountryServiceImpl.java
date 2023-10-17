package com.ruoyi.video.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.BasicCountryMapper;
import com.ruoyi.video.domain.BasicCountry;
import com.ruoyi.video.service.IBasicCountryService;

/**
 * 国家管理Service业务层处理
 *
 * @author ruoyi
 * @date 2023-10-13
 */
@Service
public class BasicCountryServiceImpl implements IBasicCountryService
{
    @Autowired
    private BasicCountryMapper basicCountryMapper;

    /**
     * 查询国家管理
     *
     * @param id 国家管理主键
     * @return 国家管理
     */
    @Override
    public BasicCountry selectBasicCountryById(Long id)
    {
        return basicCountryMapper.selectBasicCountryById(id);
    }

    /**
     * 查询国家管理列表
     *
     * @param basicCountry 国家管理
     * @return 国家管理
     */
    @Override
    public List<BasicCountry> selectBasicCountryList(BasicCountry basicCountry)
    {
        return basicCountryMapper.selectBasicCountryList(basicCountry);
    }

    /**
     * 新增国家管理
     *
     * @param basicCountry 国家管理
     * @return 结果
     */
    @Override
    public int insertBasicCountry(BasicCountry basicCountry)
    {
        basicCountry.setCreateTime(DateUtils.getNowDate());
        return basicCountryMapper.insertBasicCountry(basicCountry);
    }

    /**
     * 修改国家管理
     *
     * @param basicCountry 国家管理
     * @return 结果
     */
    @Override
    public int updateBasicCountry(BasicCountry basicCountry)
    {
        basicCountry.setUpdateTime(DateUtils.getNowDate());
        return basicCountryMapper.updateBasicCountry(basicCountry);
    }

    /**
     * 批量删除国家管理
     *
     * @param ids 需要删除的国家管理主键
     * @return 结果
     */
    @Override
    public int deleteBasicCountryByIds(Long[] ids)
    {
        return basicCountryMapper.deleteBasicCountryByIds(ids);
    }

    /**
     * 删除国家管理信息
     *
     * @param id 国家管理主键
     * @return 结果
     */
    @Override
    public int deleteBasicCountryById(Long id)
    {
        return basicCountryMapper.deleteBasicCountryById(id);
    }
}
