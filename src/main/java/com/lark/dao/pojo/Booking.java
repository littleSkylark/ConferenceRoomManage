package com.lark.dao.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Booking {
    private Integer id;

    private Integer companyId;

    private Integer userId;

    private Integer roomId;

    private String topic;

    private Date date;

    private Date startTime;

    private Date endTime;

    private String device;

    private Date bookTime;

    private Boolean status;

    public Booking(Integer id, Integer companyId, Integer userId, Integer roomId, String topic, Date date, Date startTime, Date endTime, String device, Date bookTime, Boolean status) {
        this.id = id;
        this.companyId = companyId;
        this.userId = userId;
        this.roomId = roomId;
        this.topic = topic;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.device = device;
        this.bookTime = bookTime;
        this.status = status;
    }

    public Booking() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(@DateTimeFormat(pattern = "hh:mm") Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(@DateTimeFormat(pattern = "hh:mm") Date endTime) {
        this.endTime = endTime;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public Date getBookTime() {
        return bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", userId=" + userId +
                ", roomId=" + roomId +
                ", topic='" + topic + '\'' +
                ", date=" + date +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", device='" + device + '\'' +
                ", bookTime=" + bookTime +
                ", status=" + status +
                '}';
    }
}