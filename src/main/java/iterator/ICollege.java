package iterator;

import java.util.Iterator;

public interface ICollege {
    String getName();
    void addDepartment(String name, String desc);

    Iterator createIterator();
}
