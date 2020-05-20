package mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 同事类
@Getter
@Setter
@AllArgsConstructor
public abstract class Colleague {
    private Mediator mediator;
    public String name;


    public abstract void SendMessage(int var1);
}
