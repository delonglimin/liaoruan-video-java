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

}
