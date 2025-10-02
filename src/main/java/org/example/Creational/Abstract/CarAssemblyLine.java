package org.example.Creational.Abstract;

public class CarAssemblyLine {
    private  Engine engine;
    private Interior interior;

    public CarAssemblyLine(CarFactory factory){
        engine= factory.createEngine();
        interior = factory.createInterior();
    }

    public void buildCar(){
        engine.assemble();
        interior.design();
        System.out.println("Car assembly complete.\n");
    }
}
