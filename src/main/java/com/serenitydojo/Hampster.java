package com.serenitydojo;

public class Hampster extends Pet{
   
   private String favoriteGame;
   private int age;
    
    public Hampster(String favoriteGame, int age) {
        super("johnnyBoy");
        this.favoriteGame = favoriteGame;
        this.age = age;
    }
    
    public String getFavoriteGame() {
        return favoriteGame;
    }
    
    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
       
       public void createHampster(){
        Hampster johnnyBoy = new Hampster("jump in the pool", 25);
    }
}
