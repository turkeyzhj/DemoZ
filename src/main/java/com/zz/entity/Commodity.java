package com.zz.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
@Entity
@Data
public class Commodity {
    @Id
    private Long id;
    private String name;
    private BigDecimal price;
    private int number;
    private int status;//有货为0,缺货为1;

}
