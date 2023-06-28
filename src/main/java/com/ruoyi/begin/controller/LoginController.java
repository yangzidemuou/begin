package com.ruoyi.begin.controller;

import com.alibaba.fastjson.JSON;

import com.ruoyi.begin.Dao.UserDao;
import com.ruoyi.begin.bean.User;
import com.ruoyi.begin.util.ImageCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

import java.util.UUID;

@RestController
public class LoginController {
    @Autowired
    UserDao userDao;

    /**
     * 获取验证码
     */
    @RequestMapping("/captchaImage")
    public String getImgCode( HttpServletResponse response) throws IOException {
        response.setHeader("Pragma","no-cache");
        response.setHeader("Cache-Control","no-cache");
        response.setDateHeader("Expires",0);
        response.setCharacterEncoding("UTF-8");
        String base64=ImageCode.getImageBase64(70,30);
        Map<String, Object> hashMap=new HashMap<>();
        hashMap.put("img",base64);
        hashMap.put("uuid", ImageCode.rand);
        return JSON.toJSONString(hashMap);
    }
    /**
     *
     *
     */
    @RequestMapping("/login")
    public void Login(@RequestBody User user){
        User us=userDao.getUserByMassage(user.getUsername(), user.getPassword());
        System.out.println(user);
        System.out.println(us);
    }
}
