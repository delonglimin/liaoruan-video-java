package com.ruoyi.web.controller.video;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.video.domain.Actor;
import com.ruoyi.video.service.IActorService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 影人Controller
 *
 * @author ruoyi
 * @date 2023-10-23
 */
@RestController
@RequestMapping("/actor")
public class ActorController extends BaseController
{
    @Autowired
    private IActorService actorService;

    /**
     * 查询影人列表
     */
    @PreAuthorize("@ss.hasPermi('video:actor:list')")
    @GetMapping("/list")
    public TableDataInfo list(Actor actor)
    {
        startPage();
        List<Actor> list = actorService.selectActorList(actor);
        return getDataTable(list);
    }

    /**
     * 查询影人列表
     */
    @PreAuthorize("@ss.hasPermi('video:actor:list')")
    @GetMapping("/all")
    public TableDataInfo all(String keyword)
    {
        Actor actor = new Actor();
        actor.setName(keyword);
        startPage();
        List<Actor> list = actorService.selectActorList(actor);
        return getDataTable(list);
    }

    /**
     * 导出影人列表
     */
    @PreAuthorize("@ss.hasPermi('video:actor:export')")
    @Log(title = "影人", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Actor actor)
    {
        List<Actor> list = actorService.selectActorList(actor);
        ExcelUtil<Actor> util = new ExcelUtil<Actor>(Actor.class);
        util.exportExcel(response, list, "影人数据");
    }

    /**
     * 获取影人详细信息
     */
    @PreAuthorize("@ss.hasPermi('video:actor:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(actorService.selectActorById(id));
    }

    /**
     * 新增影人
     */
    @PreAuthorize("@ss.hasPermi('video:actor:add')")
    @Log(title = "影人", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Actor actor)
    {
        return toAjax(actorService.insertActor(actor));
    }

    /**
     * 修改影人
     */
    @PreAuthorize("@ss.hasPermi('video:actor:edit')")
    @Log(title = "影人", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Actor actor)
    {
        return toAjax(actorService.updateActor(actor));
    }

    /**
     * 删除影人
     */
    @PreAuthorize("@ss.hasPermi('video:actor:remove')")
    @Log(title = "影人", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(actorService.deleteActorByIds(ids));
    }
}
