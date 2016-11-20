package cn.intelvision;

import cn.intelvision.model.Face;
import cn.intelvision.model.Group;
import cn.intelvision.model.Person;
import cn.intelvision.request.face.*;
import cn.intelvision.response.face.*;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.File;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author lanhuidong
 * @since 2016-11-18
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonTest extends BaseTest {

    private static String personId;
    private static String faceId;
    private static final String PERSON_NAME = "Michael Jordan";
    private static final String BIRTHDAY = "1963-02-17";
    private static final String REMARK = "6FINALS6FMVP 5MVP 30.1 33.4";
    private static final int AGE = 32;
    private static final String TAG = "Java SDK测试";

    @BeforeClass
    public static void beforeClass() {
        BaseTest.beforeClass();
        FaceDetectRequest request = new FaceDetectRequest();
        String path = PersonTest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "jordan.jpg");
        request.setImg(file);
        FaceDetectResponse response = zenoClient.execute(request);
        faceId = response.getFaces().get(0).getFaceId();
    }


    @Test
    public void test1Create() {
        PersonCreateRequest request = new PersonCreateRequest();
        request.setPersonName(PERSON_NAME);
        request.setGender("1");
        request.setRace(2);
        request.setAge(AGE);
        request.setTag(TAG);
        request.setBirthday(BIRTHDAY);
        request.setRemark(REMARK);
        PersonCreateResponse response = zenoClient.execute(request);
        assertTrue(response.isSuccess());
        assertEquals(16, response.getPersonId().length());
        personId = response.getPersonId();
    }

    @Test
    public void test2GetInfo() {
        PersonGetInfoRequest request = new PersonGetInfoRequest();
        request.setPersonId(personId);
        PersonGetInfoResponse response = zenoClient.execute(request);
        Person person = response.getPerson();
        assertEquals(PERSON_NAME, person.getPersonName());
        assertEquals(BIRTHDAY, person.getBirthday());
//        assertEquals(REMARK, person.getRemark());
    }

    @Test
    public void test3SetInfo() {
        PersonSetInfoRequest request = new PersonSetInfoRequest();
        request.setPersonId(personId);
        request.setPersonName(PERSON_NAME);
        request.setAge(34);
        request.setRace(3);
        request.setGender("1");
        PersonSetInfoResponse response = zenoClient.execute(request);
        Person person = response.getPerson();
        assertNotNull(person);
        assertEquals(new Integer(34), person.getAge());
    }

    @Test
    public void test4AddFace() {
        PersonAddFaceRequest request = new PersonAddFaceRequest();
        request.setPersonId(personId);
        request.setFaceId(faceId);
        PersonAddFaceResponse response = zenoClient.execute(request);
        assertTrue(response.isSuccess());
        assertEquals(1, response.getAdded());
    }

    @Test
    public void test5Faces() {
        PersonFacesRequest request = new PersonFacesRequest();
        request.setPersonId(personId);
        PersonFacesResponse response = zenoClient.execute(request);
        List<Face> faces = response.getFaces();
        assertEquals(1, faces.size());
        assertEquals(16, faces.get(0).getFaceId().length());
    }

    @Test
    public void test6DeleteAddFace() {
        PersonDeleteFaceRequest request = new PersonDeleteFaceRequest();
        request.setPersonId(personId);
        request.setFaceId(faceId);
        PersonDeleteFaceResponse response = zenoClient.execute(request);
        assertTrue(response.isSuccess());
        assertEquals(1, response.getDeleted());
    }

    /**
     * @see GroupTest#test6Groups()
     */
    @Test
    public void test7Groups() {
        PersonGroupsRequest request = new PersonGroupsRequest();
        request.setPersonId(personId);
        PersonGroupsResponse response = zenoClient.execute(request);
        List<Group> groups = response.getGroups();
        assertEquals(0, groups.size());
    }

    @Test
    public void test8Delete() {
        PersonDeleteRequest request = new PersonDeleteRequest();
        request.setPersonId(personId);
        PersonDeleteResponse response = zenoClient.execute(request);
        assertTrue(response.isSuccess());
        assertEquals(1, response.getDeleted());
    }
}
