package com.goodlab.controller;


import com.goodlab.pojo.Category;
import com.goodlab.pojo.Result;
import com.goodlab.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // 添加文章分类
    @PostMapping
    public Result add(@RequestBody @Validated(Category.Add.class) Category category){
        categoryService.add(category);

        return Result.success();
    }

    // 查询文章分类
    @GetMapping
    public Result<List<Category>>  list(){
        List<Category> list = categoryService.list();
        return Result.success(list);
    }

    // 获取文章分类详情
    @GetMapping("/detail")
    public Result<Category> detail(Integer id){
        Category category = categoryService.findById(id);
        return Result.success(category);
    }

    // 更新文章分类
    @PutMapping
    public Result update(@RequestBody @Validated(Category.Update.class) Category category){
        categoryService.update(category);
        return Result.success();
    }


}
