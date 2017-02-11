package com.lark.dao.mapper;

import com.lark.dao.pojo.Booking;

public interface BookingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Booking record);

    int insertSelective(Booking record);

    Booking selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Booking record);

    int updateByPrimaryKey(Booking record);
}