package responsinilitychain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Approver {
    public Approver approver;   //下一个处理者
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
