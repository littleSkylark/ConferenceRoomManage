package com.lark.dao.pojo;

import java.util.Date;

public class Room {
    private Integer id;

    private Integer companyId;

    private Integer minNum;

    private Integer maxNum;

    private String name;

    private Date beginTime;

    private Date endTime;

    private Date reg_time;

    private String remarks;

    private Boolean status;

    public Room(Integer id, Integer companyId, Integer minNum, Integer maxNum, String name, Date beginTime, Date endTime, Date reg_time, String remarks, Boolean status) {
        this.id = id;
        this.companyId = companyId;
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.name = name;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.reg_time = reg_time;
        this.remarks = remarks;
        this.status = status;
    }

    public Room() {
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

    public Integer getMinNum() {
        return minNum;
    }

    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getReg_time() {
        return reg_time;
    }

    public void setReg_time(Date reg_time) {
        this.reg_time = reg_time;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}