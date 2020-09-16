package com.atguigu.ecommerceuserprofile.app.support;

import lombok.Data;

/**

import lombok.Data;

/**
 * @ClassName: EsTagQuery
 * @Description:
 * @Author: SmallScorpion on 2020/6/12 14:20
 * @Version: 1.0
 */
@Data
public class EsTagQuery {
    private String name;    // 当前标签的名称
    private String value;    // 当前标签的取值
    private String type;    // 查询的类型
}
