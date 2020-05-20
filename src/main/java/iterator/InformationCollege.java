package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InformationCollege implements ICollege {
    List<Department> departmentList =  new ArrayList<>();

    public InformationCollege() {
        this.addDepartment(" 信息安全专业 ", " 信息安全专业 ");
        this.addDepartment(" 网络安全专业 ", " 网络安全专业 ");
        this.addDepartment(" 数据安全专业 ", " 数据安全专业 ");
    }

    @Override
    public String getName() {
        return " 信息学院 ";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departmentList.add(new Department(name, desc));
    }

    @Override
    public Iterator createIterator() {
        return new InformationCollegeIterator(departmentList);
    }
}
