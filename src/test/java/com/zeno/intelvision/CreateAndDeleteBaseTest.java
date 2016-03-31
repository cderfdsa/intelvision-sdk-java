package com.zeno.intelvision;

import com.zeno.intelvision.request.*;
import com.zeno.intelvision.response.*;
import com.zeno.intelvision.util.RandomString;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by pc on 2016/3/17.
 */
public class CreateAndDeleteBaseTest extends FaceDetectTest {
    protected static String groupId;
    protected static String personId;
    protected static String facesetId;
    protected static String groupName;
    protected static String personName;
    protected static String facesetName;

    @BeforeClass
    public static void createTest() {
        PersonCreateRequest personCreateRequest = new PersonCreateRequest();
        personName = RandomString.getString(20);
        personCreateRequest.setPersonName(personName);
        personCreateRequest.setAge((int) (Math.random() * 90 + 10));
        personCreateRequest.setRace((int) (Math.random() * 3 + 1));
        personCreateRequest.setGender(String.valueOf((int) (Math.random() * 2 + 1)));
        PersonCreateResponse personCreateResponse = zenoClient.execute(personCreateRequest);
        assertNotNull("person create fail", personCreateResponse.getPersonId());
        personId = personCreateResponse.getPersonId();

        GroupCreateRequest groupCreateRequest = new GroupCreateRequest();
        groupName = RandomString.getString(20);
        groupCreateRequest.setGroupName(groupName);
        GroupCreateResponse groupCreateResponse = zenoClient.execute(groupCreateRequest);
        assertNotNull("group create fail", groupCreateResponse.getGroupId());
        groupId = groupCreateResponse.getGroupId();

        FacesetCreateRequest facesetCreateRequest = new FacesetCreateRequest();
        facesetName = RandomString.getString(20);
        facesetCreateRequest.setFacesetName(facesetName);
        FacesetCreateResponse facesetCreateResponse = zenoClient.execute(facesetCreateRequest);
        assertNotNull("faceset create fail", facesetCreateResponse.getFacesetId());
        facesetId = facesetCreateResponse.getFacesetId();
    }

    @AfterClass
    public static void delete() {
        FacesetDeleteRequest facesetDeleteRequest = new FacesetDeleteRequest();
        facesetDeleteRequest.setFacesetId(facesetId);
        FacesetDeleteResponse facesetDeleteResponse = zenoClient.execute(facesetDeleteRequest);
        assertEquals(true, facesetDeleteResponse.isSuccess());

        GroupDeleteRequest groupDeleteRequest = new GroupDeleteRequest();
        groupDeleteRequest.setGroupId(groupId);
        GroupDeleteResponse groupDeleteResponse = zenoClient.execute(groupDeleteRequest);
        assertEquals(true, groupDeleteResponse.isSuccess());

        PersonDeleteRequest personDeleteRequest = new PersonDeleteRequest();
        personDeleteRequest.setPersonId(personId);
        PersonDeleteResponse personDeleteResponse = zenoClient.execute(personDeleteRequest);
        assertEquals(true, personDeleteResponse.isSuccess());

        ImageDeleteRequest imageDeleteRequest = new ImageDeleteRequest();
        imageDeleteRequest.setImageId(imageId);
        ImageDeleteResponse imageDeleteResponse = zenoClient.execute(imageDeleteRequest);
//        assertEquals(true, imageDeleteResponse.isSuccess());
    }
}
