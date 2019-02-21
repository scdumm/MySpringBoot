package com.dumm.service;/**
 * Created by lizhengbin on 2019/2/12.
 */

import com.dumm.entity.BmsMaterielEntity;

import java.util.List;

/**
 * @ProjectName: springBootDemo
 * @Package: com.dumm.service
 * @ClassName: MaterielService
 * @Description: java类作用描述
 * @Author: dumm
 * @Version: 1.0
 */
public interface MaterielService {
    List<BmsMaterielEntity> findList(BmsMaterielEntity entity);
}
