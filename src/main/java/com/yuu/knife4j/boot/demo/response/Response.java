package com.yuu.knife4j.boot.demo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName: Response
 * @Auther: Yuu
 * @Date: 2020/9/11 18:59
 * @Description: 统一的响应返回对象
 */
@Data
@ApiModel(description = "统一的响应返回对象")
public class Response<T> {

    /**
     * 返回成功默认状态码
     */
    public static final String SUCCESS_CODE = "200";

    /**
     * 返回成功默认消息
     */
    public static final String SUCCESS_MESSAGE = "操作成功！";

    /**
     * 返回状态码
     */
    @ApiModelProperty(value = "返回状态码")
    private String code;

    /**
     * 返回消息
     */
    @ApiModelProperty(value = "返回消息")
    private String message;

    /**
     * 返回数据
     */
    @ApiModelProperty(value = "返回数据")
    private T data;

    private Response(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 自定义返回数据
     *
     * @param t
     * @param <T>
     * @return
     */
    public static <T> Response<T> success(T t) {
        return new Response(SUCCESS_CODE, SUCCESS_MESSAGE, t);
    }
}
