package com.ruoyi.video.mapper;

import java.util.List;
import com.ruoyi.video.domain.BasicLink;

/**
 * linkMapper接口
 *
 * @author ruoyi
 * @date 2023-11-13
 */
public interface BasicLinkMapper
{
    /**
     * 查询link
     *
     * @param id link主键
     * @return link
     */
    public BasicLink selectBasicLinkById(Long id);

    /**
     * 查询link列表
     *
     * @param basicLink link
     * @return link集合
     */
    public List<BasicLink> selectBasicLinkList(BasicLink basicLink);

    /**
     * 新增link
     *
     * @param basicLink link
     * @return 结果
     */
    public int insertBasicLink(BasicLink basicLink);

    /**
     * 修改link
     *
     * @param basicLink link
     * @return 结果
     */
    public int updateBasicLink(BasicLink basicLink);

    /**
     * 删除link
     *
     * @param id link主键
     * @return 结果
     */
    public int deleteBasicLinkById(Long id);

    /**
     * 批量删除link
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBasicLinkByIds(Long[] ids);
}
