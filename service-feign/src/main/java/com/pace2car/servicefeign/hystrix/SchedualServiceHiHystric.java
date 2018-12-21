package com.pace2car.servicefeign.hystrix;

import com.pace2car.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author Pace2Car
 * @date 2018/12/21 17:49
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry," + name;
    }
}
