package com.lark.controller;

import com.lark.service.BookingService;

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
        int id=0;
        /*try {
            id= (int) session.getAttribute("id");
        } catch (Exception e) {
            return "login";
        }
        int  companyId = (int) session.getAttribute("companyId");
        session.getAttribute("");
        ...*/
        int companyId=1;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = sdf.parse(str_date);
        } catch (Exception e) {
            date = new Date();
        }
        bookingService.queryFutureBookingByDate(id,companyId,date);
        logger.info(sdf.format(date));
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
