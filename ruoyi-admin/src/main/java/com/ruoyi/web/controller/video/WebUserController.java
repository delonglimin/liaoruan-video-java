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
import com.ruoyi.video.domain.WebUser;
import com.ruoyi.video.service.IWebUserService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户管理Controller
 *
 * @author ruoyi
 * @date 2023-10-23
 */
@RestController
@RequestMapping("/web/user")
public class WebUserController extends BaseController
{
    @Autowired
    private IWebUserService webUserService;

    /**
     * 查询用户管理列表
     */
    @PreAuthorize("@ss.hasPermi('video:user:list')")
    @GetMapping("/list")
    public TableDataInfo list(WebUser webUser)
    {
        startPage();
        List<WebUser> list = webUserService.selectWebUserList(webUser);
        return getDataTable(list);
    }

    /**
     * 导出用户管理列表
     */
    @PreAuthorize("@ss.hasPermi('video:user:export')")
    @Log(title = "用户管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WebUser webUser)
    {
        List<WebUser> list = webUserService.selectWebUserList(webUser);
        ExcelUtil<WebUser> util = new ExcelUtil<WebUser>(WebUser.class);
        util.exportExcel(response, list, "用户管理数据");
    }

    /**
     * 获取用户管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('video:user:query')")
    @GetMapping(value = "/{userId}")
    public AjaxResult getInfo(@PathVariable("userId") Long userId)
    {
        return success(webUserService.selectWebUserByUserId(userId));
    }

    /**
     * 新增用户管理
     */
    @PreAuthorize("@ss.hasPermi('video:user:add')")
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WebUser webUser)
    {
        return toAjax(webUserService.insertWebUser(webUser));
    }

    /**
     * 修改用户管理
     */
    @PreAuthorize("@ss.hasPermi('video:user:edit')")
    @Log(title = "用户管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WebUser webUser)
    {
        return toAjax(webUserService.updateWebUser(webUser));
    }

    /**
     * 删除用户管理
     */
    @PreAuthorize("@ss.hasPermi('video:user:remove')")
    @Log(title = "用户管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{userIds}")
    public AjaxResult remove(@PathVariable Long[] userIds)
    {
        return toAjax(webUserService.deleteWebUserByUserIds(userIds));
    }
}
