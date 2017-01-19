package com.lark.dao.pojo;

import java.util.Date;

public class Futurebook {
    private Integer id;

    private Integer companyId;

    private Integer userId;

    private Integer roomId;

    private Date date;

    private Date startTime;

    private Date endTime;

    public Futurebook(Integer id, Integer companyId, Integer userId, Integer roomId, Date date, Date startTime, Date endTime) {
        this.id = id;
        this.companyId = companyId;
        this.userId = userId;
        this.roomId = roomId;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Futurebook() {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}