package composite;

public class Client {
    public static void main(String[] args) {
        // 实例化公司
        OrganizationComponent company = new Company("CMB", "Bank");

        // 实例化团队
        OrganizationComponent teamSecurity = new Team("网络安全团队", "Security");
        OrganizationComponent teamCloudPlatform = new Team("云平台团队", "Platform");

        // 实例化组
        teamSecurity.add(new Group("微服务研发组", "micro service"));
        teamSecurity.add(new Group("零售收单反欺诈组", "Fraud"));
        teamSecurity.add(new Group("伪冒案件反欺诈组", "RPRM"));
        teamCloudPlatform.add(new Group("云平台开发一组", "一组"));
        teamCloudPlatform.add(new Group("云平台开发二组", "二组"));

        company.add(teamSecurity);
        company.add(teamCloudPlatform);

        //打印整个公司
        company.display();

        //打印一个团队
        teamSecurity.display();

    }
}
