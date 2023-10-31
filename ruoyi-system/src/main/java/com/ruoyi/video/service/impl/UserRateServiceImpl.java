package com.ruoyi.video.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.UserRateMapper;
import com.ruoyi.video.domain.UserRate;
import com.ruoyi.video.service.IUserRateService;

/**
 * 评论Service业务层处理
 *
 * @author ruoyi
 * @date 2023-10-31
 */
@Service
public class UserRateServiceImpl implements IUserRateService
{
    @Autowired
    private UserRateMapper userRateMapper;

    /**
     * 查询评论
     *
     * @param id 评论主键
     * @return 评论
     */
    @Override
    public UserRate selectUserRateById(Long id)
    {
        return userRateMapper.selectUserRateById(id);
    }

    /**
     * 查询评论列表
     *
     * @param userRate 评论
     * @return 评论
     */
    @Override
    public List<UserRate> selectUserRateList(UserRate userRate)
    {
        return userRateMapper.selectUserRateList(userRate);
    }

    /**
     * 新增评论
     *
     * @param userRate 评论
     * @return 结果
     */
    @Override
    public int insertUserRate(UserRate userRate)
    {
        return userRateMapper.insertUserRate(userRate);
    }

    /**
     * 修改评论
     *
     * @param userRate 评论
     * @return 结果
     */
    @Override
    public int updateUserRate(UserRate userRate)
    {
        return userRateMapper.updateUserRate(userRate);
    }

    /**
     * 批量删除评论
     *
     * @param ids 需要删除的评论主键
     * @return 结果
     */
    @Override
    public int deleteUserRateByIds(Long[] ids)
    {
        return userRateMapper.deleteUserRateByIds(ids);
    }

    /**
     * 删除评论信息
     *
     * @param id 评论主键
     * @return 结果
     */
    @Override
    public int deleteUserRateById(Long id)
    {
        return userRateMapper.deleteUserRateById(id);
    }
}
