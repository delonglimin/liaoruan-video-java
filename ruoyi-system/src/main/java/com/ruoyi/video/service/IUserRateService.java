package com.ruoyi.video.service;

import java.util.List;
import com.ruoyi.video.domain.UserRate;

/**
 * 评论Service接口
 *
 * @author ruoyi
 * @date 2023-10-31
 */
public interface IUserRateService
{
    /**
     * 查询评论
     *
     * @param id 评论主键
     * @return 评论
     */
    public UserRate selectUserRateById(Long id);

    /**
     * 查询评论列表
     *
     * @param userRate 评论
     * @return 评论集合
     */
    public List<UserRate> selectUserRateList(UserRate userRate);

    /**
     * 新增评论
     *
     * @param userRate 评论
     * @return 结果
     */
    public int insertUserRate(UserRate userRate);

    /**
     * 修改评论
     *
     * @param userRate 评论
     * @return 结果
     */
    public int updateUserRate(UserRate userRate);

    /**
     * 批量删除评论
     *
     * @param ids 需要删除的评论主键集合
     * @return 结果
     */
    public int deleteUserRateByIds(Long[] ids);

    /**
     * 删除评论信息
     *
     * @param id 评论主键
     * @return 结果
     */
    public int deleteUserRateById(Long id);
}
