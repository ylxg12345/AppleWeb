package com.byzuse.fruit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * controller about ehcache
 * Created by zhengyongzhang209292 on 2015/10/30 15:12.
 */
@Controller
@RequestMapping("/cache")
public class EhcacheController {


    @RequestMapping(value = "/count", produces = "application/json")
    public String countTime(ModelMap model) {
        model.put("count", "123");

//        Ehcache ehcache = CacheManager.getInstance().getEhcache("abc");


        return "abc";
    }
}
