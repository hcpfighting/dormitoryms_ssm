package com.rwkj.dormitory.mapper;

import com.rwkj.dormitory.pojo.SystemAdmin;

/**
 * 系统管理员持久层
 */
public interface SystemAdminMapper {
    public SystemAdmin findByUsername(String username);
}
