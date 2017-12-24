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
    public boolean deleteStu(Stu stu){
        try {
            getSession().delete(stu);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 修改学生
     * @param stu Stu
     * @return Boolean
     */
    public boolean updateStu(Stu stu){
        try {
            getSession().update(stu);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //查
    public List<Stu> findStuList(String hql){
        return getSession().createQuery(hql).list();

    }

    /**
     * 通过id获取学生
     * @param id int
     * @return Stu
     */
    public Stu getStuById(int id){
        try {
            return getSession().get(Stu.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
