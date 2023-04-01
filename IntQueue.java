import java.util.ArrayList;
// This line imports the ArrayList class from the java.util package which provides an implementation of dynamic arrays in Java.
// without this, we would not be able to use ArrayList the way we want to! 
// we could have also wrote java.util.*, which imports every package from java.util.

public class IntQueue{
	ArrayList <Integer> list;
  //This line declares an instance variable named list of type ArrayList<Integer> which represents will be used to represent the queue.

	public IntQueue(){
		list = new ArrayList <>();
      // This line creates a constructor for the IntQueue class which creates a new ArrayList object to represent the queue.
      // This is what a constructor does:
      // A constructor is a special method in a Java class that is used to create and initialize objects of that class. 
      // When an object of a class is created using the new keyword, the constructor of that class is called automatically 
      // to initialize the object with default values or the values provided by the programmer.
		}
    
	public int getSize(){
		return list.size();
     //This line defines a method named getSize() which returns the number of elements in the queue. 
		}
    
	public boolean isEmpty(){
		return list.isEmpty();
     // This line defines a method named isEmpty() which checks if the queue is empty or not.
     // The isEmpty() method uses the isEmpty() method of the ArrayList class, 
     // which returns true if the list contains no elements, and false otherwise. 

	}
  
	public void enqueue(int element){
		 list.add(element);
      // This line defines a method named enqueue() which adds an element to the end of the queue.
		}
    
	public int dequeue(){
		return list.remove(0);
     //This line defines a method named dequeue() which removes and returns the first element in the queue.
		}
    
	public int peek(){
		return list.get(0);
     //This line defines a method named peek() which returns the first element in the queue without removing it.
		}
    
	public String toString(){
		return list.toString();
      //This line defines a method named toString() which returns a string representation of the queue.
      //For example, if the list object contains the elements [1, 2, 3], then calling toString() on the 
      // IntQueue object would return the String representation "[1, 2, 3]", but without the quotes! 
		}
    
	public boolean equals(Object o){
		if (o instanceof IntQueue){
			IntQueue other = (IntQueue) o;
			return list.equals(other.list);
			}
			else{
				return false;
        }
		}
    //This line defines a method named equals() which checks if two IntQueue objects are equal or not. 
    // It first checks if the object being passed as argument is an instance of IntQueue. If it is, 
    // then it casts it to an IntQueue object and compares the list variable of both objects. If the 
    // objects are not equal or the argument is not an instance of IntQueue, it returns false.
	}
