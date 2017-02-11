package com.lark.service;

import com.lark.dao.mapper.FutureBookingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by skylark on 2017/1/19.
 */
@Service
public class BookingService {

    @Autowired
    private FutureBookingMapper futureBookingMapper;

    public void queryFutureBookingByDate(int id, int companyId, Date date) {
        futureBookingMapper.selectByDate(companyId,date);
    }
}
