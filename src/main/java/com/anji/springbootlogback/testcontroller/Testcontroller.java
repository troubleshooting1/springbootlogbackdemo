package com.anji.springbootlogback.testcontroller;

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
public class Testcontroller {
    //logback
    private final static Logger logger= LoggerFactory.getLogger(Testcontroller.class);

    @RequestMapping(value = "/test")
    public String index(){
        logger.debug("test—>记录debug的日志");
        logger.info("test—>访问了index方法");
        logger.error("test—>记录error错误日志");
        return "index";
    }
}
