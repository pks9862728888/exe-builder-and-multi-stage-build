package com.demo.exebuilderandmultistagebuild.executors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Profile("env2")
public class Env2Executor implements ExecutorInterface {

    @Override
    public boolean executeAndGetStatus() {
        log.debug("Executing for env2");
        // Do something
        // Return status of execution in env 2
        return true;
    }
}
