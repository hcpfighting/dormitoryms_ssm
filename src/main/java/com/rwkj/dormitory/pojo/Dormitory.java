package com.rwkj.dormitory.pojo;

import lombok.Data;

/**
 * 宿舍表实体类
 */
@Data
public class Dormitory {
    private Integer id;
    private Integer buildingId;
    private String buildingName;
    private String name;
    private Integer type;
    private Integer available;
    private String telephone;
}
