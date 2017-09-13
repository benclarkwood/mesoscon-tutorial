package com.mesosphere.sdk.memcache.scheduler;

import com.mesosphere.sdk.testing.BaseServiceSpecTest;
import org.junit.Test;

public class ServiceSpecTest extends BaseServiceSpecTest {

    public ServiceSpecTest() {

        super(
            "FRAMEWORK_NAME", "test"
        ); 
    }

    @Test
    public void testYmlBase() throws Exception {
        testYaml("svc.yml");
    }
}
