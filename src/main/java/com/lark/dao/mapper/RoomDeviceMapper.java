package com.lark.dao.mapper;

import com.lark.dao.pojo.RoomDevice;

public interface RoomDeviceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoomDevice record);

    int insertSelective(RoomDevice record);

    RoomDevice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoomDevice record);

    int updateByPrimaryKey(RoomDevice record);
}