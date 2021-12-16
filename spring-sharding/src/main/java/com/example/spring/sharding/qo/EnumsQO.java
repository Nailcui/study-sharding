package com.example.spring.sharding.qo;

import com.example.spring.sharding.dataobject.EnumsDO;
import lombok.Data;

import java.util.List;

/**
 * @author dingyu
 * @date 2021-11-10 23:44
 */
@Data
public class EnumsQO extends EnumsDO {

    private List<Long> ids;
}
