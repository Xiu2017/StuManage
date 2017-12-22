package com.stu.dao;

import com.stu.entity.Stu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiu on 2017/12/20.
 * 处理学生对象数据库相关的操作
 */

@Repository("stuDao")
public class StuDao extends BaseDao{

    /**
     * 添加学生
     * @param stu Stu
     * @return Boolean
     */
    public boolean addStu(Stu stu){
        return false;
    }

    /**
     * 删除学生
     * @param stu Stu
     * @return Boolean
     */
    public boolean deleteStu(Stu stu){
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

    /**
     * 查询学生集合
     * @param hql String
     * @return List<?>
     */
    public List<?> findStuList(String hql){
        return null;
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
