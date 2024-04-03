package com.ruoyi.video.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.BasicLanguageMapper;
import com.ruoyi.video.domain.BasicLanguage;
import com.ruoyi.video.service.IBasicLanguageService;

/**
 * 基础数据-语言管理Service业务层处理
 *
 * @author ruoyi
 * @date 2023-10-13
 */
@Service
public class BasicLanguageServiceImpl implements IBasicLanguageService
{
    @Autowired
    private BasicLanguageMapper basicLanguageMapper;

    /**
     * 查询基础数据-语言管理
     *
     * @param id 基础数据-语言管理主键
     * @return 基础数据-语言管理
     */
    @Override
    public BasicLanguage selectBasicLanguageById(Long id)
    {
        return basicLanguageMapper.selectBasicLanguageById(id);
    }

    /**
     * 查询基础数据-语言管理列表
     *
     * @param basicLanguage 基础数据-语言管理
     * @return 基础数据-语言管理
     */
    @Override
    public List<BasicLanguage> selectBasicLanguageList(BasicLanguage basicLanguage)
    {
        return basicLanguageMapper.selectBasicLanguageList(basicLanguage);
    }

    /**
     * 新增基础数据-语言管理
     *
     * @param basicLanguage 基础数据-语言管理
     * @return 结果
     */
    @Override
    public int insertBasicLanguage(BasicLanguage basicLanguage)
    {
        basicLanguage.setCreateTime(DateUtils.getNowDate());
        return basicLanguageMapper.insertBasicLanguage(basicLanguage);
    }

    /**
     * 修改基础数据-语言管理
     *
     * @param basicLanguage 基础数据-语言管理
     * @return 结果
     */
    @Override
    public int updateBasicLanguage(BasicLanguage basicLanguage)
    {
        basicLanguage.setUpdateTime(DateUtils.getNowDate());
        return basicLanguageMapper.updateBasicLanguage(basicLanguage);
    }

    /**
     * 批量删除基础数据-语言管理
     *
     * @param ids 需要删除的基础数据-语言管理主键
     * @return 结果
     */
    @Override
    public int deleteBasicLanguageByIds(Long[] ids)
    {
        return basicLanguageMapper.deleteBasicLanguageByIds(ids);
    }

    /**
     * 删除基础数据-语言管理信息
     *
     * @param id 基础数据-语言管理主键
     * @return 结果
     */
    @Override
    public int deleteBasicLanguageById(Long id)
    {
        return basicLanguageMapper.deleteBasicLanguageById(id);
    }
}
