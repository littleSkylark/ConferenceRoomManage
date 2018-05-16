package com.lark.controller;

import com.google.gson.Gson;
import com.lark.dao.pojo.Booking;
import com.lark.dao.pojo.FutureBooking;
import com.lark.message.BookingShow;
import com.lark.message.RoomShow;
import com.lark.service.AuthService;
import com.lark.service.BookingService;

import com.lark.service.FutureBookingService;
import com.lark.service.RoomService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by skylark on 2017/1/19.
 */
@Controller
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @Autowired
    private FutureBookingService futureBookingService;
    @Autowired
    private RoomService roomService;
    @Autowired
    private AuthService authService;

    private final Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/booking/show")
    public String bookingShow(HttpSession session, Model map) {
        logger.info("/booking/show");

        //测试代码
        session.setAttribute("id",2);
        session.setAttribute("companyId",2);

        Map<String, Object> bookingQuery = bookingQuery(new Date(), session);
        if ((Integer) bookingQuery.get("code") == 0) {
            return "login";
        }

        Gson gson = new Gson();
        map.addAttribute("bookings", gson.toJson(bookingQuery.get("bookings")));

        int companyId = (int) session.getAttribute("companyId");
        List<RoomShow> roomShows = roomService.queryRoomByCompanyId(companyId);
        map.addAttribute("rooms", gson.toJson(roomShows));
        return "bookingShow";
    }

    @RequestMapping("/booking/query")
    @ResponseBody
    public Map<String, Object> bookingQuery(@DateTimeFormat(pattern = "yyyy-MM-dd") Date date, HttpSession session) {
        logger.info("/booking/query?date=" + date);

        //测试代码
        session.setAttribute("id",2);
        session.setAttribute("companyId",2);

        Map<String, Object> map = new HashMap<>();
        if (!authService.isLogin(session)) {
            map.put("code", 0);//0未登录
            return map;
        }
        map.put("code", 1);//正常

        int id= (int) session.getAttribute("id");
        int  companyId = (int) session.getAttribute("companyId");
        List<BookingShow> bookingShows = bookingService.queryFutureBookingByDate(id, companyId, date);
        map.put("bookings", bookingShows);
        return map;
    }

    @RequestMapping(value = "/booking", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> booking(String topic, @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,
                                       @DateTimeFormat(pattern = "HH:mm") Date startTime,
                                       @DateTimeFormat(pattern = "HH:mm") Date endTime,
                                       int roomId, String device, HttpSession session) throws IOException {
        logger.info("/booking:topic=" + topic + " date=" + date + " startTime=" + startTime
                + " endTime=" + endTime + " roomId=" + roomId + " device=" + device);

        //测试代码
        session.setAttribute("id",2);
        session.setAttribute("companyId",2);

        Map<String, Object> map = new HashMap<>();
        if (!authService.isLogin(session)) {
            map.put("code", 0);//0未登录
            return map;
        }
        if (!authService.validate(roomId, date, startTime, endTime)) {
            map.put("code", 3);//时间不符
            return map;
        }

        int companyId = 2;
        int id = 2;


        Booking booking = new Booking();
        booking.setTopic(topic);
        booking.setDate(date);
        booking.setStartTime(startTime);
        booking.setEndTime(endTime);
        booking.setRoomId(roomId);
        booking.setDevice(device);
        booking.setCompanyId(companyId);
        booking.setUserId(id);
        bookingService.insertBooking(booking);

        FutureBooking futureBooking = new FutureBooking();
        futureBooking.setDate(date);
        futureBooking.setCompanyId(companyId);
        futureBooking.setBookingId(booking.getId());
        futureBookingService.insertFutureBooking(futureBooking);
        map.put("code", 2);//预定成功
        Map<String, Object> bookings = bookingQuery(date, session);
        map.put("bookings",bookings.get("bookings"));
        return map;
    }
}
