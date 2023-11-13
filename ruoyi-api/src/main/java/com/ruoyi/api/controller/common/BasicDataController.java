package com.ruoyi.api.controller.common;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.video.domain.BasicBanner;
import com.ruoyi.video.domain.BasicLink;
import com.ruoyi.video.service.IBasicBannerService;
import com.ruoyi.video.service.IBasicLinkService;
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
@RequestMapping("/basic")
public class BasicDataController extends BaseController
{
    @Autowired
    private IBasicLinkService basicLinkService;

    /**
     * 查询banner列表
     */
    @GetMapping("/link/all")
    public AjaxResult all(BasicLink basicLink)
    {
        List<BasicLink> list = basicLinkService.selectBasicLinkList(basicLink);
        return success(list);
    }


}
