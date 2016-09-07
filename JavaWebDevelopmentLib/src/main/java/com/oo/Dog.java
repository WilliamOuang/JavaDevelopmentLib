package com.oo;

public class Dog extends Animal{
    
    private String forlorColor;
    public Dog(String name,String forlorColor){
        super(name);
        this.forlorColor = forlorColor;
    }
    public void enjoy(){
        System.out.println("dog叫声~~~");
    }

}
