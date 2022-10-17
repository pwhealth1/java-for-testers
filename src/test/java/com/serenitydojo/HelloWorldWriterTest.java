package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {
    
    @Test
    public void shouldWRiteHelloWorldToTheConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }
    
    @Test
    public void declaringNumericVariables(){
        final int ageThisYear = 42;
        
        int ageNextYear = ageThisYear + 1;
        
        
        
    
        System.out.println("age = " + ageNextYear);
        
    }
    
    @Test
    public void workingWithStrings(){
    String firstName = "Sarah-Jane";
    String upperCaseName =firstName.replace("Sarah","Mary").toUpperCase().trim();
        System.out.println("Her name is " + upperCaseName.length());
    }
    
//    immutability is desired
//    with extremely large numbers the L at the end is needed
//    for fractional numbers we need to ad F if we are using a specific float point number that has been
//    identified as a float



}
