package com.demo.exebuilderandmultistagebuild;

import com.demo.exebuilderandmultistagebuild.executors.ExecutorInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JourneyExecutorService {

//    @Value("${env}")
//    private String env;

    @Autowired
    private ExecutorInterface journeyExecutor;

    public boolean executeJourney() {
        return journeyExecutor.executeAndGetStatus();
    }
}
