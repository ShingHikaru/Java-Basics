package com.company;

public class Main {

    public static void main(String[] args) {
	Person person = new Person();
	person.setFirstName("");
	person.setLastName("");
	person.setAge(-5);
        System.out.println("age is " + person.getAge());
        System.out.println("Full name is" + person.getFullName());
        System.out.println("teen = " + person.isTeen());
    person.setFirstName("John");
    person.setAge(18);
        System.out.println("Full name is" + person.getFullName());
        System.out.println("teen = " + person.isTeen());
    person.setLastName("Smith");
        System.out.println("Full name is " + person.getFullName());
    }
}
