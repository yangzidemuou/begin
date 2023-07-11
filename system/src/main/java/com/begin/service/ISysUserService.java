package com.begin.service;


import com.begin.core.domain.entity.SysUser;

import java.util.List;

/**
 * 用户 业务层
 *
 * @author ruoyi
 */
public interface ISysUserService
{


    /**
     * 修改用户基本信息
     *
     * @param user 用户信息
     * @return 结果
     */
    public int updateUserProfile(SysUser user);


}
