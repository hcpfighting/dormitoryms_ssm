package com.rwkj.dormitory.mapper;

import com.rwkj.dormitory.pojo.Building;

import java.util.List;

/**
 * 楼宇管理持久层
 */
public interface BuildingMapper {
    public List<Building> list();
    public List<Building> searchByName(String value);
    public List<Building> searchByIntroduction(String value);
    public void save(Building building);
    public void update(Building building);
    public void delete(Integer id);
}
