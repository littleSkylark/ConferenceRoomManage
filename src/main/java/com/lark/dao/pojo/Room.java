package com.lark.dao.pojo;

public class Room {
    private Integer id;

    private Integer companyId;

    private Integer minNum;

    private Integer maxNum;

    private String name;

    private Integer beginTime;

    private Integer endTime;

    public Room(Integer id, Integer companyId, Integer minNum, Integer maxNum, String name, Integer beginTime, Integer endTime) {
        this.id = id;
        this.companyId = companyId;
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.name = name;
        this.beginTime = beginTime;
        this.endTime = endTime;
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

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }
}