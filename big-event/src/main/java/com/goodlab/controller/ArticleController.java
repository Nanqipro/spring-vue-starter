package com.goodlab.controller;



import com.goodlab.pojo.Article;
import com.goodlab.pojo.PageBean;
import com.goodlab.pojo.Result;
import com.goodlab.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/article")
public class ArticleController {


    @Autowired
    private ArticleService articleService;

    // 新增文章
    @PostMapping
    public Result  add(@RequestBody @Validated Article article){

        articleService.add(article);

        return Result.success();
    }

    // 文章分页查询
    @GetMapping
    public Result<PageBean<Article>> list(Integer pageNum, Integer pageSize,@RequestParam(required = false) Integer categoryId,@RequestParam(required = false) String state){


        PageBean<Article> pageBean = articleService.list(pageNum, pageSize, categoryId, state);
        return Result.success(pageBean);
    }



}
