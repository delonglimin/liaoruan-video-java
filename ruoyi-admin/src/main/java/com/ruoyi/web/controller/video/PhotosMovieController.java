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
import com.ruoyi.video.domain.PhotosMovie;
import com.ruoyi.video.service.IPhotosMovieService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 影视相册Controller
 *
 * @author ruoyi
 * @date 2023-10-24
 */
@RestController
@RequestMapping("/photos/movie")
public class PhotosMovieController extends BaseController
{
    @Autowired
    private IPhotosMovieService photosMovieService;

    /**
     * 查询影视相册列表
     */
    @PreAuthorize("@ss.hasPermi('video:movie:list')")
    @GetMapping("/list")
    public TableDataInfo list(PhotosMovie photosMovie)
    {
        startPage();
        List<PhotosMovie> list = photosMovieService.selectPhotosMovieList(photosMovie);
        return getDataTable(list);
    }

    /**
     * 导出影视相册列表
     */
    @PreAuthorize("@ss.hasPermi('video:movie:export')")
    @Log(title = "影视相册", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PhotosMovie photosMovie)
    {
        List<PhotosMovie> list = photosMovieService.selectPhotosMovieList(photosMovie);
        ExcelUtil<PhotosMovie> util = new ExcelUtil<PhotosMovie>(PhotosMovie.class);
        util.exportExcel(response, list, "影视相册数据");
    }

    /**
     * 获取影视相册详细信息
     */
    @PreAuthorize("@ss.hasPermi('video:movie:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(photosMovieService.selectPhotosMovieById(id));
    }

    /**
     * 新增影视相册
     */
    @PreAuthorize("@ss.hasPermi('video:movie:add')")
    @Log(title = "影视相册", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PhotosMovie photosMovie)
    {
        return toAjax(photosMovieService.insertPhotosMovie(photosMovie));
    }

    /**
     * 修改影视相册
     */
    @PreAuthorize("@ss.hasPermi('video:movie:edit')")
    @Log(title = "影视相册", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PhotosMovie photosMovie)
    {
        return toAjax(photosMovieService.updatePhotosMovie(photosMovie));
    }

    /**
     * 删除影视相册
     */
    @PreAuthorize("@ss.hasPermi('video:movie:remove')")
    @Log(title = "影视相册", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(photosMovieService.deletePhotosMovieByIds(ids));
    }
}
