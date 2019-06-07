package com.zz.service.serviceImp;

import com.zz.entity.Commodity;

import com.zz.repository.CommodityRepository;
import com.zz.service.CommodityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service
public class CommodityServiceImp implements CommodityService {

    @Resource
    CommodityRepository commodityRepository;


    @Override
    public Commodity findByName(String name) {
        return commodityRepository.findByName(name);
    }

    @Override
    public Commodity save(Commodity commodity) {
        return commodityRepository.save(commodity);
    }

    @Override
    public void del(Commodity commodity) {

    }

    @Override
    public int upda(String name, BigDecimal price, int number, int status) {
        return commodityRepository.upda(name, price, number, status);
    }


}
