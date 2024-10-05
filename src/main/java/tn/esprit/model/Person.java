package tn.esprit.model;

import java.util.Objects;

public class Person {
    private int id;
    private String nom;
    private int age;

    public Person() {
    }

    public Person(int id, String nom, int age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getAge() == person.getAge() && Objects.equals(getId(), person.getId()) && Objects.equals(getNom(), person.getNom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNom(), getAge());
    }
}
