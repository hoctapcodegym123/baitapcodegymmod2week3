package DSAStackQueue11;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {                    //tạo lớp MygenericStack
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<T>();
    }

    public void push(T element) {                   //Phương thức push
        stack.addFirst(element);
    }

    public T pop() {                                //Phương thức pop
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {                             //Phương thức size
        return stack.size();
    }

    public boolean isEmpty() {                      //Phương thức isEmpty
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
