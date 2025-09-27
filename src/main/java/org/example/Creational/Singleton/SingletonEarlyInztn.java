package org.example.Creational.Singleton;

public class SingletonEarlyInztn {

    private SingletonEarlyInztn(){
    }
    private static final SingletonEarlyInztn singleton = new SingletonEarlyInztn();

    //earlyintialization or eager
    public static SingletonEarlyInztn getSingletonErly(){
        return singleton;
    }
}
