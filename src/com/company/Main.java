package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setName("Chaka");
        Shelter shelter1 = new Shelter("Приют №1", "Советская 1");
        dog1.setShelter(shelter1);
        dog1.setColor(Color.GRAY);
    }
}
