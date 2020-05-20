package responsinilitychain;

public class ViceSchoolMasterApprover extends Approver {
    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 10000F && purchaseRequest.getPrice() <= 30000F) {
            System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
