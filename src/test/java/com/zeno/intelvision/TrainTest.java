package com.zeno.intelvision;

import com.zeno.intelvision.request.*;
import com.zeno.intelvision.response.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by pc on 2016/3/18.
 */
public class TrainTest extends CreateAndDeleteBaseTest {

    @BeforeClass
    public static void add(){
        PersonAddFaceRequest personAddFaceRequest = new PersonAddFaceRequest();
        personAddFaceRequest.setFaceId(faceId);
        personAddFaceRequest.setPersonId(personId);
        PersonAddFaceResponse personAddFaceResponse = zenoClient.execute(personAddFaceRequest);
        assertEquals("person add face fail", true, personAddFaceResponse.isSuccess());

        FacesetAddFaceRequest facesetAddFaceRequest = new FacesetAddFaceRequest();
        facesetAddFaceRequest.setFaceId(faceId);
        facesetAddFaceRequest.setFacesetId(facesetId);
        FacesetAddFaceResponse facesetAddFaceResponse = zenoClient.execute(facesetAddFaceRequest);
        assertEquals("faceset add face fail", true, facesetAddFaceResponse.isSuccess());

        GroupAddPersonRequest groupAddPersonRequest = new GroupAddPersonRequest();
        groupAddPersonRequest.setGroupId(groupId);
        groupAddPersonRequest.setPersonId(personId);
        GroupAddPersonResponse groupAddPersonResponse = zenoClient.execute(groupAddPersonRequest);
        assertEquals("group add person fail",true, groupAddPersonResponse.isSuccess());
    }

    @Test
    public void search(){
        TrainSearchRequest request = new TrainSearchRequest();
        request.setFacesetId(facesetId);
        TrainSearchResponse response = zenoClient.execute(request);
        assertNotNull(response.getSessionId());
    }

    @Test
    public void verify(){
        TrainVerifyRequest request = new TrainVerifyRequest();
        request.setPersonId(personId);
        TrainVerifyResponse response = zenoClient.execute(request);
        assertNotNull(response.getSessionId());
    }

    @Test
    public void identify(){
        TrainIdentifyRequest request = new TrainIdentifyRequest();
        request.setGroupId(groupId);
        TrainIdentifyResponse response = zenoClient.execute(request);
        assertNotNull(response.getSessionId());
    }
}
