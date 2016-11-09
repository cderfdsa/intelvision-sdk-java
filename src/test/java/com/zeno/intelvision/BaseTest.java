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
        zenoClient = new DefaultZenoClient("a021829bedb04a7e97848be4edfacb43", "a4c38c4ec5574a91bc68caeea4c33d10", "https://www.intelvision.cn/api");
    }
}
