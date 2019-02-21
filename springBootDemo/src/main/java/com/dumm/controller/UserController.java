package com.dumm.controller;

import com.dumm.entity.BmsMaterielEntity;
import com.dumm.entity.UserEntity;
import com.dumm.service.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ProjectName: springBootDemo
 * @Package: com.dumm.controller
 * @ClassName: UserController
 * @Description: java类作用描述
 * @Author: dumm
 * @Version: 1.0
 */
@RestController
@RequestMapping("/testboot")
public class UserController {
    @Autowired
    private MaterielService service;

    @RequestMapping(value="/getUser", method= RequestMethod.GET)
    public UserEntity getUser(){
        UserEntity user = new UserEntity();
        user.setUserName("test");
        return user;
    }
    @RequestMapping(value="/getUserMateriel", method= RequestMethod.GET)
    public List<BmsMaterielEntity> getUserMateriel(){
        BmsMaterielEntity entity = new BmsMaterielEntity();
        List<BmsMaterielEntity> user = service.findList(entity);
        return user;
    }
}
