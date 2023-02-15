package com.rwkj.dormitory.pojo;

import lombok.Data;

/**
 * 迁出表实体类
 */
@Data
public class Moveout {
    private Integer id;
    private Integer studentId;
    private String studentName;
    private Integer dormitoryId;
    private String dormitoryName;
    private String reason;
    private String createDate;
}
