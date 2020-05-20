package mediator;

public class Alarm extends Colleague {
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    public void SendAlarm(int stateChange) {
        this.SendMessage(stateChange);
    }

    public void SendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange, this.name);
    }
}
