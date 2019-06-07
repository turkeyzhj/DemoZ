package com.zz.controller;

import com.zz.entity.Commodity;
import com.zz.service.CommodityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CommodityController {
    @Resource
    CommodityService commodityService;
    @RequestMapping("/findByName")
   public Commodity findByName(){
        return  commodityService.findByName("张尚卓");
    }

}
