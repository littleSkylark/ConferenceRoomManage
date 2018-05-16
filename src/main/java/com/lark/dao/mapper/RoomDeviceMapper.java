package com.lark.dao.mapper;

import com.lark.dao.pojo.RoomDevice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomDeviceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoomDevice record);

    int insertSelective(RoomDevice record);

    RoomDevice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoomDevice record);

    int updateByPrimaryKey(RoomDevice record);

    List<RoomDevice> selectByRoomId(@Param("roomId") Integer roomId);
}