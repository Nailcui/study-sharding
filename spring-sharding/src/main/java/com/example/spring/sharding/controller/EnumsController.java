package com.example.spring.sharding.controller;

import com.example.spring.sharding.dao.EnumsMapper;
import com.example.spring.sharding.dataobject.EnumsDO;
import com.example.spring.sharding.qo.EnumsQO;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author dingyu
 * @date 2021-12-15 19:10
 */
@Slf4j
@RestController
@RequestMapping("/enums")
public class EnumsController {

  @Resource
  private EnumsMapper enumsMapper;

  @GetMapping("/0enums")
  public List<EnumsDO> getAll0Enums() {
    EnumsQO qo = new EnumsQO();
    qo.setType(0);
    return enumsMapper.selectAll(qo);
  }

  @GetMapping("/add")
  public String add() {
    EnumsDO enumsDO = new EnumsDO();
    enumsDO.setName(new Date().toString());
    enumsDO.setType(0);
    return String.valueOf(enumsMapper.insert(enumsDO));
  }
}
