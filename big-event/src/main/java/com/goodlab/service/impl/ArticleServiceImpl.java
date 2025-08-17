package com.goodlab.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.goodlab.mapper.ArticleMapper;
import com.goodlab.pojo.Article;
import com.goodlab.pojo.PageBean;
import com.goodlab.service.ArticleService;
import com.goodlab.utils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;


@Service
public class ArticleServiceImpl implements ArticleService {


    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public void add(Article article) {
        // 补充属性值
        article.setCreateTime(LocalDateTime.now());
        article.setUpdateTime(LocalDateTime.now());
        Map<String, Object> map = ThreadLocalUtil.get();
        Integer id = (Integer) map.get("id");
        article.setCreateUser(id);


        articleMapper.add(article);

    }

    @Override
    public PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state) {

        // 创建pageBean 对象
        PageBean<Article> pb = new PageBean<>();


        // 开启分页查询 PageHelper
        PageHelper.startPage(pageNum, pageSize);


        // 调用Mapper
        Map<String, Object> map = ThreadLocalUtil.get();
        Integer userId = (Integer) map.get("id");
        List<Article> items = articleMapper.list(userId, categoryId, state);
        Page<Article> p = (Page<Article>) items; // Page 中提供了方法可以获取PageHelper 分页查询后得到的总记录条数和当前页数据

        // 把数据填充到pageBean中
        pb.setTotal(p.getTotal());
        pb.setItems(p.getResult());

        return pb;
    }
}
