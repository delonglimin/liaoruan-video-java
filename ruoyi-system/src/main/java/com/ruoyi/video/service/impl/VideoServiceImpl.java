package com.ruoyi.video.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.VideoMapper;
import com.ruoyi.video.domain.Video;
import com.ruoyi.video.service.IVideoService;

/**
 * 视频管理Service业务层处理
 *
 * @author ruoyi
 * @date 2023-10-23
 */
@Service
public class VideoServiceImpl implements IVideoService
{
    @Autowired
    private VideoMapper videoMapper;

    /**
     * 查询视频管理
     *
     * @param id 视频管理主键
     * @return 视频管理
     */
    @Override
    public Video selectVideoById(Long id)
    {
        return videoMapper.selectVideoById(id);
    }

    /**
     * 查询视频管理列表
     *
     * @param video 视频管理
     * @return 视频管理
     */
    @Override
    public List<Video> selectVideoList(Video video)
    {
        return videoMapper.selectVideoList(video);
    }

    /**
     * 新增视频管理
     *
     * @param video 视频管理
     * @return 结果
     */
    @Override
    public int insertVideo(Video video)
    {
        video.setCreateTime(DateUtils.getNowDate());
        return videoMapper.insertVideo(video);
    }

    /**
     * 修改视频管理
     *
     * @param video 视频管理
     * @return 结果
     */
    @Override
    public int updateVideo(Video video)
    {
        video.setUpdateTime(DateUtils.getNowDate());
        return videoMapper.updateVideo(video);
    }

    /**
     * 批量删除视频管理
     *
     * @param ids 需要删除的视频管理主键
     * @return 结果
     */
    @Override
    public int deleteVideoByIds(Long[] ids)
    {
        return videoMapper.deleteVideoByIds(ids);
    }

    /**
     * 删除视频管理信息
     *
     * @param id 视频管理主键
     * @return 结果
     */
    @Override
    public int deleteVideoById(Long id)
    {
        return videoMapper.deleteVideoById(id);
    }
}
