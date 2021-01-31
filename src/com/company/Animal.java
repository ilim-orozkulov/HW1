package com.company;

public class Animal implements Printable  {

    private String paroda;
    private int age;
    private String name;


    public Animal(String paroda, int age , String name) {
        this.paroda = paroda;
        this.age = age;
        this.name=name;
    }

    public String getParoda() {
        return paroda;
    }

    public void setParoda(String paroda) {
        this.paroda = paroda;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String print() {
        return "Name: " + getName() + " Paroda: " + getParoda() + " Age: " + getAge();
    }
}
