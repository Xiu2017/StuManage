package com.stu.web;

import com.stu.service.StuService;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by xiu on 2017/12/20.
 */
@RequestMapping("stuAction")
public class StuAction {

    @Resource(name = "stuService")
    private StuService stuService;

    //增

    //删

    //改

    //查

    public void setStuService(StuService stuService) {
        this.stuService = stuService;
    }
}
