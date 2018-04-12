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
            jsonObject.put("result", "�û��������붼Ϊ�գ�");
        else if ("".equals(name))
            jsonObject.put("result", "�û���Ϊ�գ�");
        else if ("".equals(pw))
            jsonObject.put("result", "����Ϊ�գ�");
        else
            jsonObject.put("result", name);
        return jsonObject;
    }
    @RequestMapping("/user/editItemSubmit_RequestJson")  
    public @ResponseBody JSONObject editItemSubmit_RequestJson(@RequestBody User items) throws Exception {  
    	JSONObject jsonObject = new JSONObject();
    	jsonObject.put("result", "����");
    	return jsonObject;  
  
    }  
}
