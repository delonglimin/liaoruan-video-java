package com.ruoyi.api.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.video.domain.BasicBanner;
import com.ruoyi.video.service.IBasicBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * bannerController
 *
 * @author ruoyi
 * @date 2023-10-20
 */
@RestController
@RequestMapping("/basic/banner")
public class BannerController extends BaseController
{
    @Autowired
    private IBasicBannerService basicBannerService;

    /**
     * 查询banner列表
     */
    @GetMapping("/list")
    public TableDataInfo list(BasicBanner basicBanner)
    {
        startPage();
        List<BasicBanner> list = basicBannerService.selectBasicBannerList(basicBanner);
        return getDataTable(list);
    }

    /**
     * 导出banner列表
     */
    @PreAuthorize("@ss.hasPermi('video:banner:export')")
    @Log(title = "banner", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BasicBanner basicBanner)
    {
        List<BasicBanner> list = basicBannerService.selectBasicBannerList(basicBanner);
        ExcelUtil<BasicBanner> util = new ExcelUtil<BasicBanner>(BasicBanner.class);
        util.exportExcel(response, list, "banner数据");
    }

    /**
     * 获取banner详细信息
     */
    @PreAuthorize("@ss.hasPermi('video:banner:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(basicBannerService.selectBasicBannerById(id));
    }

    /**
     * 新增banner
     */
    @PreAuthorize("@ss.hasPermi('video:banner:add')")
    @Log(title = "banner", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BasicBanner basicBanner)
    {
        return toAjax(basicBannerService.insertBasicBanner(basicBanner));
    }

    /**
     * 修改banner
     */
    @PreAuthorize("@ss.hasPermi('video:banner:edit')")
    @Log(title = "banner", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BasicBanner basicBanner)
    {
        return toAjax(basicBannerService.updateBasicBanner(basicBanner));
    }

    /**
     * 删除banner
     */
    @PreAuthorize("@ss.hasPermi('video:banner:remove')")
    @Log(title = "banner", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(basicBannerService.deleteBasicBannerByIds(ids));
    }
}
