package com.ruoyi.api.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.video.domain.Columns;
import com.ruoyi.video.service.IColumnsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 栏目管理Controller
 *
 * @author ruoyi
 * @date 2023-10-12
 */
@RestController
@RequestMapping("/column")
public class ColumnController extends BaseController
{
    @Autowired
    private IColumnsService columnsService;



    /**
     * 查询栏目管理列表
     */
    @GetMapping("/all")
    public AjaxResult all(Columns columns)
    {
        List<Columns> list = columnsService.selectColumnsList(columns);
        return success(list);
    }


    /**
     * 获取栏目管理详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(columnsService.selectColumnsById(id));
    }


    /**
     * 根据value获取栏目管理详细信息
     */
    @GetMapping
    public AjaxResult getInfoByValue(@RequestParam("value") String value)
    {
        return success(columnsService.selectColumnsByValue(value));
    }

}
