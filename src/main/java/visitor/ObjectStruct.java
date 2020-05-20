package visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStruct {
    private List<Person> personList = new LinkedList<>();

    public void attach(Person person) {
        personList.add(person);
    }

    public void detach(Person person) {
        personList.remove(person);
    }

    public void display(Action action) {
        for (int i = 0; i < personList.size(); i++) {
            personList.get(i).accept(action);
        }
    }
}
