package com.mesosphere.sdk.memcache.scheduler;

import com.mesosphere.sdk.scheduler.SchedulerFlags;
import com.mesosphere.sdk.specification.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            new DefaultService(new File(args[0]), SchedulerFlags.fromEnv()).run();
        } else {
            LOGGER.error("Missing file argument");
            System.exit(1);
        }
    }
}
