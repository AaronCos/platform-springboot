package com.sswh.platform.entity.po;

import lombok.Data;

import java.util.Date;

@Data
public class User extends BaseEntity {

    private String username;
    private String name;
    private Date birthday;

}
