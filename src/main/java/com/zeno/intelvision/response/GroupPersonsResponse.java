package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Person;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class GroupPersonsResponse extends ZenoResponse {
    private List<Person> persons;

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
