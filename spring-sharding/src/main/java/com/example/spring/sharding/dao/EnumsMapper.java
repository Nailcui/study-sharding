package com.example.spring.sharding.dao;

import com.example.spring.sharding.dataobject.EnumsDO;
import com.example.spring.sharding.qo.EnumsQO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author dingyu
 * @date 2021-11-10 23:58
 */
@Mapper
public interface EnumsMapper {

    /**
     * 新建
     * @param data data
     * @return rows
     */
    int insert(EnumsDO data);

    /**
     * 新建
     * @param data data
     * @return rows
     */
    int update(EnumsDO data);

    /**
     * 逻辑删除
     * @param id id
     * @return rows
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 主键查询
     * @param id id
     * @return
     */
    EnumsDO selectByPrimaryKey(Long id);

    /**
     * 查询列表
     * @param qo qo
     * @return list
     */
    List<EnumsDO> selectAll(EnumsQO qo);

    /**
     * 查询列表 limit 30
     * @param qo qo
     * @return list
     */
    List<EnumsDO> select30(EnumsQO qo);

    /**
     * 查询一条
     * @param qo qo
     * @return list
     */
    EnumsDO selectOne(EnumsQO qo);

}
