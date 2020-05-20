package composite;

// 组子类
public class Group extends OrganizationComponent {

    public Group(String name, String des) {
        this.name = name;
        this.des = des;
    }
    @Override
    protected void display() {
        System.out.println(this.getName());
    }
}
