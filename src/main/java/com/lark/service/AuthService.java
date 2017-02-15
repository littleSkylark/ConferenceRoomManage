package com.lark.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by skylark on 2017/1/20.
 */
@Service
public class AuthService {
    public boolean isLogin(HttpSession session) {
        /*try{
            if (session.getAttribute("companyId") instanceof Integer) {
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            return false;
        }*/
        return true;
    }
}
