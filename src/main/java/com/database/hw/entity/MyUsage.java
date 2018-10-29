package com.database.hw.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.boot.archive.scan.spi.PackageInfoArchiveEntryHandler;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
/**
 * 用量
 */
public class MyUsage {
    @Id
    private long id;
    private String phoneNum;
    //流量使用量
    private double udata;
    //通话时间使用量
    private int ucall;
    //短信使用量
    private int message;
    private Date ustart;
    private Date uend;

    public MyUsage(String phoneNum, double udata, int ucall, int message, Date ustart, Date uend) {
        this.phoneNum = phoneNum;
        this.udata = udata;
        this.ucall = ucall;
        this.message = message;
        this.ustart = ustart;
        this.uend = uend;
    }
}
