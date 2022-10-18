package com.serenitydojo;

abstract public class Pet {
    private String name;
    
    
    public Pet(int age) {
        this.age = age;
    }
    
    private int age;
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    
   public int getAge() {
        return age;
    }
    
    public String getName() {
        return name;
    }
    
    abstract public String play();
}
