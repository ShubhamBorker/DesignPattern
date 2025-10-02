package org.example.Creational.Abstract;

public class Main {
    public static void main(String[] args){
        CarFactory suvFactory = new SUVFactory();
        CarAssemblyLine suvline = new CarAssemblyLine(suvFactory);
        suvline.buildCar();

        CarFactory sedanFactory = new SedanFactory();
        CarAssemblyLine sedanline = new CarAssemblyLine(sedanFactory);
        sedanline.buildCar();
    }
}
