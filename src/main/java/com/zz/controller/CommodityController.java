package com.zz.controller;

import com.zz.entity.Commodity;
import com.zz.service.CommodityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CommodityController {
    @Resource
    CommodityService commodityService;
    @RequestMapping("/findByName")
   public Commodity findByName(){
        return  commodityService.findByName("张尚卓");
    }
    @RequestMapping("del")
    public String del(Commodity commodity){
        commodity.setId((long) 1);
        commodityService.del(commodity);
        return "ok";
    }

}
