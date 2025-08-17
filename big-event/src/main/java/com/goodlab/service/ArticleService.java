package com.goodlab.service;

import com.goodlab.pojo.Article;
import com.goodlab.pojo.PageBean;

public interface ArticleService {


    // 添加文章
    void add(Article article);

    // 条件分页列表查询
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);
}
