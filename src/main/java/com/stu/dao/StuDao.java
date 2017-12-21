package com.stu.dao;

import com.stu.entity.Stu;
import org.springframework.stereotype.Repository;

/**
 * Created by xiu on 2017/12/20.
 */
@Repository("stuDao")
public class StuDao extends BaseDao{

    //增
    public boolean addStu(Stu stu){
        try{
            getSession().save(stu);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }

    //删

    //改

    //查
}
