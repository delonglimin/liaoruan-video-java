package com.ruoyi.video.mapper;

import java.util.List;
import com.ruoyi.video.domain.UserSignLog;

/**
 * 签到Mapper接口
 *
 * @author ruoyi
 * @date 2023-11-20
 */
public interface UserSignLogMapper
{
    /**
     * 查询签到
     *
     * @param id 签到主键
     * @return 签到
     */
    public UserSignLog selectUserSignLogById(Long id);

    /**
     * 查询签到列表
     *
     * @param userSignLog 签到
     * @return 签到集合
     */
    public List<UserSignLog> selectUserSignLogList(UserSignLog userSignLog);

    /**
     * 新增签到
     *
     * @param userSignLog 签到
     * @return 结果
     */
    public int insertUserSignLog(UserSignLog userSignLog);

    /**
     * 修改签到
     *
     * @param userSignLog 签到
     * @return 结果
     */
    public int updateUserSignLog(UserSignLog userSignLog);

    /**
     * 删除签到
     *
     * @param id 签到主键
     * @return 结果
     */
    public int deleteUserSignLogById(Long id);

    /**
     * 批量删除签到
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserSignLogByIds(Long[] ids);
}
