package com.jin2ml.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author jin2ml
 * @date 2019-03-25
 */
@FeignClient(value = "eureka-client")
public interface SchedualServiceHi {
    /**
     * test
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    String sayHiFromClientOne(@PathVariable String name);
}
