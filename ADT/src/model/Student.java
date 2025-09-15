package model;
import java.time.LocalDate;

public class Student {
    String name;
    LocalDate dob;

    public Student(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName(){
        return name;
    }

    public LocalDate getdob() {
        return dob;
    }
}
