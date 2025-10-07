package org.example.Creational.Builder;

public class Client {
    public static void main(String[] args){
        House Villa = new House.Builder("Concrete","Brick","tile")
                .withGarage(true)
                .withGarden(true)
                .withSwimmingPool(true)
                .build();
        System.out.println("Villa = " + Villa);

        House budgetHouse = new House.Builder("Concrete","Wood","Asphalt")
                .withGarden(true)
                .withGarage(true)
                .build();
        System.out.println("Budget House = " + budgetHouse);

    }
}
