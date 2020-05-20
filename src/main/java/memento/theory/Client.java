package memento.theory;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState(" #状态1 ");
        CareTaker careTaker = new CareTaker();
        careTaker.add(originator.saveMemento());
        originator.setState(" #状态2 ");
        careTaker.add(originator.saveMemento());
        originator.setState(" #状态3 ");
        careTaker.add(originator.saveMemento());
        System.out.println(" 此时状态为：" + originator.getState());
        System.out.println(" 恢复状态为状态1 ");
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println(" 此时状态为：" + originator.getState());

    }
}
