package com.ruoyi.video.service;

import java.util.List;
import com.ruoyi.video.domain.MoviePubDate;

/**
 * 上映时间Service接口
 *
 * @author ruoyi
 * @date 2023-10-24
 */
public interface IMoviePubDateService
{
    /**
     * 查询上映时间
     *
     * @param id 上映时间主键
     * @return 上映时间
     */
    public MoviePubDate selectMoviePubDateById(Long id);

    /**
     * 查询上映时间列表
     *
     * @param moviePubDate 上映时间
     * @return 上映时间集合
     */
    public List<MoviePubDate> selectMoviePubDateList(MoviePubDate moviePubDate);

    /**
     * 新增上映时间
     *
     * @param moviePubDate 上映时间
     * @return 结果
     */
    public int insertMoviePubDate(MoviePubDate moviePubDate);

    /**
     * 修改上映时间
     *
     * @param moviePubDate 上映时间
     * @return 结果
     */
    public int updateMoviePubDate(MoviePubDate moviePubDate);

    /**
     * 批量删除上映时间
     *
     * @param ids 需要删除的上映时间主键集合
     * @return 结果
     */
    public int deleteMoviePubDateByIds(Long[] ids);

    /**
     * 删除上映时间信息
     *
     * @param id 上映时间主键
     * @return 结果
     */
    public int deleteMoviePubDateById(Long id);
}
