package responsinilitychain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PurchaseRequest {
    private int type = 0;
    private float price = 0.0F;
    private int id = 0;
}
