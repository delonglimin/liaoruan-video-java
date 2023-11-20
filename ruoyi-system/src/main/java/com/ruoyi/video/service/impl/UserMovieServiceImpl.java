package com.ruoyi.video.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.UserMovieMapper;
import com.ruoyi.video.domain.UserMovie;
import com.ruoyi.video.service.IUserMovieService;

/**
 * 用户购买影视Service业务层处理
 *
 * @author ruoyi
 * @date 2023-11-20
 */
@Service
public class UserMovieServiceImpl implements IUserMovieService
{
    @Autowired
    private UserMovieMapper userMovieMapper;

    /**
     * 查询用户购买影视
     *
     * @param userId 用户购买影视主键
     * @return 用户购买影视
     */
    @Override
    public UserMovie selectUserMovieByUserId(Long userId)
    {
        return userMovieMapper.selectUserMovieByUserId(userId);
    }

    /**
     * 查询用户购买影视列表
     *
     * @param userMovie 用户购买影视
     * @return 用户购买影视
     */
    @Override
    public List<UserMovie> selectUserMovieList(UserMovie userMovie)
    {
        return userMovieMapper.selectUserMovieList(userMovie);
    }

    /**
     * 新增用户购买影视
     *
     * @param userMovie 用户购买影视
     * @return 结果
     */
    @Override
    public int insertUserMovie(UserMovie userMovie)
    {
        return userMovieMapper.insertUserMovie(userMovie);
    }

    /**
     * 修改用户购买影视
     *
     * @param userMovie 用户购买影视
     * @return 结果
     */
    @Override
    public int updateUserMovie(UserMovie userMovie)
    {
        return userMovieMapper.updateUserMovie(userMovie);
    }

    /**
     * 批量删除用户购买影视
     *
     * @param userIds 需要删除的用户购买影视主键
     * @return 结果
     */
    @Override
    public int deleteUserMovieByUserIds(Long[] userIds)
    {
        return userMovieMapper.deleteUserMovieByUserIds(userIds);
    }

    /**
     * 删除用户购买影视信息
     *
     * @param userId 用户购买影视主键
     * @return 结果
     */
    @Override
    public int deleteUserMovieByUserId(Long userId)
    {
        return userMovieMapper.deleteUserMovieByUserId(userId);
    }
}
