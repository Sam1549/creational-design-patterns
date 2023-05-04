package org.example;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;
    //...

    //    public Person(String name, String surname) {
//        //...
//        this.name = name;
//        this.surname = surname;
//    }
//
//
//    public Person(String name, String surname, int age, String address) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//        this.address = address;
//    }
    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.age = personBuilder.age;
        this.address = personBuilder.address;
    }


    public boolean hasAge() {
        if (this.age != 0) return true;
        else return false;

    }

    public boolean hasAddress() {
        if (this.address != null) return true;
        else return false;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        if (hasAge())
            return OptionalInt.of(age);
        else return null;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public void happyBirthday() {
        if (hasAge()) age++;
    }

    public PersonBuilder newChildBuilder() {
        if (hasAddress()) {
            return new PersonBuilder().setSurname(surname).setAddress(address);
        } else return new PersonBuilder().setSurname(surname);
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }

//    @Override
//    public int hashCode() { /*...*/ }

}
