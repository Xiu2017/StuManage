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
@RequestMapping("stuAction")
public class StuAction {

    @Resource(name = "stuService")
    private StuService stuService;

    //增
    @RequestMapping("/addStu")
    public String addStu(Stu stu, RedirectAttributes attr){
        //调用服务层方法执行添加业务
        if(stu!=null) {
            if (stuService.addStu(stu)) {
                attr.addAttribute("rtype","1");
            }else{
                attr.addAttribute("rtype","-1");
            }
        }else {
            attr.addAttribute("rtype","-2");
        }
        return "redirect:/addStu.jsp";
    }

    //删

    //改

    //查

    public void setStuService(StuService stuService) {
        this.stuService = stuService;
    }
}
