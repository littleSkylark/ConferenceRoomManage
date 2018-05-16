package com.lark.dao.pojo;

import java.util.Date;

public class FutureBooking {
    private Integer id;

    private Integer bookingId;

    private Integer companyId;

    private Date date;

    public FutureBooking(Integer id, Integer bookingId, Integer companyId, Date date) {
        this.id = id;
        this.bookingId = bookingId;
        this.companyId = companyId;
        this.date = date;
    }

    public FutureBooking() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}