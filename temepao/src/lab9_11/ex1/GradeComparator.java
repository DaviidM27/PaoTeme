package lab9_11.ex1;

import java.util.Comparator;

public class GradeComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}

