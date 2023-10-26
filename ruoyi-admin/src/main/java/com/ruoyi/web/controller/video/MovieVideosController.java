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
import com.ruoyi.video.domain.MovieVideos;
import com.ruoyi.video.service.IMovieVideosService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 影视视频Controller
 *
 * @author ruoyi
 * @date 2023-10-24
 */
@RestController
@RequestMapping("/movie/videos")
public class MovieVideosController extends BaseController
{
    @Autowired
    private IMovieVideosService movieVideosService;

    /**
     * 查询影视视频列表
     */
    @PreAuthorize("@ss.hasPermi('video:videos:list')")
    @GetMapping("/list")
    public TableDataInfo list(MovieVideos movieVideos)
    {
        startPage();
        List<MovieVideos> list = movieVideosService.selectMovieVideosList(movieVideos);
        return getDataTable(list);
    }

    /**
     * 导出影视视频列表
     */
    @PreAuthorize("@ss.hasPermi('video:videos:export')")
    @Log(title = "影视视频", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MovieVideos movieVideos)
    {
        List<MovieVideos> list = movieVideosService.selectMovieVideosList(movieVideos);
        ExcelUtil<MovieVideos> util = new ExcelUtil<MovieVideos>(MovieVideos.class);
        util.exportExcel(response, list, "影视视频数据");
    }

    /**
     * 获取影视视频详细信息
     */
    @PreAuthorize("@ss.hasPermi('video:videos:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(movieVideosService.selectMovieVideosById(id));
    }

    /**
     * 新增影视视频
     */
    @PreAuthorize("@ss.hasPermi('video:videos:add')")
    @Log(title = "影视视频", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MovieVideos movieVideos)
    {
        return toAjax(movieVideosService.insertMovieVideos(movieVideos));
    }

    /**
     * 修改影视视频
     */
    @PreAuthorize("@ss.hasPermi('video:videos:edit')")
    @Log(title = "影视视频", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MovieVideos movieVideos)
    {
        return toAjax(movieVideosService.updateMovieVideos(movieVideos));
    }

    /**
     * 删除影视视频
     */
    @PreAuthorize("@ss.hasPermi('video:videos:remove')")
    @Log(title = "影视视频", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(movieVideosService.deleteMovieVideosByIds(ids));
    }
}
