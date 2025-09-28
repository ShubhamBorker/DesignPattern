package org.example.Creational.Singleton;

public class Main {
     public static void main(String[] args) {
         //lazyIntialization
         SingletonDesignPattern s1 = SingletonDesignPattern.getSingleton();
         SingletonDesignPattern s2 = SingletonDesignPattern.getSingleton();
         System.out.println("s1 hascode is " + s1.hashCode());
         System.out.println("s2 hascode is " +s2.hashCode());

         //earlyIntialization
         SingletonEarlyInztn s3 = SingletonEarlyInztn.getSingletonErly();
         SingletonEarlyInztn s4 = SingletonEarlyInztn.getSingletonErly();
         System.out.println("s3 hascode is " + s3.hashCode());
         System.out.println("s4 hascode is "+ s4.hashCode());

    }
}
