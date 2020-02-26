package com.company;

public class Dog extends Pet{
    private String name;
    private String breed;
    private String commands;

    public Dog() {
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        super(shelter, color);
        this.name = name;
        this.breed = breed;
    }

    public Dog(Shelter shelter, Color color, String name, String breed, String commands) {
        super(shelter, color);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    private void makeVoice(String voice, int number){
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }
    private void makeVoice (String voice){
        System.out.println(voice);
    }
    private void makeVoice(int number){
        for (int i = 0; i < number; i++) {
            System.out.println("Gav gav");
        }
    }
    @Override
    public String getInfo(){
        return "Имя собаки : " + name +
                "Порода собаки: " + breed +
                "Команда собаки: " + commands + " " + super.getInfo();
    }
}
