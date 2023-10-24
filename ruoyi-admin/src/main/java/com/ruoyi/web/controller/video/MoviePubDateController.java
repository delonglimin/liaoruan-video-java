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
import com.ruoyi.video.domain.MoviePubDate;
import com.ruoyi.video.service.IMoviePubDateService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 上映时间Controller
 *
 * @author ruoyi
 * @date 2023-10-24
 */
@RestController
@RequestMapping("/movie/pubDate")
public class MoviePubDateController extends BaseController
{
    @Autowired
    private IMoviePubDateService moviePubDateService;

    /**
     * 查询上映时间列表
     */
    @PreAuthorize("@ss.hasPermi('video:pubDate:list')")
    @GetMapping("/list")
    public TableDataInfo list(MoviePubDate moviePubDate)
    {
        startPage();
        List<MoviePubDate> list = moviePubDateService.selectMoviePubDateList(moviePubDate);
        return getDataTable(list);
    }

    /**
     * 导出上映时间列表
     */
    @PreAuthorize("@ss.hasPermi('video:pubDate:export')")
    @Log(title = "上映时间", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MoviePubDate moviePubDate)
    {
        List<MoviePubDate> list = moviePubDateService.selectMoviePubDateList(moviePubDate);
        ExcelUtil<MoviePubDate> util = new ExcelUtil<MoviePubDate>(MoviePubDate.class);
        util.exportExcel(response, list, "上映时间数据");
    }

    /**
     * 获取上映时间详细信息
     */
    @PreAuthorize("@ss.hasPermi('video:pubDate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(moviePubDateService.selectMoviePubDateById(id));
    }

    /**
     * 新增上映时间
     */
    @PreAuthorize("@ss.hasPermi('video:pubDate:add')")
    @Log(title = "上映时间", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MoviePubDate moviePubDate)
    {
        return toAjax(moviePubDateService.insertMoviePubDate(moviePubDate));
    }

    /**
     * 修改上映时间
     */
    @PreAuthorize("@ss.hasPermi('video:pubDate:edit')")
    @Log(title = "上映时间", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MoviePubDate moviePubDate)
    {
        return toAjax(moviePubDateService.updateMoviePubDate(moviePubDate));
    }

    /**
     * 删除上映时间
     */
    @PreAuthorize("@ss.hasPermi('video:pubDate:remove')")
    @Log(title = "上映时间", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(moviePubDateService.deleteMoviePubDateByIds(ids));
    }
}
