package mediator;

public abstract class Mediator {
    public abstract void Register(String var1, Colleague var2);

    public abstract void GetMessage(int var1, String var2);

    public abstract void SendMessage();
}
