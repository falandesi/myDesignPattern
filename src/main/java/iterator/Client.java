package iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<ICollege> collegeList = new ArrayList<>();

        collegeList.add(new ComputerCollege());
        collegeList.add(new InformationCollege());

        OutputImpl output = new OutputImpl(collegeList);
        output.displayCollege();
    }
}
