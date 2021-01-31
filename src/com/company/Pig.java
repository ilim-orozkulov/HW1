package com.company;

public class Pig extends Animal {

    private int kg;

    public Pig(String paroda, int age, String name, int kg) {
        super(paroda, age, name);
        this.kg = kg;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    @Override
    public String print() {

        return super.print() + " Kg: " + getKg();
    }

}
