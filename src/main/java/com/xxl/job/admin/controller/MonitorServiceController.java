package com.xxl.job.admin.controller;

import com.xxl.job.admin.controller.annotation.PermessionLimit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: pq-job-admin
 * @description:
 * @author: young
 * @create: 2018-09-25 11:34
 **/
@RestController
@RequestMapping(value = "/monitor")
public class MonitorServiceController {

    @PermessionLimit(limit = false)
    @RequestMapping(value = "/availability")
    public String availability() {
        return "SUCCESS";
    }

}
