package com.yuu.knife4j.boot.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: User
 * @Auther: Yuu
 * @Date: 2020/9/12 11:58
 * @Description: 用户实体
 */
@Data
@ApiModel(description = "用户实体")
public class User implements Serializable {

    @ApiModelProperty(value = "用户ID")
    private Integer id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "性别")
    private String sex;
}
