package com.ruoyi.video.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.UserSignLogMapper;
import com.ruoyi.video.domain.UserSignLog;
import com.ruoyi.video.service.IUserSignLogService;

/**
 * 签到Service业务层处理
 *
 * @author ruoyi
 * @date 2023-11-20
 */
@Service
public class UserSignLogServiceImpl implements IUserSignLogService
{
    @Autowired
    private UserSignLogMapper userSignLogMapper;

    /**
     * 查询签到
     *
     * @param id 签到主键
     * @return 签到
     */
    @Override
    public UserSignLog selectUserSignLogById(Long id)
    {
        return userSignLogMapper.selectUserSignLogById(id);
    }

    /**
     * 查询签到列表
     *
     * @param userSignLog 签到
     * @return 签到
     */
    @Override
    public List<UserSignLog> selectUserSignLogList(UserSignLog userSignLog)
    {
        return userSignLogMapper.selectUserSignLogList(userSignLog);
    }

    /**
     * 新增签到
     *
     * @param userSignLog 签到
     * @return 结果
     */
    @Override
    public int insertUserSignLog(UserSignLog userSignLog)
    {
        return userSignLogMapper.insertUserSignLog(userSignLog);
    }

    /**
     * 修改签到
     *
     * @param userSignLog 签到
     * @return 结果
     */
    @Override
    public int updateUserSignLog(UserSignLog userSignLog)
    {
        return userSignLogMapper.updateUserSignLog(userSignLog);
    }

    /**
     * 批量删除签到
     *
     * @param ids 需要删除的签到主键
     * @return 结果
     */
    @Override
    public int deleteUserSignLogByIds(Long[] ids)
    {
        return userSignLogMapper.deleteUserSignLogByIds(ids);
    }

    /**
     * 删除签到信息
     *
     * @param id 签到主键
     * @return 结果
     */
    @Override
    public int deleteUserSignLogById(Long id)
    {
        return userSignLogMapper.deleteUserSignLogById(id);
    }
}
