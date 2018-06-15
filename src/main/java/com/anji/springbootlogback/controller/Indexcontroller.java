package com.anji.springbootlogback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/14 17:15
 */
@RestController
public class Indexcontroller {
    //logback
    private final static Logger logger= LoggerFactory.getLogger(Indexcontroller.class);

    @RequestMapping(value = "/index")
    public String index(){
        logger.debug("记录debug的日志");
        logger.info("访问了index方法");
        logger.error("记录error错误日志");
        return "index";
    }
}
