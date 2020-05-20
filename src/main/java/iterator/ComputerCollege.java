package iterator;

import java.util.Iterator;

public class ComputerCollege implements ICollege {
    Department[] departments = new Department[5];
    int numDepartments = 0;

    public ComputerCollege() {
        this.addDepartment(" Java专业 ", " Java专业 ");
        this.addDepartment(" C++专业 ", " C++专业 ");
        this.addDepartment(" 大数据专业 ", " 大数据专业 ");
    }
    @Override
    public String getName() {
        return " 计算机学院 ";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numDepartments] = department;
        numDepartments++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
