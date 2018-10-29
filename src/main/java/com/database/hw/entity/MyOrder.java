package com.database.hw.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
/**
 * 订单
 */
public class MyOrder {
    @Id
    private long id;
    private String phoneNum;
    @ManyToOne(targetEntity = MySeries.class)
    private MySeries mySeries;
    private Date ostart;
    private Date oend;

    public MyOrder(String phoneNum, MySeries mySeries, Date ostart, Date oend) {
        this.phoneNum = phoneNum;
        this.mySeries = mySeries;
        this.ostart = ostart;
        this.oend = oend;
    }
}
