package com.ruoyi.video.service;

import java.util.HashMap;
import java.util.List;
import com.ruoyi.video.domain.WebUser;
import org.apache.ibatis.annotations.Param;

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

    public WebUser selectWebUserByPhone(String phone);

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



    public Boolean checkCollect(Long userId,Long movieId);
    public Long addCollect(Long userId,Long movieId);
    public Long cancelCollect(Long userId,Long movieId);


    public List<HashMap> findCollectList(Long userId);

}
