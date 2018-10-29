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
public class Series {
    @Id
    private long id;
    private String name;
    private int price;
    private String type;
    //流量
    private double data;
    //通话时间
    private int call;
    //短信条数
    private int message;

    //常规套餐
    public static final String TYPE_NORMAL = "NORMAL";
    //无限量套餐，比如无限流量、无限通话时间等
    public static final String TYPE_INFINITE = "INFINITE";

    public Series(String name, int price, String type, double data, int call, int message) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.data = data;
        this.call = call;
        this.message = message;
    }
}
