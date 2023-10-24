package com.ruoyi.video.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.BasicBannerMapper;
import com.ruoyi.video.domain.BasicBanner;
import com.ruoyi.video.service.IBasicBannerService;

/**
 * bannerService业务层处理
 *
 * @author ruoyi
 * @date 2023-10-20
 */
@Service
public class BasicBannerServiceImpl implements IBasicBannerService
{
    @Autowired
    private BasicBannerMapper basicBannerMapper;

    /**
     * 查询banner
     *
     * @param id banner主键
     * @return banner
     */
    @Override
    public BasicBanner selectBasicBannerById(Long id)
    {
        return basicBannerMapper.selectBasicBannerById(id);
    }

    /**
     * 查询banner列表
     *
     * @param basicBanner banner
     * @return banner
     */
    @Override
    public List<BasicBanner> selectBasicBannerList(BasicBanner basicBanner)
    {
        return basicBannerMapper.selectBasicBannerList(basicBanner);
    }

    /**
     * 新增banner
     *
     * @param basicBanner banner
     * @return 结果
     */
    @Override
    public int insertBasicBanner(BasicBanner basicBanner)
    {
        basicBanner.setCreateTime(DateUtils.getNowDate());
        return basicBannerMapper.insertBasicBanner(basicBanner);
    }

    /**
     * 修改banner
     *
     * @param basicBanner banner
     * @return 结果
     */
    @Override
    public int updateBasicBanner(BasicBanner basicBanner)
    {
        basicBanner.setUpdateTime(DateUtils.getNowDate());
        return basicBannerMapper.updateBasicBanner(basicBanner);
    }

    /**
     * 批量删除banner
     *
     * @param ids 需要删除的banner主键
     * @return 结果
     */
    @Override
    public int deleteBasicBannerByIds(Long[] ids)
    {
        return basicBannerMapper.deleteBasicBannerByIds(ids);
    }

    /**
     * 删除banner信息
     *
     * @param id banner主键
     * @return 结果
     */
    @Override
    public int deleteBasicBannerById(Long id)
    {
        return basicBannerMapper.deleteBasicBannerById(id);
    }
}
