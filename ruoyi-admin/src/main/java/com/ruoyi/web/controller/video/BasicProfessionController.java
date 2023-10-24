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
import com.ruoyi.video.domain.BasicProfession;
import com.ruoyi.video.service.IBasicProfessionService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基础数据-影人职务Controller
 *
 * @author ruoyi
 * @date 2023-10-20
 */
@RestController
@RequestMapping("/basic/profession")
public class BasicProfessionController extends BaseController
{
    @Autowired
    private IBasicProfessionService basicProfessionService;

    /**
     * 查询基础数据-影人职务列表
     */
    @PreAuthorize("@ss.hasPermi('video:profession:list')")
    @GetMapping("/list")
    public TableDataInfo list(BasicProfession basicProfession)
    {
        startPage();
        List<BasicProfession> list = basicProfessionService.selectBasicProfessionList(basicProfession);
        return getDataTable(list);
    }

    /**
     * 查询基础数据-影人职务列表
     */
    @PreAuthorize("@ss.hasPermi('video:profession:list')")
    @GetMapping("/all")
    public AjaxResult all(BasicProfession basicProfession)
    {
        List<BasicProfession> list = basicProfessionService.selectBasicProfessionList(basicProfession);
        return success(list);
    }

    /**
     * 导出基础数据-影人职务列表
     */
    @PreAuthorize("@ss.hasPermi('video:profession:export')")
    @Log(title = "基础数据-影人职务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BasicProfession basicProfession)
    {
        List<BasicProfession> list = basicProfessionService.selectBasicProfessionList(basicProfession);
        ExcelUtil<BasicProfession> util = new ExcelUtil<BasicProfession>(BasicProfession.class);
        util.exportExcel(response, list, "基础数据-影人职务数据");
    }

    /**
     * 获取基础数据-影人职务详细信息
     */
    @PreAuthorize("@ss.hasPermi('video:profession:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(basicProfessionService.selectBasicProfessionById(id));
    }

    /**
     * 新增基础数据-影人职务
     */
    @PreAuthorize("@ss.hasPermi('video:profession:add')")
    @Log(title = "基础数据-影人职务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BasicProfession basicProfession)
    {
        return toAjax(basicProfessionService.insertBasicProfession(basicProfession));
    }

    /**
     * 修改基础数据-影人职务
     */
    @PreAuthorize("@ss.hasPermi('video:profession:edit')")
    @Log(title = "基础数据-影人职务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BasicProfession basicProfession)
    {
        return toAjax(basicProfessionService.updateBasicProfession(basicProfession));
    }

    /**
     * 删除基础数据-影人职务
     */
    @PreAuthorize("@ss.hasPermi('video:profession:remove')")
    @Log(title = "基础数据-影人职务", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(basicProfessionService.deleteBasicProfessionByIds(ids));
    }
}
