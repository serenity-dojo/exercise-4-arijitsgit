package com.serenitydojo;

public class Dog {

    private String name;
    private String favoriteToy;
    private int age;
    private boolean isFed = false;

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;

    }

    public String getName() {
        return name;
    }


    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public String makeNoise(){
        return "Woof";
         }

    public boolean isFed() {
        return isFed;
    }


    public void feed() {
        this.isFed = true;
    }
}
