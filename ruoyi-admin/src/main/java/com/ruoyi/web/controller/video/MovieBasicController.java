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
import com.ruoyi.video.domain.MovieBasic;
import com.ruoyi.video.service.IMovieBasicService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 影视Controller
 *
 * @author ruoyi
 * @date 2023-10-23
 */
@RestController
@RequestMapping("/movie")
public class MovieBasicController extends BaseController
{
    @Autowired
    private IMovieBasicService movieBasicService;

    /**
     * 查询影视列表
     */
    @PreAuthorize("@ss.hasPermi('video:movie:list')")
    @GetMapping("/list")
    public TableDataInfo list(MovieBasic movieBasic)
    {
        startPage();
        List<MovieBasic> list = movieBasicService.selectMovieBasicList(movieBasic);

        return getDataTable(list);
    }

    /**
     * 导出影视列表
     */
    @PreAuthorize("@ss.hasPermi('video:movie:export')")
    @Log(title = "影视", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MovieBasic movieBasic)
    {
        List<MovieBasic> list = movieBasicService.selectMovieBasicList(movieBasic);
        ExcelUtil<MovieBasic> util = new ExcelUtil<MovieBasic>(MovieBasic.class);
        util.exportExcel(response, list, "影视数据");
    }

    /**
     * 获取影视详细信息
     */
    @PreAuthorize("@ss.hasPermi('video:movie:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(movieBasicService.selectMovieBasicById(id));
    }

    /**
     * 新增影视
     */
    @PreAuthorize("@ss.hasPermi('video:movie:add')")
    @Log(title = "影视", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MovieBasic movieBasic)
    {
        return toAjax(movieBasicService.insertMovieBasic(movieBasic));
    }

    /**
     * 修改影视
     */
    @PreAuthorize("@ss.hasPermi('video:movie:edit')")
    @Log(title = "影视", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MovieBasic movieBasic)
    {
        return toAjax(movieBasicService.updateMovieBasic(movieBasic));
    }

    /**
     * 删除影视
     */
    @PreAuthorize("@ss.hasPermi('video:movie:remove')")
    @Log(title = "影视", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(movieBasicService.deleteMovieBasicByIds(ids));
    }
}
