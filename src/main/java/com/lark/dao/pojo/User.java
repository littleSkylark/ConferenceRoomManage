package com.lark.dao.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phoneNum
     *
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    private Long phonenum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.reg_time
     *
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    private Date regTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.role
     *
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    private Short role;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.companyid
     *
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    private Integer companyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.registration
     *
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    private Long registration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.auth
     *
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    private String auth;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public User(Integer id, Long phonenum, String email, String password, String name, Date regTime, Short role, Integer companyid, Long registration, String auth) {
        this.id = id;
        this.phonenum = phonenum;
        this.email = email;
        this.password = password;
        this.name = name;
        this.regTime = regTime;
        this.role = role;
        this.companyid = companyid;
        this.registration = registration;
        this.auth = auth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public User() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phoneNum
     *
     * @return the value of user.phoneNum
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public Long getPhonenum() {
        return phonenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phoneNum
     *
     * @param phonenum the value for user.phoneNum
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public void setPhonenum(Long phonenum) {
        this.phonenum = phonenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.reg_time
     *
     * @return the value of user.reg_time
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.reg_time
     *
     * @param regTime the value for user.reg_time
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.role
     *
     * @return the value of user.role
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public Short getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.role
     *
     * @param role the value for user.role
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public void setRole(Short role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.companyid
     *
     * @return the value of user.companyid
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public Integer getCompanyid() {
        return companyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.companyid
     *
     * @param companyid the value for user.companyid
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.registration
     *
     * @return the value of user.registration
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public Long getRegistration() {
        return registration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.registration
     *
     * @param registration the value for user.registration
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public void setRegistration(Long registration) {
        this.registration = registration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.auth
     *
     * @return the value of user.auth
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public String getAuth() {
        return auth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.auth
     *
     * @param auth the value for user.auth
     * @mbg.generated Tue Jan 17 14:16:48 CST 2017
     */
    public void setAuth(String auth) {
        this.auth = auth == null ? null : auth.trim();
    }
}