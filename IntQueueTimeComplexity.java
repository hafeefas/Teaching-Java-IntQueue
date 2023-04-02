
import java.util.ArrayList;

public class IntQueue{
	ArrayList <Integer> list;
	
	public IntQueue(){
		list = new ArrayList <>();
    // Time complexity: O(1)
    // Reason: The constructor simply initializes the ArrayList object, which has a constant time complexity of O(1).
		}
    
	public int getSize(){
		return list.size();
    // Time Complexity: O(1)
    // Reason: The size method of the ArrayList returns the number of elements in the list in constant time, which has a time complexity of O(1).
		}
    
	public boolean isEmpty(){
		return list.isEmpty();
    // Time complexity: O(1)
    // Reason:  The isEmpty method of the ArrayList checks if the list contains no elements or not, which can be done in constant time, 
    // which is why this has a time complexity of O(1).
	}
  
	public void enqueue(int element){
		 list.add(element);
    // Time Complexity: O(1)
    // Reason: The add method of the ArrayList adds an element to the end of the list, which takes constant time as the ArrayList uses an
    // array to store elements and has a constant time complexity for adding an element at the end of the list.
		}
    
	public int dequeue(){
		return list.remove(0);
    // Time Complexity: O(n)
    // Reason: The remove method of the ArrayList removes an element from the beginning of the list, which takes linear time, 
    // as all the elements in the list after the removed element must be shifted by one position to fill the gap left by the removed element. 
    // As such, the time complexity of the dequeue method is O(n).
		}
    
	public int peek(){
		return list.get(0);
    // Time Complexity: O(1)
    // Reason: The get method of the ArrayList returns the first element of the list in constant time, which has a time complexity of O(1).
		}
    
	public String toString(){
		return list.toString();
    // Time Complexity: O(n)
    // Reason:  The toString method of the ArrayList converts each element in the list to a string and concatenates 
    // them together to form a string representation of the list. 
    // This requires iterating through all the elements in the list, which takes linear time, and thus has a time complexity of O(n).
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
  // Time Complexity: O(n)
  // Reason: The equals method of the ArrayList iterates through both ArrayLists and compares each element to 
  // determine if they are equal or not. This requires iterating through all the elements in both lists, which takes linear time, 
  // and thus has a time complexity of O(n).
	}
