package com.goodlab.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.groups.Default;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Category {
    @NotNull(groups = {Update.class})
    private Integer id;//主键ID
    @NotEmpty
    private String categoryName;//分类名称
    @NotEmpty
    private String categoryAlias;//分类别名
    private Integer createUser;//创建人ID

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;//创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updateTime;//更新时间

    // 默认分组
    // 如果说某个校验项没有指定分组，那么这个校验项，默认属于 DEFAULT 分组
    // 分组之间可以继承 A 继承 B，那么 A 分组的校验项，B 分组也可以使用
    //    public interface Default{}

    // 定义分组校验
    public interface Add extends Default {

    }

    public interface Update extends Default{

    }


}
