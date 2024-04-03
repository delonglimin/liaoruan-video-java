package com.ruoyi.api.controller;

import com.github.pagehelper.PageHelper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.video.domain.BasicGenre;
import com.ruoyi.video.domain.Columns;
import com.ruoyi.video.domain.MovieBasic;
import com.ruoyi.video.mapper.MovieBasicMapper;
import com.ruoyi.video.service.IBasicGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/web")
public class WebController extends BaseController {

    @Autowired
    private MovieBasicMapper movieBasicMapper;

    @Autowired
    private IBasicGenreService basicGenreService;

    /**
     * 导航大栏目
     */
    @GetMapping(value = "/type/{column}")
    public AjaxResult list(@PathVariable String column) {


        BasicGenre param = new BasicGenre();
        param.setColumnValue(column);
        List<BasicGenre> genres = basicGenreService.selectBasicGenreList(param);
        List<HashMap<String, Object>> result = new ArrayList<>();
        genres.forEach(item -> {
            HashMap<String, Object> temp = new HashMap();
            temp.put("name", item.getName());
            temp.put("id", item.getId());

            //分类下的最新

            MovieBasic mb = new MovieBasic();
            mb.setColumnValue(column);
            mb.setGenres(item.getName());
            PageHelper.startPage(0, 12, "id desc").setReasonable(true);
            List<HashMap> listMb = movieBasicMapper.selecMovieItems(mb);
            temp.put("rows", listMb);
            PageHelper.clearPage();

            // 获取栏目下的排行，根据pv

            PageHelper.startPage(0, 14, "pv desc").setReasonable(true);
            List<HashMap> listRanks = movieBasicMapper.selecMovieItemsRank(mb);
            temp.put("ranks", listRanks);
            PageHelper.clearPage();

            result.add(temp);

        });
        return success(result);
    }
}
