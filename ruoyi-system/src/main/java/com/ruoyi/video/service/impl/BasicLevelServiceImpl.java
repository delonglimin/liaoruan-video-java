package com.ruoyi.video.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.video.domain.BasicCountry;
import com.ruoyi.video.mapper.BasicLevelMapper;
import com.ruoyi.video.domain.BasicLevel;
import com.ruoyi.video.service.IBasicLevelService;

/**
 * 基础数据-家长引导Service业务层处理
 *
 * @author ruoyi
 * @date 2023-10-20
 */
@Service
public class BasicLevelServiceImpl implements IBasicLevelService
{
    @Autowired
    private BasicLevelMapper basicLevelMapper;

    /**
     * 查询基础数据-家长引导
     *
     * @param id 基础数据-家长引导主键
     * @return 基础数据-家长引导
     */
    @Override
    public BasicLevel selectBasicLevelById(Long id)
    {
        return basicLevelMapper.selectBasicLevelById(id);
    }

    /**
     * 查询基础数据-家长引导列表
     *
     * @param basicLevel 基础数据-家长引导
     * @return 基础数据-家长引导
     */
    @Override
    public List<BasicLevel> selectBasicLevelList(BasicLevel basicLevel)
    {
        return basicLevelMapper.selectBasicLevelList(basicLevel);
    }

    /**
     * 新增基础数据-家长引导
     *
     * @param basicLevel 基础数据-家长引导
     * @return 结果
     */
    @Transactional
    @Override
    public int insertBasicLevel(BasicLevel basicLevel)
    {
        basicLevel.setCreateTime(DateUtils.getNowDate());
        int rows = basicLevelMapper.insertBasicLevel(basicLevel);
        return rows;
    }

    /**
     * 修改基础数据-家长引导
     *
     * @param basicLevel 基础数据-家长引导
     * @return 结果
     */
    @Transactional
    @Override
    public int updateBasicLevel(BasicLevel basicLevel)
    {
        basicLevel.setUpdateTime(DateUtils.getNowDate());
        return basicLevelMapper.updateBasicLevel(basicLevel);
    }

    /**
     * 批量删除基础数据-家长引导
     *
     * @param ids 需要删除的基础数据-家长引导主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteBasicLevelByIds(Long[] ids)
    {
        basicLevelMapper.deleteBasicCountryByIds(ids);
        return basicLevelMapper.deleteBasicLevelByIds(ids);
    }

    /**
     * 删除基础数据-家长引导信息
     *
     * @param id 基础数据-家长引导主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteBasicLevelById(Long id)
    {
        basicLevelMapper.deleteBasicCountryById(id);
        return basicLevelMapper.deleteBasicLevelById(id);
    }

    /**
     * 新增国家管理信息
     *
     * @param basicLevel 基础数据-家长引导对象
     */
    public void insertBasicCountry(BasicLevel basicLevel)
    {

    }
}
