package tn.esprit.service;

import tn.esprit.model.Person;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

@WebService(endpointInterface = "tn.esprit.service.PersonServiceImpl")
public class PersonServiceImpl implements PersonService{
    private static Map<Integer,Person> persons=new HashMap<Integer,Person>();
    @Override
    public boolean addPerson(Person p) {
        if(persons.get(p.getId()) != null) return false;
        persons.put(p.getId(),p);
        return true;
    }

    @Override
    public boolean deletePerson(int id) {
        if(persons.get(id)==null) return false;
        persons.remove(id);
        return true;
    }

    @Override
    public Person getPersonByName(String name) {
        if(persons.get(name)==null) return null;
        return persons.get(name);
    }

    @Override
    public Person getPerson(int id) {
        if(persons.get(id)==null) return null;
        return persons.get(id);
    }

    @Override
    public Person[] getAllPersons() {
        return persons.values().toArray(new Person[0]);
    }


}
