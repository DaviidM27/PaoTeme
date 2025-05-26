package lab9_11.ex1;

import java.util.*;

public class Main {
     public static void main(String[] args) {
        Catalog catalog = new Catalog(new GradeComparator());

        catalog.add(new Student("Ana", 9.4f));
        catalog.add(new Student("Mihai", 8.1f));
        catalog.add(new Student("George", 7.6f));
        catalog.add(new Student("Elena", 9.7f));
        catalog.add(new Student("Andrei", 8.3f));
        catalog.add(new Student("Ioana", 7.5f));
        catalog.add(new Student("Diana", 6.3f));

        for (Map.Entry<Integer, List<Student>> entry : catalog.entrySet()) {
            List<Student> studenti = entry.getValue();

            studenti.sort(Comparator.comparing(Student::getNume));

            System.out.println("Media rotunjita: " + entry.getKey());
            for (Student s : studenti) {
                System.out.println(" - " + s);
            }
        }
    }

}
