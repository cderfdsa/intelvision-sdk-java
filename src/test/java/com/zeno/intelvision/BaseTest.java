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
        zenoClient = new DefaultZenoClient("e25e2c4b21014b429fe0e0f9d9dcb165", "d03cde73499e4e0e96825ac88dfb2118", "https://www.intelvision.cn/api");
    }
}
