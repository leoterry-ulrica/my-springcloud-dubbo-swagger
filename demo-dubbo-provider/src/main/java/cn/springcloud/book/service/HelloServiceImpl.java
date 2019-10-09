package cn.springcloud.book.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xz")
@Api(value = "eureka-provider", description = "hello接口")
public class HelloServiceImpl implements HelloService {

    @ApiOperation(value="say hello", notes="")
    @Override
    public String hello() {
        return "hello at " + System.currentTimeMillis();
    }
}
