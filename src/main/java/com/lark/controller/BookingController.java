package com.lark.controller;

import com.google.gson.Gson;
import com.lark.message.BookingShow;
import com.lark.service.BookingService;

import com.lark.utils.DateFormat;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by skylark on 2017/1/19.
 */
@Controller
public class BookingController {
    @Autowired
    private BookingService bookingService;
    private final Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/booking/show")
    public String bookingShow(@RequestParam(value = "date", required = false) String str_date,
                              HttpSession session, ModelMap map) {
        logger.info("/booking/show");
        int id = 2;
        /*try {
            id= (int) session.getAttribute("id");
        } catch (Exception e) {
            return "login";
        }
        int  companyId = (int) session.getAttribute("companyId");
        session.getAttribute("");
        ...*/

        int companyId = 2;
        str_date = "2017-01-21";

        List<String> roomNames = bookingService.queryRoomNameByCompanyId(companyId);

        Date date = DateFormat.toDate(str_date);
        List<BookingShow> bookingShows = bookingService.queryFutureBookingByDate(id,companyId, date);
        Gson gson = new Gson();
        String roomNamesJson=gson.toJson(roomNames);
        String dataJson = gson.toJson(bookingShows);
        logger.info("roomNames:"+roomNamesJson);
        logger.info("bookingShow:" + dataJson);
        return "bookingShow";
    }

    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    public void booking(HttpServletResponse response) throws IOException {
        logger.info("/booking");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.print("ok");
        writer.flush();
        writer.close();
    }
}
