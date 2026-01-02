package baitap81;

public class MyIntStack {

    private int[] contents;
    private int tos;   // top of stack

    // Constructor
    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    // Push an element onto stack
    public void push(int element) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        contents[++tos] = element;
    }

    // Pop the top element
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return contents[tos--];
    }

    // Peek the top element
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return contents[tos];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return tos < 0;
    }

    // Check if stack is full
    public boolean isFull() {
        return tos == contents.length - 1;
    }
}
