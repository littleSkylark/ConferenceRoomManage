package com.lark.dao.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private Long phoneNum;

    private String email;

    private String password;

    private String name;

    private Date reg_time;

    private Short role;

    private Boolean isAdmin;

    private Integer companyId;

    private Long registration;

    private String auth;

    public User(Integer id, Long phoneNum, String email, String password, String name, Date reg_time, Short role, Boolean isAdmin, Integer companyId, Long registration, String auth) {
        this.id = id;
        this.phoneNum = phoneNum;
        this.email = email;
        this.password = password;
        this.name = name;
        this.reg_time = reg_time;
        this.role = role;
        this.isAdmin = isAdmin;
        this.companyId = companyId;
        this.registration = registration;
        this.auth = auth;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getReg_time() {
        return reg_time;
    }

    public void setReg_time(Date reg_time) {
        this.reg_time = reg_time;
    }

    public Short getRole() {
        return role;
    }

    public void setRole(Short role) {
        this.role = role;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Long getRegistration() {
        return registration;
    }

    public void setRegistration(Long registration) {
        this.registration = registration;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth == null ? null : auth.trim();
    }
}