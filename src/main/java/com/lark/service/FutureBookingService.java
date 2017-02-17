package com.lark.service;

import com.lark.dao.mapper.FutureBookingMapper;
import com.lark.dao.pojo.FutureBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by skylark on 2017/2/16.
 */
@Service
public class FutureBookingService {
    @Autowired
    private FutureBookingMapper futureBookingMapper;
    public void insertFutureBooking(FutureBooking futureBooking) {
        futureBookingMapper.insert(futureBooking);
    }
}
