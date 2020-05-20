package iterator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class OutputImpl {
    List<ICollege> collegeList;

    public void displayCollege() {
        Iterator iterator = collegeList.iterator();
        while (iterator.hasNext()) {
            ICollege college = (ICollege) iterator.next();
            System.out.println("=================="+ college.getName() +"=================");
            this.displayDepartment(college.createIterator());
        }
    }

    public void displayDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
