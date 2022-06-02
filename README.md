study-sharding
---

[分表](https://github.com/Nailcui/study-sharding)
[分库分表](https://github.com/Nailcui/study-sharding/tree/feature_sharding_database)


#### 设置默认数据源

> 参考: https://cloud.tencent.com/developer/article/1739149

```
spring.shardingsphere.sharding.default-data-source-name=ds-0
```

#### 测试数据库创建

```sql

create database sharding01;
create database sharding02;

CREATE TABLE `sharding01`.`user_0`(
	id bigint(20) not null,
	city varchar(20) not null,
	name varchar(20) not null,
	car_id bigint(20) not null,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `sharding01`.`user_1`(
	id bigint(20) not null,
	city varchar(20) not null,
	name varchar(20) not null,
	car_id bigint(20) not null,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `sharding01`.`user_2`(
	id bigint(20) not null,
	city varchar(20) not null,
	name varchar(20) not null,
	car_id bigint(20) not null,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `sharding01`.`enums_0` (
    `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
    `type` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '关系类型',
    `name` varchar(128) NOT NULL DEFAULT '' COMMENT 'name',
    `var1` varchar(128) NOT NULL DEFAULT '' COMMENT 'var1',
    `var2` varchar(128) NOT NULL DEFAULT '' COMMENT 'var2',
    `var3` varchar(128) NOT NULL DEFAULT '' COMMENT 'var3',
    `del_flag` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '删除标记',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    KEY `idx_type_name` (`type`, `name`),
    KEY `idx_type_var1` (`type`, `var1`),
    KEY `idx_type_var2` (`type`, `var2`),
    KEY `idx_type_var3` (`type`, `var3`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='枚举表';

CREATE TABLE `sharding01`.`enums_1` (
    `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
    `type` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '关系类型',
    `name` varchar(128) NOT NULL DEFAULT '' COMMENT 'name',
    `var1` varchar(128) NOT NULL DEFAULT '' COMMENT 'var1',
    `var2` varchar(128) NOT NULL DEFAULT '' COMMENT 'var2',
    `var3` varchar(128) NOT NULL DEFAULT '' COMMENT 'var3',
    `del_flag` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '删除标记',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    KEY `idx_type_name` (`type`, `name`),
    KEY `idx_type_var1` (`type`, `var1`),
    KEY `idx_type_var2` (`type`, `var2`),
    KEY `idx_type_var3` (`type`, `var3`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='枚举表';

CREATE TABLE `sharding01`.`enums_2` (
    `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
    `type` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '关系类型',
    `name` varchar(128) NOT NULL DEFAULT '' COMMENT 'name',
    `var1` varchar(128) NOT NULL DEFAULT '' COMMENT 'var1',
    `var2` varchar(128) NOT NULL DEFAULT '' COMMENT 'var2',
    `var3` varchar(128) NOT NULL DEFAULT '' COMMENT 'var3',
    `del_flag` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '删除标记',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    KEY `idx_type_name` (`type`, `name`),
    KEY `idx_type_var1` (`type`, `var1`),
    KEY `idx_type_var2` (`type`, `var2`),
    KEY `idx_type_var3` (`type`, `var3`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='枚举表';

CREATE TABLE `sharding02`.`enums_0` (
    `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
    `type` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '关系类型',
    `name` varchar(128) NOT NULL DEFAULT '' COMMENT 'name',
    `var1` varchar(128) NOT NULL DEFAULT '' COMMENT 'var1',
    `var2` varchar(128) NOT NULL DEFAULT '' COMMENT 'var2',
    `var3` varchar(128) NOT NULL DEFAULT '' COMMENT 'var3',
    `del_flag` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '删除标记',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    KEY `idx_type_name` (`type`, `name`),
    KEY `idx_type_var1` (`type`, `var1`),
    KEY `idx_type_var2` (`type`, `var2`),
    KEY `idx_type_var3` (`type`, `var3`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='枚举表';

CREATE TABLE `sharding02`.`enums_1` (
    `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
    `type` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '关系类型',
    `name` varchar(128) NOT NULL DEFAULT '' COMMENT 'name',
    `var1` varchar(128) NOT NULL DEFAULT '' COMMENT 'var1',
    `var2` varchar(128) NOT NULL DEFAULT '' COMMENT 'var2',
    `var3` varchar(128) NOT NULL DEFAULT '' COMMENT 'var3',
    `del_flag` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '删除标记',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    KEY `idx_type_name` (`type`, `name`),
    KEY `idx_type_var1` (`type`, `var1`),
    KEY `idx_type_var2` (`type`, `var2`),
    KEY `idx_type_var3` (`type`, `var3`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='枚举表';

CREATE TABLE `sharding02`.`enums_2` (
    `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
    `type` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '关系类型',
    `name` varchar(128) NOT NULL DEFAULT '' COMMENT 'name',
    `var1` varchar(128) NOT NULL DEFAULT '' COMMENT 'var1',
    `var2` varchar(128) NOT NULL DEFAULT '' COMMENT 'var2',
    `var3` varchar(128) NOT NULL DEFAULT '' COMMENT 'var3',
    `del_flag` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '删除标记',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    KEY `idx_type_name` (`type`, `name`),
    KEY `idx_type_var1` (`type`, `var1`),
    KEY `idx_type_var2` (`type`, `var2`),
    KEY `idx_type_var3` (`type`, `var3`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='枚举表';


-- 清除数据
truncate table sharding01.enums_0;
truncate table sharding01.enums_1;
truncate table sharding01.enums_2;

truncate table sharding02.enums_0;
truncate table sharding02.enums_1;
truncate table sharding02.enums_2;

```
