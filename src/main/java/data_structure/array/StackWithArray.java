package data_structure.array;


/**
 * Implementing stack with Array
 */
public class StackWithArray {

    private int[] stack = new int[5];
    private int current = 0;

    public void push(int data) {
        if (current == stack.length) {
            stack = reSize(stack.length);
        }
        stack[current++] = data;
        System.out.println("Pushed " + data);
        print();
    }

    public int pop() {
        int value = stack[--current];
        System.out.println("Poped " + value);
        stack[current] = 0;
        print();
        return value;
    }

    public void print() {
        for (int data : stack) {
            System.out.println(data + " | ");
        }
    }

    private int[] reSize(int currentLength) {
        int[] copyArray = new int[currentLength * 2];
        for (int i = 0; i < stack.length; i++) {
            copyArray[i] = stack[i];
        }
        System.out.println("Resized");
        return copyArray;
    }

    public static void main(String[] args) {
        StackWithArray stack = new StackWithArray();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.pop();
        stack.push(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

    }
}
