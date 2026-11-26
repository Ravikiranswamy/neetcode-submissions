
class MyCircularQueue {

    // Node represents one element in the linked list
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // References to the first and last nodes
    Node front;
    Node rear;

    // Track the current number of elements and maximum capacity
    int size;
    int capacity;

    // Constructor: initialize the queue
    public MyCircularQueue(int k) {
        capacity = k;
        size = 0;

        front = null;
        rear = null;
    }

    // Insert an element into the queue
    public boolean enQueue(int value) {

        // Cannot insert if the queue is already full
        if (isFull()) {
            return false;
        }

        // Create a new node
        Node newNode = new Node(value);

        // If queue is empty, both front and rear point to new node
        if (isEmpty()) {
            front = newNode;
            rear = newNode;

            // Since this is a circular linked list,
            // the rear points back to the front
            rear.next = front;
        }

        else {

            // Connect the current rear to the new node
            rear.next = newNode;

            // Move rear to the newly inserted node
            rear = newNode;

            // Maintain circular connection
            rear.next = front;
        }

        // Increase the number of elements
        size++;

        return true;
    }

    // Delete the front element from the queue
    public boolean deQueue() {

        // Cannot delete if queue is empty
        if (isEmpty()) {
            return false;
        }

        // If only one element exists
        if (front == rear) {

            // Both references become null
            front = null;
            rear = null;
        }

        else {

            // Move front to the next node
            front = front.next;

            // Maintain circular connection
            rear.next = front;
        }

        // Decrease the number of elements
        size--;

        return true;
    }

    // Return the front element
    public int Front() {

        // If queue is empty, return -1
        if (isEmpty()) {
            return -1;
        }

        return front.val;
    }

    // Return the rear element
    public int Rear() {

        // If queue is empty, return -1
        if (isEmpty()) {
            return -1;
        }

        return rear.val;
    }

    // Check whether the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check whether the queue is full
    public boolean isFull() {
        return size == capacity;
    }
}
