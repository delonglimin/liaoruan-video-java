package com.ruoyi.video.service;

import java.util.List;
import com.ruoyi.video.domain.WebUser;

/**
 * 用户管理Service接口
 *
 * @author ruoyi
 * @date 2023-10-23
 */
public interface IWebUserService
{
    /**
     * 查询用户管理
     *
     * @param userId 用户管理主键
     * @return 用户管理
     */
    public WebUser selectWebUserByUserId(Long userId);

    /**
     * 查询用户管理列表
     *
     * @param webUser 用户管理
     * @return 用户管理集合
     */
    public List<WebUser> selectWebUserList(WebUser webUser);

    /**
     * 新增用户管理
     *
     * @param webUser 用户管理
     * @return 结果
     */
    public int insertWebUser(WebUser webUser);

    /**
     * 修改用户管理
     *
     * @param webUser 用户管理
     * @return 结果
     */
    public int updateWebUser(WebUser webUser);

    /**
     * 批量删除用户管理
     *
     * @param userIds 需要删除的用户管理主键集合
     * @return 结果
     */
    public int deleteWebUserByUserIds(Long[] userIds);

    /**
     * 删除用户管理信息
     *
     * @param userId 用户管理主键
     * @return 结果
     */
    public int deleteWebUserByUserId(Long userId);
}
