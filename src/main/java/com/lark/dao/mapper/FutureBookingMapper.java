package com.lark.dao.mapper;

import com.lark.dao.pojo.FutureBooking;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface FutureBookingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FutureBooking record);

    int insertSelective(FutureBooking record);

    FutureBooking selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FutureBooking record);

    int updateByPrimaryKey(FutureBooking record);

    List<FutureBooking> selectByDate(int companyId, Date date);
}