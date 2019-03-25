package com.jin2ml.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author jin2ml
 * @date 2019-03-25
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry:" + name;
    }
}
