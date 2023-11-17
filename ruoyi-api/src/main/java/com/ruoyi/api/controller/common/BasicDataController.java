package com.ruoyi.api.controller.common;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.video.domain.*;
import com.ruoyi.video.service.*;
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
public class BasicDataController extends BaseController {
    @Autowired
    private IBasicLinkService basicLinkService;

    @Autowired
    private IBasicGenreService basicGenreService;


    @Autowired
    private IBasicCountryService basicCountryService;

    @Autowired
    private IBasicLanguageService basicLanguageService;


    /**
     * 查询banner列表
     */
    @GetMapping("/link/all")
    public AjaxResult allLink(BasicLink basicLink) {
        List<BasicLink> list = basicLinkService.selectBasicLinkList(basicLink);
        return success(list);
    }

    /**
     * 查询分类列表
     */
    @GetMapping("/genre/all")
    public AjaxResult allGenre(BasicGenre basicGenre) {
        List<BasicGenre> list = basicGenreService.selectBasicGenreList(basicGenre);
        return success(list);
    }

    /**
     * 查询国家列表
     */
    @GetMapping("/country/all")
    public AjaxResult allCountry(BasicCountry basicCountry) {
        List<BasicCountry> list = basicCountryService.selectBasicCountryList(basicCountry);
        return success(list);
    }

    /**
     * 查询语言列表
     */
    @GetMapping("/language/all")
    public AjaxResult allLanguage(BasicLanguage basicLanguage) {
        List<BasicLanguage> list = basicLanguageService.selectBasicLanguageList(basicLanguage);
        return success(list);
    }


}
