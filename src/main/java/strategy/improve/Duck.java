package strategy.improve;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Duck {
    EatBehavior eatBehavior;
    public abstract void display();

    public void CanEat() {
        if(null != eatBehavior) {
            eatBehavior.canEat();
        }
    }
}
