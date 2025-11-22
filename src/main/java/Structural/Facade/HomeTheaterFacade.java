package Structural.Facade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Remote remote;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, Remote remote) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.remote = remote;
    }

    public void watchMovie() {
        System.out.println("Getting ready to watch a movie...");
        remote.on();
        projector.on();
        dvdPlayer.on();
        System.out.println("Movie is now playing!");
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.off();
        projector.off();
        remote.off();
        System.out.println("Home theater is now off.");
    }
}
