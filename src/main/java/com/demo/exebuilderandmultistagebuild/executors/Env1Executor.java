package com.demo.exebuilderandmultistagebuild.executors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Primary
@Profile("env1")
public class Env1Executor implements ExecutorInterface {

    @Override
    public boolean executeAndGetStatus() {
        log.debug("Executing for env1");
        // Do something
        // Return status of execution in env 1
        return true;
    }
}
