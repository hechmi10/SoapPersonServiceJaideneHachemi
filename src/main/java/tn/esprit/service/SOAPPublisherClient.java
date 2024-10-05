package tn.esprit.service;

import tn.esprit.model.Person;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;

public class SOAPPublisherClient {
    public static void main(String[] args) throws MalformedURLException {
        URL wsdlURL= new URL ("http://localhost:8888/ws/person?wsdl");
        QName qname = new QName("http://service.esprit.tn/", "PersonServiceImplService");
        Service service=Service.create(wsdlURL,qname);
        PersonService ps=service.getPort(PersonService.class);
        Person p1=new Person(1,"Mouna",30);
        Person p2=new Person(2,"Sarra",25);
        Person p3=new Person(3,"Yosr",22);
        System.out.println("Add person status:"+ps.addPerson(p1));
        System.out.println("Add person status:"+ps.addPerson(p2));
        System.out.println("Add person status:"+ps.addPerson(p3));
        Person[] persons = ps.getAllPersons();
        System.out.println("List of all persons:");
        for (Person person : persons) {
            System.out.println("ID: " + person.getId() + ", Name: " + person.getNom() + ", Age: " + person.getAge());
        }
    }
}
