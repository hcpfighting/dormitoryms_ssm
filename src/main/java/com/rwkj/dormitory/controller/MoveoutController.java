package com.rwkj.dormitory.controller;

import com.rwkj.dormitory.pojo.Moveout;
import com.rwkj.dormitory.service.MoveoutService;
import com.rwkj.dormitory.service.StudentServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 迁出管理控制层
 */
@Controller
@RequestMapping("/moveout")
public class MoveoutController {

    @Autowired
    private StudentServie studentServie;
    @Autowired
    private MoveoutService moveoutService;

    @GetMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("moveoutregister");
        modelAndView.addObject("list", this.studentServie.moveoutList());
        return modelAndView;
    }

    @PostMapping("/search")
    public ModelAndView search(String key,String value){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("moveoutregister");
        modelAndView.addObject("list", this.studentServie.searchForMoveoutList(key, value));
        return modelAndView;
    }

    @PostMapping("/register")
    public String register(Moveout moveout){
        this.studentServie.moveout(moveout);
        return "redirect:/moveout/list";
    }

    @GetMapping("/record")
    public ModelAndView record(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("moveoutrecord");
        modelAndView.addObject("list", this.moveoutService.list());
        return modelAndView;
    }

    @PostMapping("/recordSearch")
    public ModelAndView recordSearch(String key,String value){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("moveoutrecord");
        modelAndView.addObject("list", this.moveoutService.search(key, value));
        return modelAndView;
    }
}
