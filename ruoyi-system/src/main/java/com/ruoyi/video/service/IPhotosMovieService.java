package com.ruoyi.video.service;

import java.util.List;
import com.ruoyi.video.domain.PhotosMovie;

/**
 * 影视相册Service接口
 *
 * @author ruoyi
 * @date 2023-10-24
 */
public interface IPhotosMovieService
{
    /**
     * 查询影视相册
     *
     * @param id 影视相册主键
     * @return 影视相册
     */
    public PhotosMovie selectPhotosMovieById(Long id);

    /**
     * 查询影视相册列表
     *
     * @param photosMovie 影视相册
     * @return 影视相册集合
     */
    public List<PhotosMovie> selectPhotosMovieList(PhotosMovie photosMovie);

    /**
     * 新增影视相册
     *
     * @param photosMovie 影视相册
     * @return 结果
     */
    public int insertPhotosMovie(PhotosMovie photosMovie);

    /**
     * 修改影视相册
     *
     * @param photosMovie 影视相册
     * @return 结果
     */
    public int updatePhotosMovie(PhotosMovie photosMovie);

    /**
     * 批量删除影视相册
     *
     * @param ids 需要删除的影视相册主键集合
     * @return 结果
     */
    public int deletePhotosMovieByIds(Long[] ids);

    /**
     * 删除影视相册信息
     *
     * @param id 影视相册主键
     * @return 结果
     */
    public int deletePhotosMovieById(Long id);
}
