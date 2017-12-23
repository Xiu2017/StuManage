package com.stu.dao;

import com.stu.entity.Stu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiu on 2017/12/20.
 */
@Repository("stuDao")
public class StuDao extends BaseDao{

    //增

    //删

    //改

    //查
    public List<Stu> findStuList(String hql){
        return getSession().createQuery(hql).list();

    }
}
