package com.stu.dao;

import com.stu.entity.Stu;
import org.springframework.stereotype.Repository;

/**
 * Created by xiu on 2017/12/20.
 */
@Repository("stuDao")
public class StuDao extends BaseDao{

    //增

    //删
    public boolean deleteStu(Stu stu){
        try {
            getSession().delete(stu);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    //改

    //查
}
