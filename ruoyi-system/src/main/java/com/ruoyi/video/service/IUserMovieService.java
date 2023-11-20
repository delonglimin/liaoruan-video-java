package com.ruoyi.video.service;

import java.util.List;
import com.ruoyi.video.domain.UserMovie;

/**
 * 用户购买影视Service接口
 *
 * @author ruoyi
 * @date 2023-11-20
 */
public interface IUserMovieService
{
    /**
     * 查询用户购买影视
     *
     * @param userId 用户购买影视主键
     * @return 用户购买影视
     */
    public UserMovie selectUserMovieByUserId(Long userId);

    /**
     * 查询用户购买影视列表
     *
     * @param userMovie 用户购买影视
     * @return 用户购买影视集合
     */
    public List<UserMovie> selectUserMovieList(UserMovie userMovie);

    /**
     * 新增用户购买影视
     *
     * @param userMovie 用户购买影视
     * @return 结果
     */
    public int insertUserMovie(UserMovie userMovie);

    /**
     * 修改用户购买影视
     *
     * @param userMovie 用户购买影视
     * @return 结果
     */
    public int updateUserMovie(UserMovie userMovie);

    /**
     * 批量删除用户购买影视
     *
     * @param userIds 需要删除的用户购买影视主键集合
     * @return 结果
     */
    public int deleteUserMovieByUserIds(Long[] userIds);

    /**
     * 删除用户购买影视信息
     *
     * @param userId 用户购买影视主键
     * @return 结果
     */
    public int deleteUserMovieByUserId(Long userId);
}
