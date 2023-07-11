package com.begin.mapper;

import com.begin.core.domain.entity.SysUser;

public interface SysUserMapper {
    /**
     * 修改用户信息
     * @param user
     * @return
     */
    public int updateUser(SysUser user);
}
