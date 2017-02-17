package com.lark.dao.mapper;

import com.lark.dao.pojo.Booking;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BookingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Booking record);

    int insertSelective(Booking record);

    Booking selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Booking record);

    int updateByPrimaryKey(Booking record);

    List<Booking> selectByRoomId(@Param("roomId") Integer roomId,@Param("date") Date date);
}