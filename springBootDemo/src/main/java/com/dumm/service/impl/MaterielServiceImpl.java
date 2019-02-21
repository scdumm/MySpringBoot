package com.dumm.service.impl;

import com.alibaba.fastjson.JSON;
import com.dumm.entity.BmsMaterielEntity;
import com.dumm.mapper.BmsMaterielMapper;
import com.dumm.service.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: springBootDemo
 * @Package: com.dumm.service.impl
 * @ClassName: MaterielServiceImpl
 * @Description: java类作用描述
 * @Author: dumm
 * @Version: 1.0
 */
@Service
public class MaterielServiceImpl implements MaterielService{

    @Autowired
    private BmsMaterielMapper mapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Override
    public List<BmsMaterielEntity> findList(BmsMaterielEntity entity) {
        List<BmsMaterielEntity> list = mapper.findList(entity);
        // 具体使用
        redisTemplate.opsForList().leftPush("user:list", JSON.toJSONString(list));
        stringRedisTemplate.opsForValue().set("user:name", "张三");

        return list;
    }
}
