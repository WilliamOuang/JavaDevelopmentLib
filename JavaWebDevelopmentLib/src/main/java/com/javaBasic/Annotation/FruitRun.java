package com.javaBasic.Annotation;

class AppleService {
    public void displayName(){
        System.out.println("水果的名字是：苹果");
    }
    
    /**
     * @deprecated 该方法已经过期，不推荐使用
     */
    @Deprecated
    public void showTaste(){
        System.out.println("水果的苹果的口感是：脆甜");
    }
    
    public void showTaste(int typeId){
        if(typeId==1){
            System.out.println("水果的苹果的口感是：酸涩");
        }
        else if(typeId==2){
            System.out.println("水果的苹果的口感是：绵甜");
        }
        else{
            System.out.println("水果的苹果的口感是：脆甜");
        }
    }
}

public class FruitRun {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Apple apple=new Apple();
        apple.displayname();    
        
        AppleService appleService=new AppleService();
        appleService.showTaste();
        appleService.showTaste(0);
        appleService.showTaste(2);
    }

}
