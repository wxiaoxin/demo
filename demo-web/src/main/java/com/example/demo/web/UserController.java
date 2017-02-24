package com.example.demo.web;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/2/24.
 */

@Api(value = "UserController", description = "用户接口")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查找用户", notes = "查找所有用户", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "")
    })
    @RequestMapping("/user")
    public String all() {
        User user = new User();
        user.setName("哈哈哈哈哈");
        user.setAge(22);

        userService.save(user);

        return "success";
    }

    @ApiOperation(value = "查找用户", notes = "根据Id查找用户", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户主键id", required = true, dataType = "Long", paramType = "path")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "用户主键id非法")
    })
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String get(@PathVariable String id) {

        return "success";
    }

}
