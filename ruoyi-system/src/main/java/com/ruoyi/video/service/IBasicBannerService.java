package com.ruoyi.video.service;

import java.util.List;
import com.ruoyi.video.domain.BasicBanner;

/**
 * bannerService接口
 *
 * @author ruoyi
 * @date 2023-10-20
 */
public interface IBasicBannerService
{
    /**
     * 查询banner
     *
     * @param id banner主键
     * @return banner
     */
    public BasicBanner selectBasicBannerById(Long id);

    /**
     * 查询banner列表
     *
     * @param basicBanner banner
     * @return banner集合
     */
    public List<BasicBanner> selectBasicBannerList(BasicBanner basicBanner);

    /**
     * 新增banner
     *
     * @param basicBanner banner
     * @return 结果
     */
    public int insertBasicBanner(BasicBanner basicBanner);

    /**
     * 修改banner
     *
     * @param basicBanner banner
     * @return 结果
     */
    public int updateBasicBanner(BasicBanner basicBanner);

    /**
     * 批量删除banner
     *
     * @param ids 需要删除的banner主键集合
     * @return 结果
     */
    public int deleteBasicBannerByIds(Long[] ids);

    /**
     * 删除banner信息
     *
     * @param id banner主键
     * @return 结果
     */
    public int deleteBasicBannerById(Long id);
}
