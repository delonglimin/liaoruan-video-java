package com.ruoyi.video.service;

import java.util.List;
import com.ruoyi.video.domain.MoviePv;

/**
 * pvService接口
 *
 * @author ruoyi
 * @date 2023-11-14
 */
public interface IMoviePvService
{
    /**
     * 查询pv
     *
     * @param id pv主键
     * @return pv
     */
    public MoviePv selectMoviePvById(Long id);

    /**
     * 查询pv列表
     *
     * @param moviePv pv
     * @return pv集合
     */
    public List<MoviePv> selectMoviePvList(MoviePv moviePv);

    /**
     * 新增pv
     *
     * @param moviePv pv
     * @return 结果
     */
    public int insertMoviePv(MoviePv moviePv);

    /**
     * 修改pv
     *
     * @param moviePv pv
     * @return 结果
     */
    public int updateMoviePv(MoviePv moviePv);

    /**
     * 批量删除pv
     *
     * @param ids 需要删除的pv主键集合
     * @return 结果
     */
    public int deleteMoviePvByIds(Long[] ids);

    /**
     * 删除pv信息
     *
     * @param id pv主键
     * @return 结果
     */
    public int deleteMoviePvById(Long id);
}
