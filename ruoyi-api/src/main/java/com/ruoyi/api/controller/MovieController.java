package com.ruoyi.api.controller;

import com.github.pagehelper.PageHelper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.video.domain.Columns;
import com.ruoyi.video.domain.MovieBasic;
import com.ruoyi.video.domain.MovieCast;
import com.ruoyi.video.domain.MoviePv;
import com.ruoyi.video.mapper.ColumnsMapper;
import com.ruoyi.video.mapper.MovieBasicMapper;
import com.ruoyi.video.mapper.MovieCastMapper;
import com.ruoyi.video.service.IColumnsService;
import com.ruoyi.video.service.IMovieBasicService;
import com.ruoyi.video.service.impl.MovieCastServiceImpl;
import com.ruoyi.video.service.impl.MoviePvServiceImpl;
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
@RequestMapping("/movie")
public class MovieController extends BaseController {

    @Autowired
    private MovieBasicMapper movieBasicMapper;

    @Autowired
    private MovieCastServiceImpl movieCastService;

    @Autowired
    private MoviePvServiceImpl moviePvService;

    /**
     * 获取列表
     */
    @GetMapping("/list")
    public TableDataInfo list(String keyword) {

        MovieBasic mb = new MovieBasic();
        if (!StringUtils.isEmpty(keyword)) {
            mb.setTitle(keyword);
        }
        startPage();
        List<HashMap> list = movieBasicMapper.selecMovieItems(mb);
        return getDataTable(list);

    }

    /**
     * 获取详情
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public AjaxResult list(@PathVariable Long id) {
        MovieBasic mb = movieBasicMapper.selectMovieBasicById(id);
        return success(mb);

    }

    /**
     * 更新pv
     *
     * @param id
     * @return
     */

    @GetMapping("/updatePv/{id}")
    public AjaxResult updatePv(@PathVariable Long id) {
        MoviePv mp = new MoviePv();
        mp.setMovieId(id);
        int result = moviePvService.updateMoviePv(mp);
        return success(result);

    }

    /**
     * 获取演员列表
     *
     * @param movieId
     * @return
     */
    @GetMapping("/cast/list")
    public AjaxResult castList(Long movieId) {
        MovieCast mc = new MovieCast();
        mc.setMovieId(movieId);
        List<HashMap> result = movieCastService.selectMovieCastListMap(mc);
        return success(result);

    }

    /**
     * 获取详情页内部的周月 榜单
     *
     * @param columnValue
     * @return
     */

    @GetMapping("/leaderboard")
    public AjaxResult leaderboard(String columnValue) {

        MovieBasic mb = new MovieBasic();
        mb.setColumnValue(columnValue);

        String date[];
        date = DateUtils.calculateDateRange(7);
        mb.setStartTime(date[0] + " 00:00:00");
        mb.setEndTime(date[1] + " 23:59:59");
        PageHelper.startPage(0, 10, "pv desc").setReasonable(true);
        List<HashMap> weekRanklist = movieBasicMapper.selecMovieItemsRank(mb);
        PageHelper.clearPage();


        date = DateUtils.calculateDateRange(30);
        mb.setStartTime(date[0] + " 00:00:00");
        mb.setEndTime(date[1] + " 23:59:59");
        PageHelper.startPage(0, 10, "pv desc").setReasonable(true);
        List<HashMap> mouthRanklist = movieBasicMapper.selecMovieItemsRank(mb);
        PageHelper.clearPage();


        HashMap res = new HashMap();
        res.put("weekRank", weekRanklist);
        res.put("mouthRank", mouthRanklist);

        return success(res);

    }
}
