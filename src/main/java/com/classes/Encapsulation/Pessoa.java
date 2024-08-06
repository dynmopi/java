package com.classes.Encapsulation;

public class Pessoa {
    // note que name está private
    private String name;

    // Get
    public String getName(){
        return name;
    }
    // Set
    public void setName(String newName){
        this.name = newName;
    }
}
