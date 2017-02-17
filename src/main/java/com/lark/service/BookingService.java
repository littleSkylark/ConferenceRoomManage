package com.lark.service;

import com.lark.dao.mapper.BookingMapper;
import com.lark.dao.mapper.FutureBookingMapper;
import com.lark.dao.mapper.RoomMapper;
import com.lark.dao.mapper.UserMapper;
import com.lark.dao.pojo.Booking;
import com.lark.dao.pojo.Room;
import com.lark.dao.pojo.User;
import com.lark.message.BookingShow;
import com.lark.utils.DateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by skylark on 2017/1/19.
 */
@Service
public class BookingService {

    @Autowired
    private FutureBookingMapper futureBookingMapper;
    @Autowired
    private BookingMapper bookingMapper;
    @Autowired
    private RoomMapper roomMapper;
    @Autowired
    private UserMapper userMapper;

    public List<BookingShow> queryFutureBookingByDate(int id, int companyId, Date date) {
        List<Integer> bookingIds = futureBookingMapper.selectByCompanyId(companyId, date);
        List<BookingShow> lists = new LinkedList<>();
        String strDate = DateFormat.toStrDate(date);
        for (Integer bookingId : bookingIds) {
            Booking booking = bookingMapper.selectByPrimaryKey(bookingId);
            if (!booking.getStatus()) {
                continue;
            }
            BookingShow bookingShow = new BookingShow();
            if (id == booking.getUserId()) {
                bookingShow.setId("mybook");
                bookingShow.setMettingTheme(booking.getTopic());
                Room room = roomMapper.selectByPrimaryKey(booking.getRoomId());
                bookingShow.setAddress(room.getName() + " ( " + room.getMinNum() + "~" + room.getMaxNum() + "人 )");
                User user = userMapper.selectByPrimaryKey(booking.getUserId());
                bookingShow.setBookPeople(user.getName());
            } else {
                bookingShow.setId("booked");
            }
            bookingShow.setDate(strDate);
            bookingShow.setStartTime(DateFormat.toTime(booking.getStartTime()));
            bookingShow.setEndTime(DateFormat.toTime(booking.getEndTime()));



            lists.add(bookingShow);
        }
        return lists;
    }

    public int insertBooking(Booking booking) {
        int BookingId=bookingMapper.insertSelective(booking);
        return BookingId;
    }
}
