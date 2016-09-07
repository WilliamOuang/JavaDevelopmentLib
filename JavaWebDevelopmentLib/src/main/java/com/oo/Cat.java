package com.oo;

public class Cat  extends Animal{
    
    private String eyesColor;
    public Cat(String name,String eyesColor){
        super(name);
        this.eyesColor = eyesColor;
    }
    public void enjoy(){
        System.out.println("cat叫声~~~");
    }
}