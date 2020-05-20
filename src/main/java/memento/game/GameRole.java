package memento.game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameRole {
    private int atk;
    private int def;

    public Memento saveMemento() {
        return new Memento(atk, def);
    }

    public void recoverStateFromMemento(Memento memento) {
        atk = memento.getAtk();
        def = memento.getDef();
    }

    public void display() {
        System.out.println(" 角色当前属性 atk为：" + atk + " 防御力为：" + def);
    }
}
