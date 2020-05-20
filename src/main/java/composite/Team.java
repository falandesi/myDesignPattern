package composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

// 团队子类
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Team extends OrganizationComponent {
    private List<OrganizationComponent> organizationComponentList = new ArrayList<>();   //组列表

    public Team(String name, String des) {
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
