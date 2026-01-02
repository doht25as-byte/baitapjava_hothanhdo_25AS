package baitap81;

public class TestMyIntstack {

    public static void main(String[] args) {

        MyIntStack stack = new MyIntStack(5);

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // 30

        // Pop elements
        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }
    }
}