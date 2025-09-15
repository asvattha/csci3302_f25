import java.time.LocalDate;

import listimpl.ArrayBasedListADT.ArrayBasedList;
import model.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Kevin", LocalDate.of(1990, 2, 2));
        Student s2 = new Student("Kyla", LocalDate.of(2000, 12, 12));
        Student s3 = new Student("Alex", LocalDate.of(1898, 9, 2));

        ArrayBasedList myStudentList = new ArrayBasedList();
        myStudentList.add(s1);
        myStudentList.add(s2);
        myStudentList.add(s3);

        myStudentList.remove(1);

        System.out.println(myStudentList);
    }
}
