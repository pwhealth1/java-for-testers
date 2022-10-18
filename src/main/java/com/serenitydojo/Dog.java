package com.serenitydojo;

public class Dog {
   
    static public String DOG_NOISE = "WOOF";
    private String name;
    private String favoriteToy;
    private int age;
    
    public Boolean getIsFed() {
        return isFed;
    }
    
    public void feed(Boolean fed) {
        isFed = fed;
    }
    
    private Boolean isFed;
    
    public  Dog(String name, String favoriteToy, int age) {
    
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }
    
        public String getName () {
            return name;
        }
    
        public String getFavoriteToy () {
            return favoriteToy;
        }
    
        public int getAge () {
            return age;
        }
    
    public String makeANoise() {
        return DOG_NOISE;
    }
    
    
}
