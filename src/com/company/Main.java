package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nameOfClass = in.next();
        switch (nameOfClass) {
            case "Cat":
                System.out.println(createObject("Cat").print());
                break;
            case "Dog":
                System.out.println(createObject("Dog").print());
                break;
            case "Pig":
                System.out.println(createObject("Pig").print());
                break;
        }


    }

    public static Animal createObject(String className) {

        if (className.equals(Cat.class.getSimpleName())) {
            return new Cat("Висло ухая ", 1, "" + "Черт", "Черная");
        } else if (className.equals(Pig.class.getSimpleName())) {
            return new Pig("Обычная", 2, "Плюха", 225);
        } else if (className.equals(Dog.class.getSimpleName())) {
            return new Dog("Авчарка", 1, "Мухтар", "атака");
        } else {
            return null;
        }
    }
}
