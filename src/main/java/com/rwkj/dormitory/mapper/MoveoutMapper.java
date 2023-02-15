package com.rwkj.dormitory.mapper;

import com.rwkj.dormitory.pojo.Moveout;

import java.util.List;

/**
 * 迁出管理持久层
 */
public interface MoveoutMapper {
    public List<Moveout> list();
    public List<Moveout> searchByStudentName(String value);
    public List<Moveout> searchByDormitoryName(String value);
}
