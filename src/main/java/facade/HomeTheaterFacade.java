package facade;

public class HomeTheaterFacade {
    private TheaterLight theaterLight = TheaterLight.getInstance();
    private Popcorn popcorn = Popcorn.getInstance();
    private Stereo stereo = Stereo.getInstance();
    private Projector projector = Projector.getInstance();
    private Screen screen = Screen.getInstance();
    private DVDPlayer dvdPlayer = DVDPlayer.getInstance();

    public HomeTheaterFacade() {
    }

    public void ready() {
        this.popcorn.on();
        this.popcorn.pop();
        this.screen.down();
        this.projector.on();
        this.stereo.on();
        this.dvdPlayer.on();
        this.theaterLight.dim();
    }

    public void play() {
        this.dvdPlayer.play();
    }

    public void pause() {
        this.dvdPlayer.pause();
    }

    public void end() {
        this.popcorn.off();
        this.theaterLight.bight();
        this.screen.up();
        this.projector.off();
        this.stereo.off();
        this.dvdPlayer.off();
    }
}
