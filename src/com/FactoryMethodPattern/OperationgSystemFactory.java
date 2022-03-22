package com.FactoryMethodPattern;

public class OperationgSystemFactory {

    public OS getInstance(String type){

        if (type.equalsIgnoreCase("windows")){
            return  new Windows();
        }
        else if (type.equalsIgnoreCase("IOS")){
            return new IOS();
        }
        else{
            return new Android();
        }
    }
}
