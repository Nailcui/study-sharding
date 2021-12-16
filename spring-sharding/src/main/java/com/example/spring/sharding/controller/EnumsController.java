package com.example.spring.sharding.controller;

import com.example.spring.sharding.dao.EnumsMapper;
import com.example.spring.sharding.dataobject.EnumsDO;
import java.util.Date;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author dingyu
 * @date 2021-12-15 19:10
 */
@RestController
@RequestMapping("/enums")
public class EnumsController {

  @Resource
  private EnumsMapper enumsMapper;

  @GetMapping("/add")
  public String add() {
    EnumsDO enumsDO = new EnumsDO();
    enumsDO.setName(new Date().toString());
    enumsDO.setType(0);
    return String.valueOf(enumsMapper.insert(enumsDO));
  }
}
