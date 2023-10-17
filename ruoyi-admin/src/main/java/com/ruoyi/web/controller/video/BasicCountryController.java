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
import com.ruoyi.video.domain.BasicCountry;
import com.ruoyi.video.service.IBasicCountryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 国家管理Controller
 *
 * @author ruoyi
 * @date 2023-10-13
 */
@RestController
@RequestMapping("/basic/country")
public class BasicCountryController extends BaseController
{
    @Autowired
    private IBasicCountryService basicCountryService;

    /**
     * 查询国家管理列表
     */
    @PreAuthorize("@ss.hasPermi('web:country:list')")
    @GetMapping("/list")
    public TableDataInfo list(BasicCountry basicCountry)
    {
        startPage();
        List<BasicCountry> list = basicCountryService.selectBasicCountryList(basicCountry);
        return getDataTable(list);
    }

    /**
     * 导出国家管理列表
     */
    @PreAuthorize("@ss.hasPermi('web:country:export')")
    @Log(title = "国家管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BasicCountry basicCountry)
    {
        List<BasicCountry> list = basicCountryService.selectBasicCountryList(basicCountry);
        ExcelUtil<BasicCountry> util = new ExcelUtil<BasicCountry>(BasicCountry.class);
        util.exportExcel(response, list, "国家管理数据");
    }

    /**
     * 获取国家管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('web:country:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(basicCountryService.selectBasicCountryById(id));
    }

    /**
     * 新增国家管理
     */
    @PreAuthorize("@ss.hasPermi('web:country:add')")
    @Log(title = "国家管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BasicCountry basicCountry)
    {
        return toAjax(basicCountryService.insertBasicCountry(basicCountry));
    }

    /**
     * 修改国家管理
     */
    @PreAuthorize("@ss.hasPermi('web:country:edit')")
    @Log(title = "国家管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BasicCountry basicCountry)
    {
        return toAjax(basicCountryService.updateBasicCountry(basicCountry));
    }

    /**
     * 删除国家管理
     */
    @PreAuthorize("@ss.hasPermi('web:country:remove')")
    @Log(title = "国家管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(basicCountryService.deleteBasicCountryByIds(ids));
    }
}
