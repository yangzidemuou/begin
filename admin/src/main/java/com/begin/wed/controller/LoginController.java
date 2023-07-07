package com.begin.wed.controller;



import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;
@RestController
public class LoginController {
//    @Autowired
//    private SysLoginService loginService;
//
//    @Autowired
//    private ISysMenuService menuService;
//
//    @Autowired
//    private SysPermissionService permissionService;
//
//    /**
//     * 登录方法
//     *
//     * @param loginBody 登录信息
//     * @return 结果
//     */
//    @PostMapping("/login")
//    public AjaxResult login(@RequestBody LoginBody loginBody)
//    {
//        AjaxResult ajax = AjaxResult.success();
//        // 生成令牌
//        String token = loginService.login(loginBody.getUsername(), loginBody.getPassword(), loginBody.getCode(),
//                loginBody.getUuid());
//        ajax.put(Constants.TOKEN, token);
//        return ajax;
//    }
//    /**
//     * 获取用户信息
//     *
//     * @return 用户信息
//     */
//    @GetMapping("getInfo")
//    public AjaxResult getInfo()
//    {
//        SysUser user = SecurityUtils.getLoginUser().getUser();
//        // 角色集合
//        Set<String> roles = permissionService.getRolePermission(user);
//        // 权限集合
//        Set<String> permissions = permissionService.getMenuPermission(user);
//        AjaxResult ajax = AjaxResult.success();
//        ajax.put("user", user);
//        ajax.put("roles", roles);
//        ajax.put("permissions", permissions);
//        return ajax;
//    }


}
