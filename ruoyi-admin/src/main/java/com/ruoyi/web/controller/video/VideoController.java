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
import com.ruoyi.video.domain.Video;
import com.ruoyi.video.service.IVideoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 视频管理Controller
 *
 * @author ruoyi
 * @date 2023-10-23
 */
@RestController
@RequestMapping("/video")
public class VideoController extends BaseController
{
    @Autowired
    private IVideoService videoService;

    /**
     * 查询视频管理列表
     */
    @PreAuthorize("@ss.hasPermi('video:video:list')")
    @GetMapping("/list")
    public TableDataInfo list(Video video)
    {
        startPage();
        List<Video> list = videoService.selectVideoList(video);
        return getDataTable(list);
    }

    /**
     * 导出视频管理列表
     */
    @PreAuthorize("@ss.hasPermi('video:video:export')")
    @Log(title = "视频管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Video video)
    {
        List<Video> list = videoService.selectVideoList(video);
        ExcelUtil<Video> util = new ExcelUtil<Video>(Video.class);
        util.exportExcel(response, list, "视频管理数据");
    }

    /**
     * 获取视频管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('video:video:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(videoService.selectVideoById(id));
    }

    /**
     * 新增视频管理
     */
    @PreAuthorize("@ss.hasPermi('video:video:add')")
    @Log(title = "视频管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Video video)
    {
        return toAjax(videoService.insertVideo(video));
    }

    /**
     * 修改视频管理
     */
    @PreAuthorize("@ss.hasPermi('video:video:edit')")
    @Log(title = "视频管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Video video)
    {
        return toAjax(videoService.updateVideo(video));
    }

    /**
     * 删除视频管理
     */
    @PreAuthorize("@ss.hasPermi('video:video:remove')")
    @Log(title = "视频管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(videoService.deleteVideoByIds(ids));
    }
}
