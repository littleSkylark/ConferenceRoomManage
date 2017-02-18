package com.lark.service;

import com.lark.dao.mapper.FutureBookingMapper;
import com.lark.dao.pojo.FutureBooking;
import com.lark.utils.DateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


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

    public int deleteInvalid() {
        Date date= DateFormat.toDate(DateFormat.toStrDate(new Date()));
        return futureBookingMapper.deleteInvalid(new Date());
    }
}
