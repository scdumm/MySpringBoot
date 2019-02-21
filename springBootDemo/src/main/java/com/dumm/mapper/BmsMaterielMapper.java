package com.dumm.mapper;


import com.dumm.entity.BmsMaterielEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 物料基础数据 Mapper 接口
 * </p>
 *
 * @author yux123
 * @since 2018-12-21
 */
public interface BmsMaterielMapper {

    List<BmsMaterielEntity> findListBycode(BmsMaterielEntity entity);

    /**
     * sdfsd
     * @param entity
     * @return
     */
    List<BmsMaterielEntity> findList(BmsMaterielEntity entity);
}
