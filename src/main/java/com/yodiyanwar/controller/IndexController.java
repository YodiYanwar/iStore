package com.yodiyanwar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Yodi Yanwar on 28/03/2015.
 */
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = "/lock_screen", method = RequestMethod.GET)
    public String lockScreen(){
        return "lock_screen";
    }
}
