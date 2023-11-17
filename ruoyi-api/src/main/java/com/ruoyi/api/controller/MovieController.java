package com.ruoyi.api.controller;

import com.github.pagehelper.PageHelper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.ServletUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.video.domain.*;
import com.ruoyi.video.mapper.ColumnsMapper;
import com.ruoyi.video.mapper.MovieBasicMapper;
import com.ruoyi.video.mapper.MovieCastMapper;
import com.ruoyi.video.service.IColumnsService;
import com.ruoyi.video.service.IMovieBasicService;
import com.ruoyi.video.service.impl.MovieCastServiceImpl;
import com.ruoyi.video.service.impl.MoviePvServiceImpl;
import com.ruoyi.video.service.impl.MovieVideosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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

    @Autowired
    private MovieVideosServiceImpl movieVideosService;

    /**
     * 获取列表
     */
    @GetMapping("/list")
    public TableDataInfo list(MovieBasic mb) {
        startPage();

        //todo  按照评分和人气排序

        List<HashMap> list = movieBasicMapper.selecMovieItemsRank(mb);
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
        MovieVideos p = new MovieVideos();
        p.setMovieId(id);
        List<MovieVideos> videos = movieVideosService.selectMovieVideosList(p);
        mb.setMovieVideos(videos);
        return success(mb);

    }

    /**
     * 获取视频详情播放页
     *
     * @param id
     * @return
     */

    @GetMapping("/videos/{id}")
    public AjaxResult getVideoDetail(@PathVariable Long id) {

        MovieVideos mv = movieVideosService.selectMovieVideosById(id);

        MovieBasic mb = movieBasicMapper.selectMovieBasicById(mv.getMovieId());

        MovieVideos p = new MovieVideos();
        p.setMovieId(mv.getMovieId());
        List<MovieVideos> videos = movieVideosService.selectMovieVideosList(p);
        mb.setMovieVideos(videos);

        HashMap result = new HashMap();
        result.put("country", mb.getCountry());
        result.put("movie", mb);
        result.put("movieId", mb.getId());
        result.put("title", mv.getTitle());
        result.put("typeId", mv.getTypeId());
        result.put("videoInfo", mv.getVideo());
        result.put("videos", mb.getMovieVideos());

        return success(result);

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
