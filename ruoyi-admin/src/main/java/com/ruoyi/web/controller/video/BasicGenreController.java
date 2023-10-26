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
import com.ruoyi.video.domain.BasicGenre;
import com.ruoyi.video.service.IBasicGenreService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基础数据-类型管理Controller
 *
 * @author ruoyi
 * @date 2023-10-17
 */
@RestController
@RequestMapping("/basic/genre")
public class BasicGenreController extends BaseController
{
    @Autowired
    private IBasicGenreService basicGenreService;

    /**
     * 查询基础数据-类型管理列表
     */
    @PreAuthorize("@ss.hasPermi('video:genre:list')")
    @GetMapping("/list")
    public TableDataInfo list(BasicGenre basicGenre)
    {
        startPage();
        List<BasicGenre> list = basicGenreService.selectBasicGenreList(basicGenre);
        return getDataTable(list);
    }

    /**
     * 查询基础数据-类型管理列表
     */
    @PreAuthorize("@ss.hasPermi('video:genre:all')")
    @GetMapping("/all")
    public AjaxResult all(BasicGenre basicGenre)
    {
        List<BasicGenre> list = basicGenreService.selectBasicGenreList(basicGenre);
        return success(list);
    }

    /**
     * 导出基础数据-类型管理列表
     */
    @PreAuthorize("@ss.hasPermi('video:genre:export')")
    @Log(title = "基础数据-类型管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BasicGenre basicGenre)
    {
        List<BasicGenre> list = basicGenreService.selectBasicGenreList(basicGenre);
        ExcelUtil<BasicGenre> util = new ExcelUtil<BasicGenre>(BasicGenre.class);
        util.exportExcel(response, list, "基础数据-类型管理数据");
    }

    /**
     * 获取基础数据-类型管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('video:genre:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(basicGenreService.selectBasicGenreById(id));
    }

    /**
     * 新增基础数据-类型管理
     */
    @PreAuthorize("@ss.hasPermi('video:genre:add')")
    @Log(title = "基础数据-类型管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BasicGenre basicGenre)
    {
        return toAjax(basicGenreService.insertBasicGenre(basicGenre));
    }

    /**
     * 修改基础数据-类型管理
     */
    @PreAuthorize("@ss.hasPermi('video:genre:edit')")
    @Log(title = "基础数据-类型管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BasicGenre basicGenre)
    {
        return toAjax(basicGenreService.updateBasicGenre(basicGenre));
    }

    /**
     * 删除基础数据-类型管理
     */
    @PreAuthorize("@ss.hasPermi('video:genre:remove')")
    @Log(title = "基础数据-类型管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(basicGenreService.deleteBasicGenreByIds(ids));
    }
}
