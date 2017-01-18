package com.lark.controller;

import com.lark.dao.pojo.User;
import com.lark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by skylark on 2017/1/16.
 */
@Controller
public class ControllerTest {

    @Autowired
    private UserService userService;

    /**
     * 1.调用BLL层的服务接口
     * 2.设置数据模型
     * 3.返回逻辑视图名称
     *
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "showHello", method = RequestMethod.GET)
    public String showHello(@RequestParam("id") int id, ModelMap modelMap) {
        /*response.getWriter().write("<h1>Hello SpringMVC</h1>");
        response.flushBuffer();*/

        User user=userService.getUser(id);
        modelMap.put("user",user);
        return "showHello";
    }
}
