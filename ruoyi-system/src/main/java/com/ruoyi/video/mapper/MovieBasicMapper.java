package com.ruoyi.video.mapper;

import java.util.HashMap;
import java.util.List;
import com.ruoyi.video.domain.MovieBasic;

/**
 * 影视Mapper接口
 *
 * @author ruoyi
 * @date 2023-10-23
 */
public interface MovieBasicMapper
{
    /**
     * 查询影视
     *
     * @param id 影视主键
     * @return 影视
     */
    public MovieBasic selectMovieBasicById(Long id);

    /**
     * 查询影视列表
     *
     * @param movieBasic 影视
     * @return 影视集合
     */
    public List<MovieBasic> selectMovieBasicList(MovieBasic movieBasic);

    /**
     * 新增影视
     *
     * @param movieBasic 影视
     * @return 结果
     */
    public int insertMovieBasic(MovieBasic movieBasic);

    /**
     * 修改影视
     *
     * @param movieBasic 影视
     * @return 结果
     */
    public int updateMovieBasic(MovieBasic movieBasic);

    /**
     * 删除影视
     *
     * @param id 影视主键
     * @return 结果
     */
    public int deleteMovieBasicById(Long id);

    /**
     * 批量删除影视
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMovieBasicByIds(Long[] ids);



    public List<HashMap> selecMovieItems(MovieBasic movieBasic);
    public List<HashMap> selecMovieItemsRank(MovieBasic movieBasic);
}
