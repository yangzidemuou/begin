package com.ruoyi.begin.controller;
import com.alibaba.fastjson.JSON;
import com.ruoyi.begin.Dao.UserDao;
import com.ruoyi.begin.bean.User;
import com.ruoyi.begin.common.AjaxResult;
import com.ruoyi.begin.common.constant.Constants;
import com.ruoyi.begin.common.core.redis.RedisCache;
import com.ruoyi.begin.utils.ImageCode;
import com.ruoyi.begin.utils.uuid.IdUtils;
import com.ruoyi.begin.web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


@RestController
public class LoginController    {
    @Autowired
    UserDao userDao;

    @Autowired
    private RedisCache redisCache;

    @Autowired
    private LoginService loginService;

    /**
     * 获取验证码
     */
    @GetMapping("/captchaImage")
    public AjaxResult getCode(){
        AjaxResult ajax=AjaxResult.success();
        boolean captchaOnOff = true;
        if(!captchaOnOff){
            return ajax;
        }
        String uuid= IdUtils.simpleUUID();
        String verifKey= Constants.CAPTCHA_CODE_KEY;
        String base64=ImageCode.getImageBase64(70,30);
        redisCache.setCacheObject(verifKey,ImageCode.rand,Constants.CAPTCHA_EXPIRATION, TimeUnit.MINUTES);
        ajax.put("uuid",uuid);
        ajax.put("img",base64);
        return ajax;
    }

    /**
     *
     *
     */
    @RequestMapping("/login")
    public String Login(@RequestBody User user){
        AjaxResult ajax=AjaxResult.success();
        User us=userDao.getUserByMassage(user.getUsername(), user.getPassword());
        System.out.println(user);
        System.out.println(us);
        Map<String,Object> hashMap=new HashMap<>();
        hashMap.put("token",user.toString());
        return JSON.toJSONString(hashMap);
    }

    @RequestMapping("/getInfo")
    public String getInfo(){
        Map<String,Object> hashMap=new HashMap<>();
        hashMap.put("userName","admin");
        return JSON.toJSONString(hashMap);
    }

    @RequestMapping("/logout")
    public String LoginOut(){
        return "成功";
    }

}
