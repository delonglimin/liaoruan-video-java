package com.ruoyi.api.controller;

import com.github.pagehelper.PageHelper;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.video.domain.BasicBanner;
import com.ruoyi.video.domain.Columns;
import com.ruoyi.video.domain.MovieBasic;
import com.ruoyi.video.mapper.ColumnsMapper;
import com.ruoyi.video.mapper.MovieBasicMapper;
import com.ruoyi.video.service.IBasicBannerService;
import com.ruoyi.video.service.IColumnsService;
import com.ruoyi.video.service.IMovieBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * bannerController
 *
 * @author ruoyi
 * @date 2023-10-20
 */
@RestController
@RequestMapping("/web")
public class IndexController extends BaseController
{
    @Autowired
    private IColumnsService columnsService;

    @Autowired
    private ColumnsMapper columnsMapper;

    @Autowired
    private IMovieBasicService movieBasicService;

    @Autowired
    private MovieBasicMapper movieBasicMapper;

    /**
     *
     */
    @GetMapping("/index")
    public AjaxResult index()
    {
        //全部栏目column，栏目下 全部分类genre，ranks(14)，rows(12),type,value

        Columns param = new Columns();
        param.setType("1");
        List<Columns> cloumns = columnsMapper.selectColumnsWithGenres(param);
        List<HashMap<String,Object>> result = new ArrayList<>();
        cloumns.forEach(item->{
            HashMap<String,Object> temp = new HashMap();
            temp.put("name",item.getName());
            temp.put("type",item.getType());
            temp.put("value",item.getValue());
            temp.put("genres",item.getGenre());

            //获取栏目下的最新影视

            MovieBasic mb = new MovieBasic();
            mb.setColumnValue(item.getValue());
            PageHelper.startPage(0, 14,"id").setReasonable(true);
            List<HashMap> listMb = movieBasicMapper.selecMovieItems(mb);
            temp.put("rows",listMb);
            PageHelper.clearPage();

            // 获取栏目下的排行，根据pv

            PageHelper.startPage(0, 12,"pv desc").setReasonable(true);
            List<HashMap> listRanks = movieBasicMapper.selecMovieItemsRank(mb);
            temp.put("ranks",listRanks);
            PageHelper.clearPage();

            result.add(temp);

        });

        return success(result);

    }


}
