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
import com.ruoyi.video.domain.BasicLink;
import com.ruoyi.video.service.IBasicLinkService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * linkController
 *
 * @author ruoyi
 * @date 2023-11-13
 */
@RestController
@RequestMapping("/basic/link")
public class BasicLinkController extends BaseController
{
    @Autowired
    private IBasicLinkService basicLinkService;

    /**
     * 查询link列表
     */
    @PreAuthorize("@ss.hasPermi('video:link:list')")
    @GetMapping("/list")
    public TableDataInfo list(BasicLink basicLink)
    {
        startPage();
        List<BasicLink> list = basicLinkService.selectBasicLinkList(basicLink);
        return getDataTable(list);
    }

    /**
     * 导出link列表
     */
    @PreAuthorize("@ss.hasPermi('video:link:export')")
    @Log(title = "link", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BasicLink basicLink)
    {
        List<BasicLink> list = basicLinkService.selectBasicLinkList(basicLink);
        ExcelUtil<BasicLink> util = new ExcelUtil<BasicLink>(BasicLink.class);
        util.exportExcel(response, list, "link数据");
    }

    /**
     * 获取link详细信息
     */
    @PreAuthorize("@ss.hasPermi('video:link:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(basicLinkService.selectBasicLinkById(id));
    }

    /**
     * 新增link
     */
    @PreAuthorize("@ss.hasPermi('video:link:add')")
    @Log(title = "link", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BasicLink basicLink)
    {
        return toAjax(basicLinkService.insertBasicLink(basicLink));
    }

    /**
     * 修改link
     */
    @PreAuthorize("@ss.hasPermi('video:link:edit')")
    @Log(title = "link", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BasicLink basicLink)
    {
        return toAjax(basicLinkService.updateBasicLink(basicLink));
    }

    /**
     * 删除link
     */
    @PreAuthorize("@ss.hasPermi('video:link:remove')")
    @Log(title = "link", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(basicLinkService.deleteBasicLinkByIds(ids));
    }
}
