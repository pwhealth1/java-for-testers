package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects{

    @Test
    public void creating_a_cat() {

        Cat felix = new Cat("Felix","Tuna", 4);

        Assert.assertEquals(felix.getName(), "Felix");
        Assert.assertEquals(felix.getFavoriteFood(), "Tuna");
        Assert.assertEquals(felix.getAge(), 4);
    }

    @Test
    public void creating_a_dog() {

        Dog fido = new Dog("Fido","Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);

    }
    @Test
    public void  having_bigDOg_bark(){
        Dog bigDog = new Dog("bigDog","shoe",10);
        Assert.assertEquals(bigDog.makeANoise(),"WOOF");
        bigDog.feed(true);
         Assert.assertEquals(bigDog.getIsFed(),true);
    }
    
    @Test
    public void having_hampster_check(){
        Hampster hampster = new Hampster("the chesss", 34);
        hampster.createHampster();
    }
}
