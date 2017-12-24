package com.stu.service;

import com.stu.dao.StuDao;
import com.stu.entity.Stu;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiu on 2017/12/20.
 */
@Service("stuService")
@Transactional(propagation = Propagation.REQUIRED)
public class StuService {

    @Resource(name = "stuDao")
    private StuDao stuDao;

    //增
    public boolean addStu(Stu stu){
        return stuDao.addStu(stu);
    }

    //删
    public boolean deleteStu(Stu stu){
        return stuDao.deleteStu(stu);
    }

    /**
     * 修改学生
     * @param stu Stu
     * @return Boolean
     */
    public boolean updateStu(Stu stu){
        try {
            stuDao.updateStu(stu);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //查
    public List<Stu> findStuList(){
        return stuDao.findStuList("from Stu");
    }

    /**
     * 通过id获取学生
     * @param id int
     * @return Stu
     */
    public Stu getStuById(int id){
        try {
            return stuDao.getStuById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }
}
