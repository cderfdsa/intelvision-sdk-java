package com.zeno.intelvision;

import com.zeno.intelvision.request.*;
import com.zeno.intelvision.response.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by pc on 2016/3/17.
 */
public class PersonTest extends CreateAndDeleteBaseTest {

    @BeforeClass
    public static void groupAddPerson() {
        GroupAddPersonRequest request = new GroupAddPersonRequest();
        request.setGroupId(groupId);
        request.setPersonId(personId);
        GroupAddPersonResponse response = zenoClient.execute(request);
        assertEquals(true, response.isSuccess());
    }

    @Before
    public void addFace() {
        PersonAddFaceRequest request = new PersonAddFaceRequest();
        request.setFaceId(faceId);
        request.setPersonId(personId);
        PersonAddFaceResponse response = zenoClient.execute(request);
        assertEquals(true, response.isSuccess());
    }

    @Test
    public void getInfo() {
        PersonGetInfoRequest request = new PersonGetInfoRequest();
        request.setPersonId(personId);
        PersonGetInfoResponse response = zenoClient.execute(request);
        assertNotNull(response.getPerson().getPersonId());
        assertEquals(personId, response.getPerson().getPersonId());
    }

    @Test
    public void faces() {
        PersonFacesRequest request = new PersonFacesRequest();
        request.setPersonId(personId);
        PersonFacesResponse response = zenoClient.execute(request);
        assertNotNull(response.getFaces().get(0).getPersonId());
        assertEquals(personId, response.getFaces().get(0).getPersonId());
    }

    @Test
    public void setInfo() {
        PersonSetInfoRequest request = new PersonSetInfoRequest();
        request.setPersonId(personId);
        request.setPersonName(personName);
        request.setTag("test");
        request.setAge((int) (Math.random() * 90 + 10));
        request.setGender(String.valueOf((int) (Math.random() * 2 + 1)));
        request.setRace((int) (Math.random() * 3 + 1));
        PersonSetInfoResponse response = zenoClient.execute(request);
        assertNotNull(response.getPerson().getPersonId());
        assertEquals("test", response.getPerson().getTag());
    }

    @Test
    public void groups() {
        PersonGroupsRequest request = new PersonGroupsRequest();
        request.setPersonId(personId);
        PersonGroupsResponse response = zenoClient.execute(request);
        assertNotNull(groupId, response.getGroups().get(0).getGroupId());
    }


    @After
    public void deleteFace() {
        PersonDeleteFaceRequest request = new PersonDeleteFaceRequest();
        request.setFaceId(faceId);
        request.setPersonId(personId);
        PersonDeleteFaceResponse response = zenoClient.execute(request);
        assertEquals(true, response.isSuccess());
    }
}
