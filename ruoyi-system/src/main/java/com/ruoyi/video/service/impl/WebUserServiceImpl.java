package com.ruoyi.video.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.WebUserMapper;
import com.ruoyi.video.domain.WebUser;
import com.ruoyi.video.service.IWebUserService;

/**
 * 用户管理Service业务层处理
 *
 * @author ruoyi
 * @date 2023-10-23
 */
@Service
public class WebUserServiceImpl implements IWebUserService
{
    @Autowired
    private WebUserMapper webUserMapper;

    /**
     * 查询用户管理
     *
     * @param userId 用户管理主键
     * @return 用户管理
     */
    @Override
    public WebUser selectWebUserByUserId(Long userId)
    {
        return webUserMapper.selectWebUserByUserId(userId);
    }

    @Override
    public WebUser selectWebUserByPhone(String Phone)
    {
        return webUserMapper.selectWebUserByPhone(Phone);
    }

    /**
     * 查询用户管理列表
     *
     * @param webUser 用户管理
     * @return 用户管理
     */
    @Override
    public List<WebUser> selectWebUserList(WebUser webUser)
    {
        return webUserMapper.selectWebUserList(webUser);
    }

    /**
     * 新增用户管理
     *
     * @param webUser 用户管理
     * @return 结果
     */
    @Override
    public int insertWebUser(WebUser webUser)
    {
        webUser.setCreateTime(DateUtils.getNowDate());
        return webUserMapper.insertWebUser(webUser);
    }

    /**
     * 修改用户管理
     *
     * @param webUser 用户管理
     * @return 结果
     */
    @Override
    public int updateWebUser(WebUser webUser)
    {
        webUser.setUpdateTime(DateUtils.getNowDate());
        return webUserMapper.updateWebUser(webUser);
    }

    /**
     * 批量删除用户管理
     *
     * @param userIds 需要删除的用户管理主键
     * @return 结果
     */
    @Override
    public int deleteWebUserByUserIds(Long[] userIds)
    {
        return webUserMapper.deleteWebUserByUserIds(userIds);
    }

    /**
     * 删除用户管理信息
     *
     * @param userId 用户管理主键
     * @return 结果
     */
    @Override
    public int deleteWebUserByUserId(Long userId)
    {
        return webUserMapper.deleteWebUserByUserId(userId);
    }

    @Override
    public Boolean checkCollect(Long userId, Long movieId) {
        Long res = webUserMapper.findCollect(userId,movieId);
        return res > 0;
    }

    @Override
    public Long addCollect(Long userId, Long movieId) {
        return webUserMapper.addCollect(userId,movieId);
    }

    @Override
    public Long cancelCollect(Long userId, Long movieId) {
        return webUserMapper.cancelCollect(userId,movieId);
    }
}
