package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;

public class WhenCreatingObjects{

    @Test
    public void creating_a_cat() {

        Cat felix = new Cat("Felix",4,"String");

        Assert.assertEquals(felix.getName(), "Felix");
        Assert.assertEquals(felix.getFavoriteToy(), "String");
        Assert.assertEquals(felix.getAge(), 4);
    }

    @Test
    public void creating_a_dog() {

        Dog fido = new Dog("Fido",5, "Bone");
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);

    }
    @Test
    public void  having_bigDOg_bark(){
        Dog bigDog = new Dog("bigDog",10,"shoe");
        Assert.assertEquals(bigDog.makeANoise(),"WOOF");
        bigDog.feed(true);
         Assert.assertEquals(bigDog.getIsFed(),true);
    }
    
    @Test
    public void having_hampster_check(){
        Hamster hamster = new Hamster("johnnyBoy",34,"Wheel");
        System.out.println("The pet's name is " + hamster.getName() + " and his favorite game is " + hamster.getFavoriteToy() + " his age is  " + hamster.getAge());
    }
    @Test
    public void whenAnimalsPlay() {
        Pet fido = new Dog("Fido",5,"Bone");
        Pet spot = new Cat("Spot",5,"String");
        Pet hazel = new Hamster("Hazel", 1, "Wheel");
    
        assertEquals(fido.play(),"plays with bone");
        assertEquals(spot.play(),"plays with string");
        assertEquals(hazel.play(), "runs in wheel");
    }
}
