package mblog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试的Controller
 * Start at: 2018/4/15 12:08
 *
 * @author muhong
 */
@Controller
public class TestController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "My name is muhong";
    }

}
