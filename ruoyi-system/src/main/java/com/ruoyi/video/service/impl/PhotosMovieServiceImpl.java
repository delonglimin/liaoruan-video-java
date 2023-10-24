package com.ruoyi.video.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.PhotosMovieMapper;
import com.ruoyi.video.domain.PhotosMovie;
import com.ruoyi.video.service.IPhotosMovieService;

/**
 * 影视相册Service业务层处理
 *
 * @author ruoyi
 * @date 2023-10-24
 */
@Service
public class PhotosMovieServiceImpl implements IPhotosMovieService
{
    @Autowired
    private PhotosMovieMapper photosMovieMapper;

    /**
     * 查询影视相册
     *
     * @param id 影视相册主键
     * @return 影视相册
     */
    @Override
    public PhotosMovie selectPhotosMovieById(Long id)
    {
        return photosMovieMapper.selectPhotosMovieById(id);
    }

    /**
     * 查询影视相册列表
     *
     * @param photosMovie 影视相册
     * @return 影视相册
     */
    @Override
    public List<PhotosMovie> selectPhotosMovieList(PhotosMovie photosMovie)
    {
        return photosMovieMapper.selectPhotosMovieList(photosMovie);
    }

    /**
     * 新增影视相册
     *
     * @param photosMovie 影视相册
     * @return 结果
     */
    @Override
    public int insertPhotosMovie(PhotosMovie photosMovie)
    {
        photosMovie.setCreateTime(DateUtils.getNowDate());
        return photosMovieMapper.insertPhotosMovie(photosMovie);
    }

    /**
     * 修改影视相册
     *
     * @param photosMovie 影视相册
     * @return 结果
     */
    @Override
    public int updatePhotosMovie(PhotosMovie photosMovie)
    {
        photosMovie.setUpdateTime(DateUtils.getNowDate());
        return photosMovieMapper.updatePhotosMovie(photosMovie);
    }

    /**
     * 批量删除影视相册
     *
     * @param ids 需要删除的影视相册主键
     * @return 结果
     */
    @Override
    public int deletePhotosMovieByIds(Long[] ids)
    {
        return photosMovieMapper.deletePhotosMovieByIds(ids);
    }

    /**
     * 删除影视相册信息
     *
     * @param id 影视相册主键
     * @return 结果
     */
    @Override
    public int deletePhotosMovieById(Long id)
    {
        return photosMovieMapper.deletePhotosMovieById(id);
    }
}
