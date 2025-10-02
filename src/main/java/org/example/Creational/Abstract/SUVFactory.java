package org.example.Creational.Abstract;

class SUVFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new SUVEngine();
    }

    @Override
    public Interior createInterior() {
        return new SUVInterrior();
    }
}
