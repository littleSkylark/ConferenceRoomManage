package com.lark.dao.mapper;

import com.lark.dao.pojo.Room;

import java.util.List;

public interface RoomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(Integer id);

    List<Room> selectByCompanyId(Integer companyId);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
}