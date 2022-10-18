package com.serenitydojo;

public class Cat extends Pet{
    private final String favoriteToy;

    public Cat(String name, int age, String favoriteToy) {
        super(name, age);
     this.favoriteToy = favoriteToy;
    }



    public String getFavoriteToy() {
        return favoriteToy;
    }
    
    @Override
    public String play() {
        return "plays with string";
    }
}

