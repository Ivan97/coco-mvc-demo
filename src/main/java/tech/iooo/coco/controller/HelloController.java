package tech.iooo.coco.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tech.iooo.coco.annotation.ApiVersion;

/**
 * Created by Ivan97 on 2017/7/28 下午4:46
 */
@Controller
@RequestMapping("/{version}/")
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("hello")
    @ApiVersion(1)
    @ResponseBody
    public String hello() {
        logger.info("hello from version 1");
        return "hello from version 1";
    }

    @RequestMapping("hello")
    @ApiVersion(2)
    @ResponseBody
    public String hello2() {
        logger.info("hello from version 2");
        return "hello from version 2";
    }

    @RequestMapping("hello")
    @ApiVersion(5)
    @ResponseBody
    public String hello5() {
        logger.info("hello from version 5");
        return "hello from version 5";
    }
}