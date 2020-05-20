package decorate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Drink {
    public String des;
    private float price = 0.0f;

    public abstract float cost();
}
