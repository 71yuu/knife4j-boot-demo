package com.yuu.knife4j.boot.demo.controller;

import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import com.yuu.knife4j.boot.demo.entity.User;
import com.yuu.knife4j.boot.demo.response.Response;
import com.yuu.knife4j.boot.demo.service.IUserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: Kenfe4jController
 * @Auther: Yuu
 * @Date: 2020/9/11 18:27
 * @Description: 用户 - 前端控制器
 */
@RestController
@RequestMapping("user")
@Api(tags = "用户模块")
@ApiSupport(author = "Yuu", order = 1)
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 用户列表
     *
     * @param user 用户查询条件
     * @param pageNo 第一页
     * @param pageSize 每页的大小
     * @return
     */
    @ApiOperation(value = "用户列表", notes = "获取用户列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNo", value = "分页-第几页", required = true, paramType = "query", dataType = "int"),
            @ApiImplicitParam(name = "pageSize", value = "分页-每页的大小", required = true, paramType = "query", dataType = "int")
    })
    @ApiResponses({
            @ApiResponse(code = 500, message = "服务器异常")
    })
    @GetMapping("list")
    public Response<List<User>> getUserList(@RequestParam Integer pageNo, @RequestParam Integer pageSize) {

        // 模拟数据库查询用户列表
        List<User> users = userService.list(pageNo, pageSize);

        return Response.success(users);
    }
}
