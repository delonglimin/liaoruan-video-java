package com.ruoyi.api.controller;

import com.github.pagehelper.PageHelper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.video.domain.Columns;
import com.ruoyi.video.domain.MovieBasic;
import com.ruoyi.video.mapper.ColumnsMapper;
import com.ruoyi.video.mapper.MovieBasicMapper;
import com.ruoyi.video.service.IColumnsService;
import com.ruoyi.video.service.IMovieBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * movieController
 *
 * @author ruoyi
 * @date 2023-10-20
 */
@RestController
@RequestMapping("/movie")
public class MovieController extends BaseController
{

    @Autowired
    private MovieBasicMapper movieBasicMapper;

    /**
     *
     */
    @GetMapping("/list")
    public AjaxResult list(String keyword)
    {

        MovieBasic mb = new MovieBasic();
        if(!StringUtils.isEmpty(keyword)){
            mb.setTitle(keyword);
        }
        startPage();
        List<HashMap> list = movieBasicMapper.selecMovieItems(mb);
        return success(list);

    }
}
