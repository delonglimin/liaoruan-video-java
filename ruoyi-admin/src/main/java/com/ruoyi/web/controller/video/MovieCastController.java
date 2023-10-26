package com.ruoyi.web.controller.video;

import java.util.List;
import java.util.Map;
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
import com.ruoyi.video.domain.MovieCast;
import com.ruoyi.video.service.IMovieCastService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * movie castController
 *
 * @author ruoyi
 * @date 2023-10-24
 */
@RestController
@RequestMapping("/movie/cast")
public class MovieCastController extends BaseController
{
    @Autowired
    private IMovieCastService movieCastService;

    /**
     * 查询movie cast列表
     */
    @PreAuthorize("@ss.hasPermi('video:cast:list')")
    @GetMapping("/list")
    public TableDataInfo list(MovieCast movieCast)
    {
        startPage();
        List<Map> list = movieCastService.selectMovieCastListMap(movieCast);
        return getDataTable(list);
    }

    /**
     * 导出movie cast列表
     */
    @PreAuthorize("@ss.hasPermi('video:cast:export')")
    @Log(title = "movie cast", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MovieCast movieCast)
    {
        List<MovieCast> list = movieCastService.selectMovieCastList(movieCast);
        ExcelUtil<MovieCast> util = new ExcelUtil<MovieCast>(MovieCast.class);
        util.exportExcel(response, list, "movie cast数据");
    }

    /**
     * 获取movie cast详细信息
     */
    @PreAuthorize("@ss.hasPermi('video:cast:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(movieCastService.selectMovieCastById(id));
    }

    /**
     * 新增movie cast
     */
    @PreAuthorize("@ss.hasPermi('video:cast:add')")
    @Log(title = "movie cast", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MovieCast movieCast)
    {
        return toAjax(movieCastService.insertMovieCast(movieCast));
    }

    /**
     * 修改movie cast
     */
    @PreAuthorize("@ss.hasPermi('video:cast:edit')")
    @Log(title = "movie cast", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MovieCast movieCast)
    {
        return toAjax(movieCastService.updateMovieCast(movieCast));
    }

    /**
     * 删除movie cast
     */
    @PreAuthorize("@ss.hasPermi('video:cast:remove')")
    @Log(title = "movie cast", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(movieCastService.deleteMovieCastByIds(ids));
    }
}
