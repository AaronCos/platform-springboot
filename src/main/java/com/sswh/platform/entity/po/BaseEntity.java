package com.sswh.platform.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {

    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
    private Date createTime;
    private Date updateTime;
    private String creator;
}
