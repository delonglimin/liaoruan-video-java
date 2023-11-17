package com.ruoyi.video.mapper;

import java.util.List;
import com.ruoyi.video.domain.WebUser;
import org.apache.ibatis.annotations.Param;

/**
 * 用户管理Mapper接口
 *
 * @author ruoyi
 * @date 2023-10-23
 */
public interface WebUserMapper
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
     * 删除用户管理
     *
     * @param userId 用户管理主键
     * @return 结果
     */
    public int deleteWebUserByUserId(Long userId);

    /**
     * 批量删除用户管理
     *
     * @param userIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWebUserByUserIds(Long[] userIds);

    public Long findCollect(@Param("userId") Long userId,@Param("movieId") Long movieId);
    public Long addCollect(@Param("userId") Long userId,@Param("movieId") Long movieId);
    public Long cancelCollect(@Param("userId") Long userId,@Param("movieId") Long movieId);
}
