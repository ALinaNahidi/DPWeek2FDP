package com.FactoryMethodPattern;

public class FactoryMain {

    public static void main(String[] args) {
//	   OS os = new Windows();
//       os.specification();

        OperationgSystemFactory osf = new OperationgSystemFactory();
        OS object = osf.getInstance("windows");
        object.specification();
    }
}
