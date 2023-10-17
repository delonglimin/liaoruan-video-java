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
import com.ruoyi.video.domain.BasicLanguage;
import com.ruoyi.video.service.IBasicLanguageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基础数据-语言管理Controller
 *
 * @author ruoyi
 * @date 2023-10-13
 */
@RestController
@RequestMapping("/basic/language")
public class BasicLanguageController extends BaseController
{
    @Autowired
    private IBasicLanguageService basicLanguageService;

    /**
     * 查询基础数据-语言管理列表
     */
    @PreAuthorize("@ss.hasPermi('video:language:list')")
    @GetMapping("/list")
    public TableDataInfo list(BasicLanguage basicLanguage)
    {
        startPage();
        List<BasicLanguage> list = basicLanguageService.selectBasicLanguageList(basicLanguage);
        return getDataTable(list);
    }

    /**
     * 导出基础数据-语言管理列表
     */
    @PreAuthorize("@ss.hasPermi('video:language:export')")
    @Log(title = "基础数据-语言管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BasicLanguage basicLanguage)
    {
        List<BasicLanguage> list = basicLanguageService.selectBasicLanguageList(basicLanguage);
        ExcelUtil<BasicLanguage> util = new ExcelUtil<BasicLanguage>(BasicLanguage.class);
        util.exportExcel(response, list, "基础数据-语言管理数据");
    }

    /**
     * 获取基础数据-语言管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('video:language:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(basicLanguageService.selectBasicLanguageById(id));
    }

    /**
     * 新增基础数据-语言管理
     */
    @PreAuthorize("@ss.hasPermi('video:language:add')")
    @Log(title = "基础数据-语言管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BasicLanguage basicLanguage)
    {
        return toAjax(basicLanguageService.insertBasicLanguage(basicLanguage));
    }

    /**
     * 修改基础数据-语言管理
     */
    @PreAuthorize("@ss.hasPermi('video:language:edit')")
    @Log(title = "基础数据-语言管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BasicLanguage basicLanguage)
    {
        return toAjax(basicLanguageService.updateBasicLanguage(basicLanguage));
    }

    /**
     * 删除基础数据-语言管理
     */
    @PreAuthorize("@ss.hasPermi('video:language:remove')")
    @Log(title = "基础数据-语言管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(basicLanguageService.deleteBasicLanguageByIds(ids));
    }
}
