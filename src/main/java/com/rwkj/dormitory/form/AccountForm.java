package com.rwkj.dormitory.form;

import lombok.Data;

/**
 * 用户信息保存类
 */
@Data
public class AccountForm {
    private String username;
    private String password;
    private String type;
}
