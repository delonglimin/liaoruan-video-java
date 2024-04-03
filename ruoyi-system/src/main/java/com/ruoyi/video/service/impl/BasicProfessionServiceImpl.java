package com.ruoyi.video.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.BasicProfessionMapper;
import com.ruoyi.video.domain.BasicProfession;
import com.ruoyi.video.service.IBasicProfessionService;

/**
 * 基础数据-影人职务Service业务层处理
 *
 * @author ruoyi
 * @date 2023-10-20
 */
@Service
public class BasicProfessionServiceImpl implements IBasicProfessionService
{
    @Autowired
    private BasicProfessionMapper basicProfessionMapper;

    /**
     * 查询基础数据-影人职务
     *
     * @param id 基础数据-影人职务主键
     * @return 基础数据-影人职务
     */
    @Override
    public BasicProfession selectBasicProfessionById(Long id)
    {
        return basicProfessionMapper.selectBasicProfessionById(id);
    }

    /**
     * 查询基础数据-影人职务列表
     *
     * @param basicProfession 基础数据-影人职务
     * @return 基础数据-影人职务
     */
    @Override
    public List<BasicProfession> selectBasicProfessionList(BasicProfession basicProfession)
    {
        return basicProfessionMapper.selectBasicProfessionList(basicProfession);
    }

    /**
     * 新增基础数据-影人职务
     *
     * @param basicProfession 基础数据-影人职务
     * @return 结果
     */
    @Override
    public int insertBasicProfession(BasicProfession basicProfession)
    {
        basicProfession.setCreateTime(DateUtils.getNowDate());
        return basicProfessionMapper.insertBasicProfession(basicProfession);
    }

    /**
     * 修改基础数据-影人职务
     *
     * @param basicProfession 基础数据-影人职务
     * @return 结果
     */
    @Override
    public int updateBasicProfession(BasicProfession basicProfession)
    {
        basicProfession.setUpdateTime(DateUtils.getNowDate());
        return basicProfessionMapper.updateBasicProfession(basicProfession);
    }

    /**
     * 批量删除基础数据-影人职务
     *
     * @param ids 需要删除的基础数据-影人职务主键
     * @return 结果
     */
    @Override
    public int deleteBasicProfessionByIds(Long[] ids)
    {
        return basicProfessionMapper.deleteBasicProfessionByIds(ids);
    }

    /**
     * 删除基础数据-影人职务信息
     *
     * @param id 基础数据-影人职务主键
     * @return 结果
     */
    @Override
    public int deleteBasicProfessionById(Long id)
    {
        return basicProfessionMapper.deleteBasicProfessionById(id);
    }
}
