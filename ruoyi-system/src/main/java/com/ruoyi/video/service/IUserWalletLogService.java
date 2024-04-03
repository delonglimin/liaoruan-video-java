package com.ruoyi.video.service;

import java.util.List;
import com.ruoyi.video.domain.UserWalletLog;

/**
 * 钱包Service接口
 *
 * @author ruoyi
 * @date 2023-11-20
 */
public interface IUserWalletLogService
{
    /**
     * 查询钱包
     *
     * @param id 钱包主键
     * @return 钱包
     */
    public UserWalletLog selectUserWalletLogById(Long id);

    /**
     * 查询钱包列表
     *
     * @param userWalletLog 钱包
     * @return 钱包集合
     */
    public List<UserWalletLog> selectUserWalletLogList(UserWalletLog userWalletLog);

    /**
     * 新增钱包
     *
     * @param userWalletLog 钱包
     * @return 结果
     */
    public int insertUserWalletLog(UserWalletLog userWalletLog);

    /**
     * 修改钱包
     *
     * @param userWalletLog 钱包
     * @return 结果
     */
    public int updateUserWalletLog(UserWalletLog userWalletLog);

    /**
     * 批量删除钱包
     *
     * @param ids 需要删除的钱包主键集合
     * @return 结果
     */
    public int deleteUserWalletLogByIds(Long[] ids);

    /**
     * 删除钱包信息
     *
     * @param id 钱包主键
     * @return 结果
     */
    public int deleteUserWalletLogById(Long id);
}
