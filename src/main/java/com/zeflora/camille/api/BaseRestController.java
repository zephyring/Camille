package com.zeflora.camille.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Zephyr Lin
 * User: zephyr
 * Date: 6/14/18
 * Time: 11:37 PM
 */
@RestController
public class BaseRestController {
    private static final Logger LOG = LoggerFactory.getLogger(BaseRestController.class);

    private AtomicInteger callCnt = new AtomicInteger(0);

    @RequestMapping(value = "/v1/hello")
    public String hello() {
        String ret = "Hello, called " + callCnt.incrementAndGet() + " times";
        LOG.info(ret);
        return ret;
    }
}
