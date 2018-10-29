package com.database.hw.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
/**
 * 套餐
 */
public class MySeries {
    @Id
    private long id;
    private String name;
    private int price;
    private String stype;
    //流量
    private double sdata;
    //通话时间
    private int scall;
    //短信条数
    private int message;

    //常规套餐
    public static final String TYPE_NORMAL = "NORMAL";
    //无限量套餐，比如无限流量、无限通话时间等
    public static final String TYPE_INFINITE = "INFINITE";

    public MySeries(String name, int price, String stype, double sdata, int scall, int message) {
        this.name = name;
        this.price = price;
        this.stype = stype;
        this.sdata = sdata;
        this.scall = scall;
        this.message = message;
    }
}
