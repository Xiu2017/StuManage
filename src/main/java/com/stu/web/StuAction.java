package com.stu.web;

import com.stu.entity.Stu;
import com.stu.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiu on 2017/12/20.
 */
@Controller
@RequestMapping("/stuAction")
public class StuAction {

    @Resource(name = "stuService")
    private StuService stuService;

    @RequestMapping("/test")
    public void testMsg(){
        System.out.println("测试通过");
    }

    //增

    //删

    //改

    //查
    @RequestMapping("/findStuList")
    @ResponseBody
    public List<Stu> findStuList(){
        return stuService.findStuList();
    }

    public void setStuService(StuService stuService) {
        this.stuService = stuService;
    }
}
