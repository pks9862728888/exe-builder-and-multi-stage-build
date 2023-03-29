package com.demo.exebuilderandmultistagebuild.executors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Profile("env3")
public class Env3Executor implements ExecutorInterface {

    @Override
    public boolean executeAndGetStatus() {
        log.debug("Executing for env3");
        // Do something
        // Return status of execution in env 3
        return true;
    }
}
