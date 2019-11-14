package com.example.alcafaz.Modelos;

public class Race {
    private String name;
    private int maxAge;
    private double maxSize, speed;
    private int[] attributes = new int[6];
    private String[] proficiencies, Languages;

    public Race(String name) {
        this.name = name;
    }

    public int[] getAttributes() {
        return attributes;
    }

    public void setAttributes(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma ){
        int[] raceAtributes = {strength, dexterity, constitution, intelligence, wisdom, charisma};
        attributes = raceAtributes;
    }

    public String[] getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(String[] proficiencies) {
        this.proficiencies = proficiencies;
    }

    public String[] getLanguages() {
        return Languages;
    }

    public void setLanguages(String[] languages) {
        Languages = languages;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public double getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(double maxSize) {
        this.maxSize = maxSize;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
