package responsinilitychain;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 9999, 100);

        Approver departmentApprover = new DepartmentApprover("王主任");
        Approver collegeApprover = new CollegeApprover("李院长");
        Approver viceSchoolMasterApprover = new ViceSchoolMasterApprover("刘副校");
        Approver schoolMasterApprover = new SchoolMasterApprover("金校长");

        // 构建职责链
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        viceSchoolMasterApprover.processRequest(purchaseRequest);


    }
}

