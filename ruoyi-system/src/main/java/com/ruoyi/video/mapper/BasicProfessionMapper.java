package com.ruoyi.video.mapper;

import java.util.List;
import com.ruoyi.video.domain.BasicProfession;

/**
 * 基础数据-影人职务Mapper接口
 *
 * @author ruoyi
 * @date 2023-10-20
 */
public interface BasicProfessionMapper
{
    /**
     * 查询基础数据-影人职务
     *
     * @param id 基础数据-影人职务主键
     * @return 基础数据-影人职务
     */
    public BasicProfession selectBasicProfessionById(Long id);

    /**
     * 查询基础数据-影人职务列表
     *
     * @param basicProfession 基础数据-影人职务
     * @return 基础数据-影人职务集合
     */
    public List<BasicProfession> selectBasicProfessionList(BasicProfession basicProfession);

    /**
     * 新增基础数据-影人职务
     *
     * @param basicProfession 基础数据-影人职务
     * @return 结果
     */
    public int insertBasicProfession(BasicProfession basicProfession);

    /**
     * 修改基础数据-影人职务
     *
     * @param basicProfession 基础数据-影人职务
     * @return 结果
     */
    public int updateBasicProfession(BasicProfession basicProfession);

    /**
     * 删除基础数据-影人职务
     *
     * @param id 基础数据-影人职务主键
     * @return 结果
     */
    public int deleteBasicProfessionById(Long id);

    /**
     * 批量删除基础数据-影人职务
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBasicProfessionByIds(Long[] ids);
}
