package facade;

public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        System.out.println(" homeTheaterFacade ready ");
        homeTheaterFacade.ready();
        System.out.println(" homeTheaterFacade pause ");
        homeTheaterFacade.pause();
        System.out.println(" homeTheaterFacade end ");
        homeTheaterFacade.end();
    }
}
