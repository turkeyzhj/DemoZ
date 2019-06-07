package com.zz.repository;

import com.zz.entity.Commodity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import java.math.BigDecimal;

public interface CommodityRepository extends CrudRepository<Commodity,Long> {
     //查
    @Query(value = "select * from Commodity where name=:name ",nativeQuery = true)
    Commodity findByName(@Param("name") String name);
    //增
    @Modifying
    @Transactional
    @Query(value = "insert into Commodity value(?.?,?)",nativeQuery = true)
    public String save(@Param("name") String name, @Param("price") BigDecimal price,@Param("number") int number ,@Param("status") int status);
    //删
    @Modifying
    @Transactional
    @Query(value ="delete from Commodity c where c.name =:name ",nativeQuery = true)
    public String del(@Param("name") String name);

    //改
    @Modifying
    @Transactional
    @Query(value = "update from Commodity c set c.name=:name,c.price=:price,c.number=:number,c.status=:status",nativeQuery = true)
    public int upda(@Param("name") String name, @Param("price") BigDecimal price,@Param("number") int number ,@Param("status") int status);



}
