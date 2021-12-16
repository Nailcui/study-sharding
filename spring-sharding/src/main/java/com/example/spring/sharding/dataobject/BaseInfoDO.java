package com.example.spring.sharding.dataobject;

import lombok.Data;

import java.util.Date;

/**
 * @author kuaixue
 * @date 2021-08-08 22:22
 */
@Data
public class BaseInfoDO {

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 删除标记
     */
    private Integer delFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
