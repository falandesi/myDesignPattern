package composite;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

// 公司子类
@Getter
@Setter
public class Company extends OrganizationComponent {

    private List<OrganizationComponent> organizationComponentList = new ArrayList<>();   //团队列表

    public Company(String name, String des) {
        this.name = name;
        this.des = des;
    }
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    protected void display() {
        System.out.println("=======================" + this.getName() + "=========================");
        for (OrganizationComponent organizationComponent : organizationComponentList) {
            organizationComponent.display();
        }
    }
}
