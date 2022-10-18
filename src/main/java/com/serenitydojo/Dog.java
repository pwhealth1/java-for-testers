package com.serenitydojo;

public class Dog extends Pet {
   
    static public String DOG_NOISE = "WOOF";
    private String favoriteToy;
    private int age;
    
    public Boolean getIsFed() {
        return isFed;
    }
    
    public void feed(Boolean fed) {
        isFed = fed;
    }
    
    private Boolean isFed;
    
    public  Dog(String name, int age, String favoriteToy) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }
    
    
        public String getFavoriteToy () {
            return favoriteToy;
        }
    
       
    
    public String makeANoise() {
        return DOG_NOISE;
    }
    
    @Override
    public String play() {
        return "plays with bone";
    }
    
}
