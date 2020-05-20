package memento.game;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        CareTaker careTaker = new CareTaker();
        gameRole.setAtk(1000);
        gameRole.setDef(800);
        System.out.println(" 大战前角色的属性 ");
        gameRole.display();
        careTaker.setMemento(gameRole.saveMemento());
        System.out.println(" 大战后角色的属性" );
        gameRole.setAtk(700);
        gameRole.setDef(700);
        gameRole.display();
        System.out.println(" 采用备忘录模式恢复角色属性... ");
        gameRole.recoverStateFromMemento(careTaker.getMemento());
        System.out.println(" 恢复后角色的属性 ");
        gameRole.display();
    }
}
