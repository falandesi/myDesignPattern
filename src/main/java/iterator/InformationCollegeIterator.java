package iterator;

import java.util.Iterator;
import java.util.List;

public class InformationCollegeIterator implements Iterator {
    List<Department> departmentList;
    int index = -1;

    public InformationCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }
    @Override
    public boolean hasNext() {
        if (this.index >= this.departmentList.size() - 1) {
            return false;
        } else {
            ++this.index;
            return true;
        }
    }

    @Override
    public Object next() {
        return this.departmentList.get(this.index);
    }

    @Override
    public void remove() {

    }
}
