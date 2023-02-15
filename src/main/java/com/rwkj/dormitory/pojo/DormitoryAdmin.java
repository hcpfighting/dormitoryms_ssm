package com.rwkj.dormitory.pojo;

import lombok.Data;

/**
 * 宿管表实体类
 */
@Data
public class DormitoryAdmin {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String gender;
    private String telephone;
}
