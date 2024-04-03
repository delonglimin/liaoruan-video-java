package com.ruoyi.video.mapper;

import java.util.List;
import com.ruoyi.video.domain.Video;

/**
 * 视频管理Mapper接口
 *
 * @author ruoyi
 * @date 2023-10-23
 */
public interface VideoMapper
{
    /**
     * 查询视频管理
     *
     * @param id 视频管理主键
     * @return 视频管理
     */
    public Video selectVideoById(Long id);

    /**
     * 查询视频管理列表
     *
     * @param video 视频管理
     * @return 视频管理集合
     */
    public List<Video> selectVideoList(Video video);

    /**
     * 新增视频管理
     *
     * @param video 视频管理
     * @return 结果
     */
    public int insertVideo(Video video);

    /**
     * 修改视频管理
     *
     * @param video 视频管理
     * @return 结果
     */
    public int updateVideo(Video video);

    /**
     * 删除视频管理
     *
     * @param id 视频管理主键
     * @return 结果
     */
    public int deleteVideoById(Long id);

    /**
     * 批量删除视频管理
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVideoByIds(Long[] ids);
}
