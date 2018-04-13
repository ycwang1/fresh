package com.htzhny.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fresh.service.UserService;
import com.htzhny.entity.User;
import com.htzhny.util.PageBean;

import net.sf.json.JSONObject;

@Controller
public class TestController {
	@Autowired
	private UserService userService;
    @RequestMapping(value = "/user/test", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject CeShi(@RequestParam("pw") String pw, @RequestParam("name") String name) {
        JSONObject jsonObject = new JSONObject();
        if ("".equals(pw) && "".equals(name))
            jsonObject.put("result", "用户名和密码都为空！");
        else if ("".equals(name))
            jsonObject.put("result", "用户名为空！");
        else if ("".equals(pw))
            jsonObject.put("result", "密码为空！");
        else
            jsonObject.put("result", name);
        return jsonObject;
    }
    @RequestMapping("/user/editItemSubmit_RequestJson")  
    public @ResponseBody JSONObject editItemSubmit_RequestJson(@RequestBody User items) throws Exception {  
    	JSONObject jsonObject = new JSONObject();
    	jsonObject.put("result", "测试");
    	return jsonObject;  
  
    }
    @RequestMapping("/user/list")  
    public @ResponseBody JSONObject getUserList(@RequestBody Map<String,Object> params) throws Exception {  
    	JSONObject jsonObject = new JSONObject();
    	 PageBean<User> pageBean = userService.findByPage(2);
    	jsonObject.put("result", pageBean);
    	return jsonObject;  
  
    }  
}
