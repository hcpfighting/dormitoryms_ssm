package com.rwkj.dormitory.pojo;

import lombok.Data;

/**
 * 楼宇表实体类
 */
@Data
public class Building {
    private Integer id;
    private String name;
    private String introduction;
    private Integer adminId;
    private String adminName;
}
