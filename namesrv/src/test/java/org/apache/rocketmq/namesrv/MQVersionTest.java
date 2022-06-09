package org.apache.rocketmq.namesrv;

import org.apache.rocketmq.common.MQVersion;
import org.junit.Test;

/**
 * @author 王鹏
 */
public class MQVersionTest {

    @Test
    public void testEnumMethod(){
        System.out.println(MQVersion.Version.V4_9_3.ordinal());
    }
}
