package com.database.hw.service;

import com.database.hw.entity.MyOrder;
import net.sf.json.JSONObject;

import java.util.List;

public interface HomeworkService {
    List<JSONObject> findSeries(String phoneNum);

    MyOrder orderNextMonth(String phoneNum, long sid);

    MyOrder orderImmediately(String phoneNum, long sid);

    MyOrder cancelImmediately(String phoneNum, long oid);

    MyOrder cancelNextMonth(String phoneNum, long oid);

    JSONObject generateMonthlyBill(String phoneNum);
    
}
