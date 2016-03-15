package com.zeno.intelvision;

import org.junit.BeforeClass;

/**
 * @author lan
 * @since 2016-03-15
 */
public class BaseTest {

    protected static ZenoClient zenoClient;

    @BeforeClass
    public static void beforeClass() {
        zenoClient = new DefaultZenoClient("testKey", "testSecret", "https://www.intelvision.cn/api");
    }
}
