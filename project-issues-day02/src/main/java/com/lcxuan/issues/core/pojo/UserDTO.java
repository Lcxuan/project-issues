package com.lcxuan.issues.core.pojo;

import lombok.Data;

@Data
public class UserDTO {

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 地址
     */
    private String address;
}
