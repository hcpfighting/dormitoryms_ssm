package com.rwkj.dormitory.mapper;

import com.rwkj.dormitory.pojo.Absent;

import java.util.List;

/**
 *缺寝信息持久层
 */
public interface AbsentMapper {
    public List<Absent> list();
    public List<Absent> searchByBuildingName(String value);
    public List<Absent> searchByDormitoryName(String value);
    public void save(Absent absent);
}
