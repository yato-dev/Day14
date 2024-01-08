package DS.BalancedParenthesis;
class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    Stack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

     
    public void push(char c) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
        } else {
            stackArray[++top] = c;
        }
    }
    public char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return '\0';
        } else {
            return stackArray[top--];
        }
    }
  
    public char peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return '\0';
        } else {
            return stackArray[top];
        }
    }
 
    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }
}
