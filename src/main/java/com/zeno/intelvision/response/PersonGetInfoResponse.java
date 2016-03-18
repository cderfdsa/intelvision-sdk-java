package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Person;

/**
 * Created by pc on 2016/3/16.
 */
public class PersonGetInfoResponse extends ZenoResponse {
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
