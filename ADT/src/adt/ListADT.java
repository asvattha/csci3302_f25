package adt;

import exceptions.MyException;

public interface ListADT<E> {
    E get(int index) throws MyException;
    void add(E data) throws MyException;
    void add(int index, E data) throws MyException;
    E remove(int index) throws MyException;
    void removeAll();
    int size();
    boolean isEmpty();
}