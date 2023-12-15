package com.tune.novel.controller.front;

import com.tune.novel.core.common.constant.ApiRouterConsts;
import com.tune.novel.core.common.resp.RestResp;
import com.tune.novel.model.dto.resp.NewsInfoRespDto;
import com.tune.novel.servie.NewsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Tune
 * @create 2023-12-14-21:56
 * @description: 前台门户-新闻模块 API 控制器
 */
@Tag(name = "NewsController", description = "前台门户-新闻模块")
@RestController
@RequestMapping(ApiRouterConsts.API_FRONT_NEWS_URL_PREFIX)
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    /**
     * 最新新闻列表查询接口
     */
    @Operation(summary = "最新新闻列表查询接口")
    @GetMapping("latest_list")
    public RestResp<List<NewsInfoRespDto>> listLatestNews() {
        return newsService.listLatestNews();
    }

    /**
     * 新闻信息查询接口
     */
    @Operation(summary = "新闻信息查询接口")
    @GetMapping("{id}")
    public RestResp<NewsInfoRespDto> getNews(
            @Parameter(description = "新闻ID") @PathVariable Long id) {
        return newsService.getNews(id);
    }
}
