package com.zc.manager.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ManagerIndexAction {

    @RequestMapping(value = "/{page}",method = RequestMethod.GET)
    public String index1(@PathVariable String page){
        return page;
    }

    @RequestMapping(value = "/pages/{pageName1}",method = RequestMethod.GET)
    public String index2(@PathVariable String pageName1){
        return "pages/"+pageName1;
    }

    @RequestMapping(value = "/pages/{pageName1}/{pageName2}",method = RequestMethod.GET)
    public String Index3(@PathVariable String pageName1,@PathVariable String pageName2){
        return "pages/"+pageName1+"/"+pageName2;
    }
}
