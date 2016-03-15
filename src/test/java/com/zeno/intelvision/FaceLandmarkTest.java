package com.zeno.intelvision;

import com.zeno.intelvision.request.FaceLandmarkRequest;
import com.zeno.intelvision.response.FaceLandmarkResponse;
import org.junit.Test;

/**
 * @author lan
 * @since 2016-03-15
 */
public class FaceLandmarkTest extends BaseTest {

    @Test
    public void testLandmark() {
        FaceLandmarkRequest faceLandmarkRequest = new FaceLandmarkRequest();
        faceLandmarkRequest.setFaceId("0000000000006742");
        FaceLandmarkResponse response = zenoClient.execute(faceLandmarkRequest);
        if (response != null) {
            System.out.println(response.getDetectionId());
        }
    }
}
