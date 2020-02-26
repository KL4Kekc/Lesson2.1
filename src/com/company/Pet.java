package com.company;

import java.util.Random;

public class Pet {

    private int age = generateDefaultAge();
    Color color;
    Shelter shelter;

    public Pet(Shelter shelter, Color color) {
        this.shelter = shelter;
        this.color = color;
    }

    public Pet() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge(){
        Random r = new Random();
        return r.nextInt(100);
    }
    public  String getInfo(){
        return "Возраст: " + age +
                "Цвет: " + color +
                "Приют: " + shelter;
    }
}
