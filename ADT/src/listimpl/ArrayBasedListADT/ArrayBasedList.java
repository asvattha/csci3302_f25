package listimpl.ArrayBasedListADT;

import adt.ListADT;
import exceptions.MyException;
import model.Student;

public class ArrayBasedList implements ListADT<Student>{
    private final int MAX_CAPACITY = 50; 
    private int size;
    Student[] stud;

    // Constructor
    // Pre-condition: None
    // Post-condition: Creates an empty list with size 0 and MAX_CAPACITY
    public ArrayBasedList() {
        size = 0;
        stud = new Student[MAX_CAPACITY];
    }


    // Checks if the list is full
    // Pre-condition: None
    // Post-condition: Returns true if size is at maximum capacity, false otherwise
    public boolean isFull() {
        return size == MAX_CAPACITY;
    }

    // Checks if the list is empty
    // Pre-condition: None
    // Post-condition: Returns true if size is 0, false otherwise
    public boolean isEmpty() {
        return size == 0;
    }

    // Retrieves the student at the given index
    // Pre-condition: 0 <= index < size
    // Post-condition: Returns the student at the given index, or throws MyException if index is invalid
    @Override
    public Student get(int index) throws MyException {
        
        if(index < 0 || index >= size) {
            throw new MyException("index is out of range");
        }
        return stud[index];
    }

    // Adds a student to the end of the list
    //Pre-condition: List is not full
    // Post-condition: Adds the student at the end; size is incremented by 1
    @Override
    public void add(Student data) throws MyException {
        if(isFull()){
            throw new MyException("List is at it's maximum capacity");
        }
        stud[size] = data;
        size++;
    }

    // Inserts a student at the specified index
    // Inserts a student at the specified index
    //  Post-condition: Inserts student at index, shifts elements to the right; size is incremented by 1
    @Override
    public void add(int index, Student data) throws MyException {

        if(isFull()) {
            throw new MyException("List is full");
        }
        
        if(index < 0 || index > size) {
            throw new MyException("index is out of range");
        }
        
    // Shift elements to the right from the end to index
    for (int i = size - 1; i >= index; i--) {
        stud[i + 1] = stud[i];
    }

    // Insert new element at the specified index
    stud[index] = data;
    size++;
    }

    // Removes the student at the specified index
    // Pre-condition: 0 <= index < size, and list is not empty
    // Post-condition: Removes student at index, shifts elements left; size is decremented by 1; returns removed student
    @Override
    public Student remove(int index) throws MyException {
        if(isEmpty()) {
            throw new MyException("List is empty");
        }
        
        if(index < 0 || index >= size) {
            throw new MyException("List is outside allowable range");
        }

        Student student = stud[index];

        for(int i = index; i < size && i != size - 1; i++){
            stud[i] = stud[i + 1];
        }
        stud[size - 1] = null;
        size--;
        return student;
    }

    // Removes all students from the list
    // Pre-condition: None
    // Post-condition: List is cleared, size is set to 0
    @Override
    public void removeAll() {
        size = 0;
        stud = new Student[MAX_CAPACITY];
    }

    // Returns the number of students in the list
    // Pre-condition: None
    // Post-condition: Returns the current size
    @Override
    public int size() {
        return size;
        
    }

    @Override
    public String toString() {
        String msg = "";
        for(int i = 0; i < size; i++) {
            msg += String.format("The student %s is born on %d\n", stud[i].getName(), stud[i].getdob().getYear());
        } 
        return msg;
    }
    
}
