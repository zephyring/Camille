package com.zeflora.camille.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zephyr Lin
 * User: zephyr
 * Date: 6/14/18
 * Time: 11:37 PM
 */
@RestController
public class BaseRestController {
    private static final Logger LOG = LoggerFactory.getLogger(BaseRestController.class);

    @RequestMapping(value = "/v1/hello")
    public String hello() {
        return "Hello";
    }
}
