package com.zeno.intelvision;

import com.zeno.intelvision.request.*;
import com.zeno.intelvision.response.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by pc on 2016/3/17.
 */
public class GroupTest extends CreateAndDeleteBaseTest {

    @Before
    public void addPerson() {
        GroupAddPersonRequest request = new GroupAddPersonRequest();
        request.setGroupId(groupId);
        request.setPersonId(personId);
        GroupAddPersonResponse response = zenoClient.execute(request);
        assertEquals(true, response.isSuccess());
    }

    @Test
    public void getInfo() {
        GroupGetInfoRequest request = new GroupGetInfoRequest();
        request.setGroupId(groupId);
        GroupGetInfoResponse response = zenoClient.execute(request);
        assertNotNull(response.getGroup().getGroupId());
        assertEquals(groupId, response.getGroup().getGroupId());
    }

    @Test
    public void setInfo() {
        GroupSetInfoRequest request = new GroupSetInfoRequest();
        request.setGroupId(groupId);
        request.setGroupName(groupName);
        request.setTag("test");
        GroupSetInfoResponse response = zenoClient.execute(request);
        assertNotNull(response.getGroup().getGroupId());
        assertEquals(groupId, response.getGroup().getGroupId());
        assertEquals("test", response.getGroup().getTag());
    }

    @Test
    public void persons() {
        GroupPersonsRequest request = new GroupPersonsRequest();
        request.setGroupId(groupId);
        GroupPersonsResponse response = zenoClient.execute(request);
        assertNotNull(response.getPersons().get(0).getPersonId());
        assertEquals(personId, response.getPersons().get(0).getPersonId());
    }

    @After
    public void deletePerson() {
        GroupDeletePersonRequest request = new GroupDeletePersonRequest();
        request.setGroupId(groupId);
        request.setPersonId(personId);
        GroupDeletePersonResponse response = zenoClient.execute(request);
        assertEquals(true, response.isSuccess());
    }
}
