import java.util.NoSuchElementException;

public class IntQueue {
    private Node head; // the first node in the queue
    private Node tail; // the last node in the queue
    private int size;  // the number of elements in the queue
    
    // Define a private inner class for the nodes in the queue
    private class Node {
        int value; // the integer value stored in the node
        Node next; // a reference to the next node in the queue
        
        // Constructor for creating a new node with the given value
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    
    // Constructor for creating an empty queue
    public IntQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    // Method for adding a new element to the back of the queue
    // Time complexity: O(1)
    public void enqueue(int value) {
        Node newNode = new Node(value); // create a new node with the given value
        if (tail == null) {
            // if the queue is empty, set both head and tail to the new node
            head = newNode;
            tail = newNode;
        } else {
            // otherwise, add the new node to the end of the queue
            tail.next = newNode;
            tail = newNode;
        }
        size++; // increment the size of the queue
    }
    
    // Method for removing and returning the front element of the queue
    // Time complexity: O(1)
    public int dequeue() {
        if (head == null) {
            // if the queue is empty, throw an exception because if the head is null that means the list is empty
            throw new NoSuchElementException("Queue is empty");
        }
        int value = head.value; // store the value of the first node
        head = head.next; // set the head to the next node
        if (head == null) {
            // if the queue is now empty, set tail to null as well
            tail = null;
        }
      
        size--; // decrement the size of the queue
        return value; // return the stored value
    }
    
    // Method for returning the front element of the queue without removing it
    // Time complexity: O(1)
    public int peek() {
        if (head == null) {
            // if the queue is empty, throw an exception because without a head, the list is empty
            throw new NoSuchElementException("Queue is empty");
        }
        return head.value; // return the value of the first node
    }
    
    // Method for checking if the queue is empty
    // Time complexity: O(1)
    public boolean isEmpty() {
        return head == null;
    }
    
    // Method for returning the number of elements in the queue
    // Time complexity: O(1)
    public int getSize() {
        return size;
    }
    
    // Method for returning a string representation of the queue
    // Time complexity: O(n)
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node curr = head;
        while (curr != null) {
            sb.append(curr.value);
            if (curr.next != null) {
                sb.append(", ");
            }
            curr = curr.next;
        }
        sb.append("]");
        return sb.toString();
    }
    //if a an equals method was added, it would take O(n) time, the same as ArrayList.
}
