package composite;

import lombok.Getter;
import lombok.Setter;

// 抽象组织类
@Getter
@Setter
public abstract class OrganizationComponent {
    public String name;
    public String des;

    // 不用abstract 是因为不是所有子类均有add 方法
    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    protected abstract void display();
}
