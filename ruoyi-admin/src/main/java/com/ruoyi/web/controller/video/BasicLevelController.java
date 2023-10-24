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
import com.ruoyi.video.domain.BasicLevel;
import com.ruoyi.video.service.IBasicLevelService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基础数据-家长引导Controller
 *
 * @author ruoyi
 * @date 2023-10-20
 */
@RestController
@RequestMapping("/basic/level")
public class BasicLevelController extends BaseController
{
    @Autowired
    private IBasicLevelService basicLevelService;

    /**
     * 查询基础数据-家长引导列表
     */
    @PreAuthorize("@ss.hasPermi('video:level:list')")
    @GetMapping("/list")
    public TableDataInfo list(BasicLevel basicLevel)
    {
        startPage();
        List<BasicLevel> list = basicLevelService.selectBasicLevelList(basicLevel);
        return getDataTable(list);
    }

    /**
     * 导出基础数据-家长引导列表
     */
    @PreAuthorize("@ss.hasPermi('video:level:export')")
    @Log(title = "基础数据-家长引导", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BasicLevel basicLevel)
    {
        List<BasicLevel> list = basicLevelService.selectBasicLevelList(basicLevel);
        ExcelUtil<BasicLevel> util = new ExcelUtil<BasicLevel>(BasicLevel.class);
        util.exportExcel(response, list, "基础数据-家长引导数据");
    }

    /**
     * 获取基础数据-家长引导详细信息
     */
    @PreAuthorize("@ss.hasPermi('video:level:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(basicLevelService.selectBasicLevelById(id));
    }

    /**
     * 新增基础数据-家长引导
     */
    @PreAuthorize("@ss.hasPermi('video:level:add')")
    @Log(title = "基础数据-家长引导", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BasicLevel basicLevel)
    {
        return toAjax(basicLevelService.insertBasicLevel(basicLevel));
    }

    /**
     * 修改基础数据-家长引导
     */
    @PreAuthorize("@ss.hasPermi('video:level:edit')")
    @Log(title = "基础数据-家长引导", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BasicLevel basicLevel)
    {
        return toAjax(basicLevelService.updateBasicLevel(basicLevel));
    }

    /**
     * 删除基础数据-家长引导
     */
    @PreAuthorize("@ss.hasPermi('video:level:remove')")
    @Log(title = "基础数据-家长引导", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(basicLevelService.deleteBasicLevelByIds(ids));
    }
}
