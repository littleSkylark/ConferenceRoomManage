package com.lark.dao.mapper;

import com.lark.dao.pojo.Device;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Device record);

    int insertSelective(Device record);

    Device selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);
}