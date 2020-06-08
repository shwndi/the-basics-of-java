package dataStructure;

import java.util.Collections;
import java.util.Stack;

/**
 * 栈的实现
 */
public class StackTest {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackTest(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        stackArray[++top] = j;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
    public void printStack(){
        while (!this.isEmpty()) {
            long value = this.pop();
            System.out.print(value);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        StackTest theStack = new StackTest(10);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        System.out.println(theStack.peek());
        theStack.printStack();
        //System.out.println(theStack.peek());
        System.out.println("");
        String in = "abcdefg";
        String out;
        StackabcTocba stackabcTocba = new StackabcTocba(in);
        out = stackabcTocba.doRev();
        System.out.println(out);
    }
}
