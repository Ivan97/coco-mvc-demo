package tech.iooo.coco.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.iooo.coco.annotation.ApiVersion;

/**
 * Created by Ivan97 on 2017/7/28 下午4:46
 */
@RestController
@RequestMapping("/{version}")
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    @ApiVersion(1)
    public String hello() {
        logger.info("hello from version 1");
        return "hello from version 1";
    }

    @GetMapping("/hello")
    @ApiVersion(2)
    public String hello2() {
        logger.info("hello from version 2");
        return "hello from version 2";
    }

    @GetMapping("/hello")
    @ApiVersion(5)
    public String hello5() {
        logger.info("hello from version 5");
        return "hello from version 5";
    }
}