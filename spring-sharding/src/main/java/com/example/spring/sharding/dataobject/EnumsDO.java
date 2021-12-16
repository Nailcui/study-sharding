package com.example.spring.sharding.dataobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kuaixue
 * @date 2021-08-08 22:22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnumsDO extends BaseInfoDO {

    /**
     * aid
     */
    private Integer type;

    /**
     * bid
     */
    private String name;
    private String nameVague;

    /**
     * 扩展变量
     */
    private String var1;
    private String var2;
    private String var3;

}
