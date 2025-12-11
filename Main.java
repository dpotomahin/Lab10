import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Institute institute = new Institute("Kyiv Polytechnic Institute");

        Faculty f1 = new Faculty("FICT");
        f1.addStudent(new Student("Ivan", "Ivanov", "KB-12345", 96.5));
        f1.addStudent(new Student("Petr", "Petrov", "KB-12346", 88.0));
        f1.addStudent(new Student("Sid", "Sidorov", "KB-12347", 99.0));

        Faculty f2 = new Faculty("IASA");
        f2.addStudent(new Student("Anna", "Koval", "IA-54321", 95.0));
        f2.addStudent(new Student("Maria", "Melnyk", "IA-54322", 91.5));

        Faculty f3 = new Faculty("TEF");
        f3.addStudent(new Student("Oleg", "Bondar", "TE-11111", 75.0));

        institute.addFaculty(f1);
        institute.addFaculty(f2);
        institute.addFaculty(f3);

        int totalStudents = 0;
        for (Faculty faculty : institute.getFaculties()) {
            totalStudents += faculty.getStudents().size();
        }
        System.out.println("Total students: " + totalStudents);

        Faculty maxFaculty = null;
        int maxCount = -1;
        Iterator facultyIteratorUntyped = institute.getFaculties().iterator();
        while (facultyIteratorUntyped.hasNext()) {
            Faculty faculty = (Faculty) facultyIteratorUntyped.next();
            int currentSize = faculty.getStudents().size();
            if (currentSize > maxCount) {
                maxCount = currentSize;
                maxFaculty = faculty;
            }
        }
        System.out.println("Faculty with most students: " + maxFaculty);

        List<Student> excellentStudents = new ArrayList<>();
        Iterator<Faculty> facultyIteratorTyped = institute.getFaculties().iterator();
        while (facultyIteratorTyped.hasNext()) {
            Faculty faculty = facultyIteratorTyped.next();
            Iterator<Student> studentIterator = faculty.getStudents().iterator();
            while (studentIterator.hasNext()) {
                Student student = studentIterator.next();
                if (student.getAverageGrade() >= 95 && student.getAverageGrade() <= 100) {
                    excellentStudents.add(student);
                }
            }
        }

        System.out.println("Excellent students (95-100):");
        for (Student s : excellentStudents) {
            System.out.println(s);
        }
    }
}
