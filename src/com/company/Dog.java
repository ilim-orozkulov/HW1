package com.company;

public class Dog extends Animal {

    private String comand;

    public String getComand () {
        return comand;
    }

    public void setComand (String comand){
        this.comand = comand;
    }

    public Dog(String paroda, int age, String name, String comand) {
        super(paroda, age, name);
    }


    @Override
    public String print() {
        return super.print() + " Comand: " + getComand();
    }

}
