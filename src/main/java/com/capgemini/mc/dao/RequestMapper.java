package com.capgemini.mc.dao;

import com.capgemini.mc.pojo.Request;
import java.util.List;

public interface RequestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Request record);

    Request selectByPrimaryKey(Integer id);

    List<Request> selectAll();

    int updateByPrimaryKey(Request record);
}