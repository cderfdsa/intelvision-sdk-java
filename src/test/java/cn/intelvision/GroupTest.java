package cn.intelvision;

import cn.intelvision.model.Group;
import cn.intelvision.model.Person;
import cn.intelvision.request.face.*;
import cn.intelvision.response.face.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author lanhuidong
 * @since 2016-11-18
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GroupTest extends BaseTest {

    private static String groupId;
    private static String personId;
    private static final String GROUP_NAME = "NBA";
    private static final String NEW_GROUP_NAME = "CBA";
    private static final String TAG = "Java SDK测试";
    private static final String PERSON_NAME = "Michael Jordan";
    private static final String BIRTHDAY = "1963-02-17";
    private static final String REMARK = "6FINALS6FMVP 5MVP 30.1 33.4";
    private static final int AGE = 32;

    @BeforeClass
    public static void beforeClass() {
        BaseTest.beforeClass();
        PersonCreateRequest request = new PersonCreateRequest();
        request.setPersonName(PERSON_NAME);
        request.setGender("1");
        request.setRace(2);
        request.setAge(AGE);
        request.setTag(TAG);
        request.setBirthday(BIRTHDAY);
        request.setRemark(REMARK);
        PersonCreateResponse response = zenoClient.execute(request);
        personId = response.getPersonId();
    }

    @AfterClass
    public static void afterClass() {
        PersonDeleteRequest request = new PersonDeleteRequest();
        request.setPersonId(personId);
        zenoClient.execute(request);
    }

    @Test
    public void test1Create() {
        GroupCreateRequest request = new GroupCreateRequest();
        request.setGroupName(GROUP_NAME);
        request.setTag(TAG);
        GroupCreateResponse response = zenoClient.execute(request);
        assertTrue(response.isSuccess());
        assertEquals(16, response.getGroupId().length());
        groupId = response.getGroupId();
    }

    @Test
    public void test2GetInfo() {
        GroupGetInfoRequest request = new GroupGetInfoRequest();
        request.setGroupId(groupId);
        GroupGetInfoResponse response = zenoClient.execute(request);
        Group group = response.getGroup();
        assertNotNull(group);
        assertEquals(GROUP_NAME, group.getGroupName());
        assertTrue(group.getAddTime() > 0);
        assertEquals(16, group.getAppId().length());
    }

    @Test
    public void test3SetInfo() {
        GroupSetInfoRequest request = new GroupSetInfoRequest();
        request.setGroupId(groupId);
        request.setGroupName(NEW_GROUP_NAME);
        GroupSetInfoResponse response = zenoClient.execute(request);
        Group group = response.getGroup();
        assertNotNull(group);
        assertEquals(16, group.getAppId().length());
    }

    @Test
    public void test4AddPerson() {
        GroupAddPersonRequest request = new GroupAddPersonRequest();
        request.setGroupId(groupId);
        request.setPersonId(personId);
        GroupAddPersonResponse response = zenoClient.execute(request);
        assertTrue(response.isSuccess());
        assertEquals(1, response.getAdded());
    }

    @Test
    public void test5Persons() {
        GroupPersonsRequest request = new GroupPersonsRequest();
        request.setGroupId(groupId);
        GroupPersonsResponse response = zenoClient.execute(request);
        List<Person> persons = response.getPersons();
        assertEquals(1, persons.size());
        assertEquals(personId, persons.get(0).getPersonId());
    }

    @Test
    public void test6Groups() {
        PersonGroupsRequest request = new PersonGroupsRequest();
        request.setPersonId(personId);
        PersonGroupsResponse response = zenoClient.execute(request);
        List<Group> groups = response.getGroups();
        assertEquals(1, groups.size());
        assertEquals(groupId, groups.get(0).getGroupId());
    }

    @Test
    public void test7DeletePerson() {
        GroupDeletePersonRequest request = new GroupDeletePersonRequest();
        request.setGroupId(groupId);
        request.setPersonId(personId);
        GroupDeletePersonResponse response = zenoClient.execute(request);
        assertTrue(response.isSuccess());
        assertEquals(1, response.getDeleted());
    }

    @Test
    public void test8Delete() {
        GroupDeleteRequest request = new GroupDeleteRequest();
        request.setGroupId(groupId);
        GroupDeleteResponse response = zenoClient.execute(request);
        assertTrue(response.isSuccess());
        assertEquals(1, response.getDeleted());
    }
}
