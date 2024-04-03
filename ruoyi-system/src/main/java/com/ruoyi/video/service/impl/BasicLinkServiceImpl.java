package com.ruoyi.video.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.BasicLinkMapper;
import com.ruoyi.video.domain.BasicLink;
import com.ruoyi.video.service.IBasicLinkService;

/**
 * linkService业务层处理
 *
 * @author ruoyi
 * @date 2023-11-13
 */
@Service
public class BasicLinkServiceImpl implements IBasicLinkService
{
    @Autowired
    private BasicLinkMapper basicLinkMapper;

    /**
     * 查询link
     *
     * @param id link主键
     * @return link
     */
    @Override
    public BasicLink selectBasicLinkById(Long id)
    {
        return basicLinkMapper.selectBasicLinkById(id);
    }

    /**
     * 查询link列表
     *
     * @param basicLink link
     * @return link
     */
    @Override
    public List<BasicLink> selectBasicLinkList(BasicLink basicLink)
    {
        return basicLinkMapper.selectBasicLinkList(basicLink);
    }

    /**
     * 新增link
     *
     * @param basicLink link
     * @return 结果
     */
    @Override
    public int insertBasicLink(BasicLink basicLink)
    {
        basicLink.setCreateTime(DateUtils.getNowDate());
        return basicLinkMapper.insertBasicLink(basicLink);
    }

    /**
     * 修改link
     *
     * @param basicLink link
     * @return 结果
     */
    @Override
    public int updateBasicLink(BasicLink basicLink)
    {
        basicLink.setUpdateTime(DateUtils.getNowDate());
        return basicLinkMapper.updateBasicLink(basicLink);
    }

    /**
     * 批量删除link
     *
     * @param ids 需要删除的link主键
     * @return 结果
     */
    @Override
    public int deleteBasicLinkByIds(Long[] ids)
    {
        return basicLinkMapper.deleteBasicLinkByIds(ids);
    }

    /**
     * 删除link信息
     *
     * @param id link主键
     * @return 结果
     */
    @Override
    public int deleteBasicLinkById(Long id)
    {
        return basicLinkMapper.deleteBasicLinkById(id);
    }
}
