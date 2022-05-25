package DSAStackQueue11;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element){                          //Cài đặt phương thức push()
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception {                     //Cài đặt phương thức pop()
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    public int size() {                                     //Cài đặt phương thức size()
        return index;
    }

    public boolean isEmpty() {                              //Cài đặt phương thức isEmpty
        if (index == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {                               //Cài đặt phương thức isFull()
        if (index == size) {
            return true;
        }
        return false;
    }

}
