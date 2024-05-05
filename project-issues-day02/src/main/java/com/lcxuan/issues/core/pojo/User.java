package com.lcxuan.issues.core.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     * 用户编号
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;
}
