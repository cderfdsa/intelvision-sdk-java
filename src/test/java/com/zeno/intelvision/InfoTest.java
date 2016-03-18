package com.zeno.intelvision;

import com.zeno.intelvision.request.InfoGetAppRequest;
import com.zeno.intelvision.request.InfoGetFacesetListRequest;
import com.zeno.intelvision.request.InfoGetGroupListRequest;
import com.zeno.intelvision.request.InfoGetPersonListRequest;
import com.zeno.intelvision.response.InfoGetAppResponse;
import com.zeno.intelvision.response.InfoGetFacesetListResponse;
import com.zeno.intelvision.response.InfoGetGroupListResponse;
import com.zeno.intelvision.response.InfoGetPersonListResponse;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by pc on 2016/3/18.
 */
public class InfoTest extends CreateAndDeleteBaseTest {

    @Test
    public void getFacesetList() {
        InfoGetFacesetListRequest request = new InfoGetFacesetListRequest();
        InfoGetFacesetListResponse response = zenoClient.execute(request);
        assertNotNull(response.getFacesets().get(0).getFacesetId());
    }

    @Test
    public void getPersonList() {
        InfoGetPersonListRequest request = new InfoGetPersonListRequest();
        InfoGetPersonListResponse response = zenoClient.execute(request);
        assertNotNull(response.getPersons().get(0).getPersonId());
    }

    @Test
    public void getGroupList() {
        InfoGetGroupListRequest request = new InfoGetGroupListRequest();
        InfoGetGroupListResponse response = zenoClient.execute(request);
        assertNotNull(response.getGroups().get(0).getGroupId());
    }

    @Test
    public void getApp() {
        InfoGetAppRequest request = new InfoGetAppRequest();
        InfoGetAppResponse response = zenoClient.execute(request);
        assertNotNull(response.getName());
    }
}
