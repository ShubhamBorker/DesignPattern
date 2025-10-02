package org.example.Creational.Abstract;

public class SedanFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new SedanEngine();
    }

    @Override
    public Interior createInterior() {
        return new SedanInterior();
    }
}
