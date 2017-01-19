package com.lark.dao.mapper;

import com.lark.dao.pojo.Futurebook;

public interface FuturebookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Futurebook record);

    int insertSelective(Futurebook record);

    Futurebook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Futurebook record);

    int updateByPrimaryKey(Futurebook record);
}