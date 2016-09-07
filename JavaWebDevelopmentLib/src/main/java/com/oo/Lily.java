package com.oo;

public class Lily {
	private String name;
    private Animal animal;
    public Lily(String name, Animal animal){
        this.name = name;
        this.animal = animal;
    }
    public void myAnimalEnjoy(){
        animal.enjoy();
    }
}
