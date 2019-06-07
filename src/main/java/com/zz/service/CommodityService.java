package com.zz.service;

import com.zz.entity.Commodity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface CommodityService {
    //查
    public Commodity findByName(String name);
    //增
    public Commodity save(Commodity commodity);
    //删
    public void del(Commodity commodity);

    //改
    public int upda(String name, BigDecimal price,int number,int status);


}
