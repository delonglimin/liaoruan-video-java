package com.ruoyi.web.controller.video;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.utils.DateUtils;
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
import com.ruoyi.video.domain.Columns;
import com.ruoyi.video.service.IColumnsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 栏目管理Controller
 *
 * @author ruoyi
 * @date 2023-10-12
 */
@RestController
@RequestMapping("/column")
public class ColumnsController extends BaseController
{
    @Autowired
    private IColumnsService columnsService;

    /**
     * 查询栏目管理列表
     */
    @PreAuthorize("@ss.hasPermi('video:columns:list')")
    @GetMapping("/list")
    public TableDataInfo list(Columns columns)
    {
        startPage();
        List<Columns> list = columnsService.selectColumnsList(columns);
        return getDataTable(list);
    }

    /**
     * 查询栏目管理列表
     */
    @PreAuthorize("@ss.hasPermi('video:columns:list')")
    @GetMapping("/all")
    public AjaxResult all(Columns columns)
    {
        List<Columns> list = columnsService.selectColumnsList(columns);
        return success(list);
    }

    /**
     * 导出栏目管理列表
     */
    @PreAuthorize("@ss.hasPermi('video:columns:export')")
    @Log(title = "栏目管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Columns columns)
    {
        List<Columns> list = columnsService.selectColumnsList(columns);
        ExcelUtil<Columns> util = new ExcelUtil<Columns>(Columns.class);
        util.exportExcel(response, list, "栏目管理数据");
    }

    /**
     * 获取栏目管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('video:columns:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(columnsService.selectColumnsById(id));
    }

    /**
     * 新增栏目管理
     */
    @PreAuthorize("@ss.hasPermi('video:columns:add')")
    @Log(title = "栏目管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Columns columns)
    {
        columns.setCreateTime(DateUtils.getNowDate());
        columns.setCreateBy(getUsername());
        return toAjax(columnsService.insertColumns(columns));
    }

    /**
     * 修改栏目管理
     */
    @PreAuthorize("@ss.hasPermi('video:columns:edit')")
    @Log(title = "栏目管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Columns columns)
    {
        return toAjax(columnsService.updateColumns(columns));
    }

    /**
     * 删除栏目管理
     */
    @PreAuthorize("@ss.hasPermi('video:columns:remove')")
    @Log(title = "栏目管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(columnsService.deleteColumnsByIds(ids));
    }
}
