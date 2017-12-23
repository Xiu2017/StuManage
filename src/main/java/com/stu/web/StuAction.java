package com.stu.web;

import com.stu.entity.Stu;
import com.stu.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;

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
    @RequestMapping("/deleteStu")
    public String deleteStu(Stu stu, RedirectAttributes attr){
        if(stu!=null){
            if (stuService.deleteStu(stu)){
                attr.addAttribute("rtype","1");
            }else {
                attr.addAttribute("rtype","-1");
            }
        }else {
            attr.addAttribute("rtype","-2");
        }
        return "redirect:/StuList.jsp";
    }

    //改

    //查

    public void setStuService(StuService stuService) {
        this.stuService = stuService;
    }
}
