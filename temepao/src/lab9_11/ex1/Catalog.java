package lab9_11.ex1;

import java.util.*;

public class Catalog extends TreeMap<Integer, List<Student>> {

    public Catalog(Comparator<Integer> comparator) {
        super(comparator);
    }

    private int getRoundedMedieKey(float medie) {
        int rounded = Math.round(medie);
        if (medie >= 0 && medie <= 10) {
            return rounded;
        } else {
            throw new IllegalArgumentException("Media trebuie să fie între 0 și 10.");
        }
    }

    public void add(Student student) {
        int key = getRoundedMedieKey(student.getMedie());

        this.putIfAbsent(key, new ArrayList<>());
        this.get(key).add(student);
    }
}

