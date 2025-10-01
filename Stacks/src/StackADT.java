public interface StackADT<E> {

    public boolean isEmpty();
    public void push(E item) throws StackException;
    public E pop() throws StackException;
    public E peek() throws StackException;
    public void popAll();
    
}
