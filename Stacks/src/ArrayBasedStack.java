
public class ArrayBasedStack<E> implements StackADT<E> {

    private final int max_cap = 50;
    private int top; 
    private Object[] arr;

    public ArrayBasedStack() {
        this.top = -1; // indicating the stack is empty
        this.arr = new Object[max_cap];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public E peek() {
        if(isEmpty()){
            throw new StackException("stack is empty");
        }
        return (E)arr[this.top];
    }

    public void push(E item) {
        if(top == max_cap - 1) {
            throw new StackException("Can't push item on stack");
        }
        this.top++;
        arr[this.top] = item;
    }

    public E pop() {
        if(isEmpty()) {
            throw new StackException("Can't pop item, because the stack is empty");
        }
        
        E currentTop = (E)arr[this.top];
        this.top--;
        return currentTop;
    }

    public void popAll() {
        this.top = -1;
        arr = new Object[max_cap];
    }
    
    @Override
    public String toString() {
        String s = "[";
        for(int i = top; i > 0 ; i--) {
            s += arr[i] + ", ";
        }
        s += arr[0] + "]";
        return s;
    }
    
}
