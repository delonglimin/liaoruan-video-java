package com.ruoyi.video.mapper;

import java.util.List;
import com.ruoyi.video.domain.PhotosMovie;

/**
 * 影视相册Mapper接口
 *
 * @author ruoyi
 * @date 2023-10-24
 */
public interface PhotosMovieMapper
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
     * 删除影视相册
     *
     * @param id 影视相册主键
     * @return 结果
     */
    public int deletePhotosMovieById(Long id);

    /**
     * 批量删除影视相册
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePhotosMovieByIds(Long[] ids);
}
