package com.htzhny.controller;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.htzhny.entity.User;

@Controller
public class TestController {

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
}
