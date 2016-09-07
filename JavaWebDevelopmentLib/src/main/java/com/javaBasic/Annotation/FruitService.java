package com.javaBasic.Annotation;

import java.util.ArrayList;
import java.util.List;

public class FruitService {
	@SuppressWarnings(value={ "rawtypes", "unchecked" })
    public static  List<Fruit> getFruitList(){
        List<Fruit> fruitList=new ArrayList();
        return fruitList;
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static  List<Fruit> getFruit(){
        List<Fruit> fruitList=new ArrayList();
        return fruitList;
    }

    @SuppressWarnings("unused")
    public static void main(String[] args){
        List<String> strList=new ArrayList<String>();
    }

}
