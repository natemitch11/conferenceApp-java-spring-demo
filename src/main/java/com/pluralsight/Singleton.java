package com.pluralsight;

public class Singleton {
    /*//Step 1: Private Constructor
    private Singleton(){};
    //Step 2: private static class variable of itself
    private static Singleton singleton;
    //Step 3: public static method to return the variable
    public static Singleton getSingleton(){
        //SMALL CHANCE FOR CONCURRENT REQUESTS MAKING MULTIPLE SINGLETON'S
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }*/

    //INSTEAD, DO THIS

    //Step 1: Private Constructor
    private Singleton(){}
    //Step 2: private static class variable of itself
    private static Singleton singleton = new Singleton();
    //Step 3: public static method to return the variable
    public static Singleton getSingleton(){
        return singleton;
    }
}
