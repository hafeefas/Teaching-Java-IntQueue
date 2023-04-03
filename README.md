# Teaching-Java-IntQueue
This is a simple class teaching IntQueue, which stores ints in FIFO (First In First Out) fashion. It can be seen that LinkedList is best to use in this situation because we only need access to the front and end of the list. A linkedlist works great with accessing the first and last element (which is known as the head and tail of a linkedlist), as it only takes O(1) time. This takes longer time with arraylists because when changing the first element, the worst case is O(n) due to the elements having to shift to the right. 

To summarize:
- If the IntQueue implementation uses an ArrayList, enqueue and dequeue operations may take O(n) time in the worst case, because elements may need to be shifted in the underlying array to maintain the order of the queue.
- If the IntQueue implementation uses a LinkedList, enqueue and dequeue operations take constant time (O(1)), because elements can be added to and removed from the beginning or end of the linked list with only a few pointer updates.
- If the primary usage pattern of the IntQueue involves frequent enqueue and dequeue operations, a LinkedList implementation may provide better performance than an ArrayList implementation.
- If the primary usage pattern of the IntQueue involves frequent random access to elements by index, an ArrayList implementation may be more suitable than a LinkedList implementation.
- Both ArrayList and LinkedList implementations provide constant-time access to the size of the IntQueue using the size() method.
- If the IntQueue implementation uses an ArrayList, changing the first element may take O(n) time in the worst case, because all elements to the right of the modified element may need to be shifted in the underlying array.
- If the IntQueue implementation uses a LinkedList, changing the first element takes constant time (O(1)), because it only involves updating the reference to the first node in the linked list.
