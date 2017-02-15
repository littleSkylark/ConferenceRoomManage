package com.lark.controller;

import com.google.gson.Gson;
import com.lark.message.BookingShow;
import com.lark.message.RoomShow;
import com.lark.service.AuthService;
import com.lark.service.BookingService;

import com.lark.service.RoomService;
import com.lark.utils.DateFormat;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
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
    private RoomService roomService;
    @Autowired
    private AuthService authService;

    private final Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/booking/show")
    public String bookingShow(HttpSession session, Model map) {
        logger.info("/booking/show");

        Map<String, Object> bookingQuery = bookingQuery(DateFormat.toStrDate(new Date()), session);
        if (bookingQuery.get("code")!=null) {
            return "login";
        }
        map.addAllAttributes(bookingQuery);//bookings
        Gson gson=new Gson();
        map.addAttribute("bookings",gson.toJson(bookingQuery.get("bookings")));


        /*int companyId = (int) session.getAttribute("companyId");*/
        int companyId = 2;
        List<RoomShow> roomShows = roomService.queryRoomByCompanyId(companyId);
        map.addAttribute("rooms",gson.toJson(roomShows));

        return "bookingShow";
    }

    @RequestMapping("/booking/query")
    @ResponseBody
    public Map<String, Object> bookingQuery(@RequestParam(value = "date") String str_date,
                                            HttpSession session) {
        logger.info("/booking/query?date="+str_date);

        Map<String, Object> map = new HashMap<>();
        if(!authService.isLogin(session)){
            map.put("code",0);//0未登录
            return map;
        }
        /*int id= (int) session.getAttribute("id");
        int  companyId = (int) session.getAttribute("companyId");*/

        int id = 2;
        int companyId = 2;
        str_date = "2017-01-21";

        Date date = DateFormat.toDate(str_date);
        List<BookingShow> bookingShows = bookingService.queryFutureBookingByDate(id, companyId, date);

        map.put("bookings", bookingShows);
        return map;
    }

    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    public void booking(HttpServletResponse response) throws IOException {
        logger.info("/booking");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.print("[ok]");
        writer.flush();
        writer.close();
    }
}
