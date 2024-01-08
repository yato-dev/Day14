package DS.BankingCash;
class Queue {
    private int front, rear, size;
    private int capacity;
    private int[] array;


    Queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }
    
    boolean isFull() {
        return (this.size == this.capacity);
    }
    
    boolean isEmpty() {
        return (this.size == 0);
    }

    void enqueue(int item) {
        if (isFull()) {  
            System.out.println("Queue is full, cannot add more people.");
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
    }

    int dequeue() {
        if (isEmpty()) {  
            System.out.println("Queue is empty, no people to dequeue.");
            return Integer.MIN_VALUE;
        }
        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    public int getFront() {
        return front;
    }
}

