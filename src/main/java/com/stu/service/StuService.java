package com.stu.service;

import com.stu.dao.StuDao;
import com.stu.entity.Stu;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

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

    //改

    //查

    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }
}
