package mediator;

public class Curtains extends Colleague {
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    public void SendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange, this.name);
    }

    public void UpCurtains() {
        System.out.println("I am holding Up Curtains!");
    }
}
