package com.ruoyi.video.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.UserWalletLogMapper;
import com.ruoyi.video.domain.UserWalletLog;
import com.ruoyi.video.service.IUserWalletLogService;

/**
 * 钱包Service业务层处理
 *
 * @author ruoyi
 * @date 2023-11-20
 */
@Service
public class UserWalletLogServiceImpl implements IUserWalletLogService
{
    @Autowired
    private UserWalletLogMapper userWalletLogMapper;

    /**
     * 查询钱包
     *
     * @param id 钱包主键
     * @return 钱包
     */
    @Override
    public UserWalletLog selectUserWalletLogById(Long id)
    {
        return userWalletLogMapper.selectUserWalletLogById(id);
    }

    /**
     * 查询钱包列表
     *
     * @param userWalletLog 钱包
     * @return 钱包
     */
    @Override
    public List<UserWalletLog> selectUserWalletLogList(UserWalletLog userWalletLog)
    {
        return userWalletLogMapper.selectUserWalletLogList(userWalletLog);
    }

    /**
     * 新增钱包
     *
     * @param userWalletLog 钱包
     * @return 结果
     */
    @Override
    public int insertUserWalletLog(UserWalletLog userWalletLog)
    {
        return userWalletLogMapper.insertUserWalletLog(userWalletLog);
    }

    /**
     * 修改钱包
     *
     * @param userWalletLog 钱包
     * @return 结果
     */
    @Override
    public int updateUserWalletLog(UserWalletLog userWalletLog)
    {
        return userWalletLogMapper.updateUserWalletLog(userWalletLog);
    }

    /**
     * 批量删除钱包
     *
     * @param ids 需要删除的钱包主键
     * @return 结果
     */
    @Override
    public int deleteUserWalletLogByIds(Long[] ids)
    {
        return userWalletLogMapper.deleteUserWalletLogByIds(ids);
    }

    /**
     * 删除钱包信息
     *
     * @param id 钱包主键
     * @return 结果
     */
    @Override
    public int deleteUserWalletLogById(Long id)
    {
        return userWalletLogMapper.deleteUserWalletLogById(id);
    }
}
