package Structural.Facade;

public class Main {
    public static void main(String[] args){
        HomeTheaterFacade homeTheater = new HomeTheaterFacade( new DVDPlayer(), new Projector(), new Remote());
        homeTheater.watchMovie();
        homeTheater.endMovie();
    }
}
