package com.ruoyi.video.mapper;

import java.util.List;
import com.ruoyi.video.domain.Actor;

/**
 * 影人Mapper接口
 *
 * @author ruoyi
 * @date 2023-10-23
 */
public interface ActorMapper
{
    /**
     * 查询影人
     *
     * @param id 影人主键
     * @return 影人
     */
    public Actor selectActorById(Long id);

    /**
     * 查询影人列表
     *
     * @param actor 影人
     * @return 影人集合
     */
    public List<Actor> selectActorList(Actor actor);

    /**
     * 新增影人
     *
     * @param actor 影人
     * @return 结果
     */
    public int insertActor(Actor actor);

    /**
     * 修改影人
     *
     * @param actor 影人
     * @return 结果
     */
    public int updateActor(Actor actor);

    /**
     * 删除影人
     *
     * @param id 影人主键
     * @return 结果
     */
    public int deleteActorById(Long id);

    /**
     * 批量删除影人
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteActorByIds(Long[] ids);
}
