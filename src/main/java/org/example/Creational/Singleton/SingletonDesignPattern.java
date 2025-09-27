package org.example.Creational.Singleton;

public class SingletonDesignPattern {

    private SingletonDesignPattern(){

    }
    private static SingletonDesignPattern singleton;
    //lazyIntialization
    public static SingletonDesignPattern getSingleton(){
        //dobleCheck
        if(singleton== null){
            synchronized (SingletonDesignPattern.class) {
                if (singleton == null)
                    singleton = new SingletonDesignPattern();
            }
        }
        return singleton;
    }
}
