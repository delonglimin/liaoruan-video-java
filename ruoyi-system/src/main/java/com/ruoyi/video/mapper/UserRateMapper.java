package com.ruoyi.video.mapper;

import java.util.HashMap;
import java.util.List;
import com.ruoyi.video.domain.UserRate;

/**
 * 评论Mapper接口
 *
 * @author ruoyi
 * @date 2023-10-31
 */
public interface UserRateMapper
{
    /**
     * 查询评论
     *
     * @param id 评论主键
     * @return 评论
     */
    public UserRate selectUserRateById(Long id);

    /**
     * 查询影视对应的评分人数和评分
     *
     * @param id movie id
     * @return 评论
     */
    public HashMap selectUserRateByMovieId(Long id);

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
     * 删除评论
     *
     * @param id 评论主键
     * @return 结果
     */
    public int deleteUserRateById(Long id);

    /**
     * 批量删除评论
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserRateByIds(Long[] ids);
}
