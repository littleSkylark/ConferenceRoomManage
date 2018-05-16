package com.lark.service;

import com.lark.dao.mapper.BookingMapper;
import com.lark.dao.pojo.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by skylark on 2017/1/20.
 */
@Service
public class AuthService {

    @Autowired
    private BookingMapper bookingMapper;

    public boolean isLogin(HttpSession session) {
        try{
            if (session.getAttribute("companyId")!=null) {
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }

    public boolean validate(int roomId, Date date, Date startTime, Date endTime) {
        List<Booking> bookings = bookingMapper.selectByRoomId(roomId,date);
        for (int i = 0; i < bookings.size(); i++) {
            if (startTime.compareTo(bookings.get(i).getEndTime()) < 0 && endTime.compareTo(bookings.get(i).getStartTime()) > 0) {
                return false;//时间被占用
            }
        }
        return true;
    }
}
