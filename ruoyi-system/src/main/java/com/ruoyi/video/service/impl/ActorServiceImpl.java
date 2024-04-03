package com.ruoyi.video.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.ActorMapper;
import com.ruoyi.video.domain.Actor;
import com.ruoyi.video.service.IActorService;

/**
 * 影人Service业务层处理
 *
 * @author ruoyi
 * @date 2023-10-23
 */
@Service
public class ActorServiceImpl implements IActorService
{
    @Autowired
    private ActorMapper actorMapper;

    /**
     * 查询影人
     *
     * @param id 影人主键
     * @return 影人
     */
    @Override
    public Actor selectActorById(Long id)
    {
        return actorMapper.selectActorById(id);
    }

    /**
     * 查询影人列表
     *
     * @param actor 影人
     * @return 影人
     */
    @Override
    public List<Actor> selectActorList(Actor actor)
    {
        return actorMapper.selectActorList(actor);
    }

    /**
     * 新增影人
     *
     * @param actor 影人
     * @return 结果
     */
    @Override
    public int insertActor(Actor actor)
    {
        actor.setCreateTime(DateUtils.getNowDate());
        return actorMapper.insertActor(actor);
    }

    /**
     * 修改影人
     *
     * @param actor 影人
     * @return 结果
     */
    @Override
    public int updateActor(Actor actor)
    {
        actor.setUpdateTime(DateUtils.getNowDate());
        return actorMapper.updateActor(actor);
    }

    /**
     * 批量删除影人
     *
     * @param ids 需要删除的影人主键
     * @return 结果
     */
    @Override
    public int deleteActorByIds(Long[] ids)
    {
        return actorMapper.deleteActorByIds(ids);
    }

    /**
     * 删除影人信息
     *
     * @param id 影人主键
     * @return 结果
     */
    @Override
    public int deleteActorById(Long id)
    {
        return actorMapper.deleteActorById(id);
    }
}
