package com.lark.message;


import java.util.Date;

/**
 * Created by skylark on 2017/2/12.
 */
public class BookingShow {
    private String id;
    private String startTime;
    private String endTime;
    private String address;
    private String bookPeople;
    private String meetingTheme;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getBookPeople() {
        return bookPeople;
    }

    public void setBookPeople(String bookPeople) {
        this.bookPeople = bookPeople;
    }

    public String getMeetingTheme() {
        return meetingTheme;
    }

    public void setMeetingTheme(String meetingTheme) {
        this.meetingTheme = meetingTheme;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
