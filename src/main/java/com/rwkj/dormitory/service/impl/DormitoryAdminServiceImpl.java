package com.rwkj.dormitory.service.impl;

import com.rwkj.dormitory.pojo.DormitoryAdmin;
import com.rwkj.dormitory.mapper.DormitoryAdminMapper;
import com.rwkj.dormitory.service.DormitoryAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 宿管管理业务层
 */
@Service
public class DormitoryAdminServiceImpl implements DormitoryAdminService {

    @Autowired
    private DormitoryAdminMapper dormitoryAdminMapper;

    @Override
    public List<DormitoryAdmin> list() {
        return this.dormitoryAdminMapper.list();
    }

    @Override
    public List<DormitoryAdmin> search(String key, String value) {
        if(key.equals("")) return this.dormitoryAdminMapper.list();
        List<DormitoryAdmin> list = null;
        switch (key){
            case "username":
                list = this.dormitoryAdminMapper.searchByUsername(value);
                break;
            case "name":
                list = this.dormitoryAdminMapper.searchByName(value);
                break;
            case "telephone":
                list = this.dormitoryAdminMapper.searchByTelephone(value);
                break;
        }
        return list;
    }

    @Override
    public void save(DormitoryAdmin dormitoryAdmin) {
        try {
            this.dormitoryAdminMapper.save(dormitoryAdmin);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            this.dormitoryAdminMapper.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(DormitoryAdmin dormitoryAdmin) {
        try {
            this.dormitoryAdminMapper.update(dormitoryAdmin);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
