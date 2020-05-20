package iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {
    Department[] departments;
    int position = 0;
    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }
    @Override
    public boolean hasNext() {
        return position < this.departments.length && null != this.departments[position];
    }

    @Override
    public Object next() {
        return this.departments[position++];
    }

    @Override
    public void remove() {

    }
}
