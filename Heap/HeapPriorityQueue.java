public class HeapPriorityQueue<K extends Comparable,V> implements PriorityQueue<K ,V> {
    
    private Entry[] storage; //The Heap itself in array form
    private int tail;        //Index of last element in the heap
    
    /**
    * Default constructor
    */
    public HeapPriorityQueue(){
    }
    
    /**
    * HeapPriorityQueue constructor with max storage of size elements
    */
    public HeapPriorityQueue(int size){
        this.storage = new Entry[size];
        this.tail = 0;
    }
    
    /**
    * Returns the number of items in the priority queue.
    * O(1)
    * @return number of items
    */
    public int size(){
        return this.tail;
    }

    /**
    * Tests whether the priority queue is empty.
    * O(1)
    * @return true if the priority queue is empty, false otherwise
    */
    public boolean isEmpty(){
        return tail == 0;
    }
    
    /**
    * Inserts a key-value pair and returns the entry created.
    * O(log(n))
    * @param key     the key of the new entry
    * @param value   the associated value of the new entry
    * @return the entry storing the new key-value pair
    * @throws IllegalArgumentException if the heap is full
    */
    public Entry<K,V> insert(K key, V value) throws IllegalArgumentException{
        
        // Checking to see if there is space in the array, throw exception if NO SPACE!
        if(storage.length == size()){
            throw new IllegalArgumentException("The heap is full");
        }

        // make the insertion into the heap
        Entry<K,V> newEntry =  new Entry<>(key, value);

        // place it right next to the tail of the heap
        storage[tail] = newEntry;
        
        // increment the tail since we added a new element
        tail++;

        // up heap until the characteristic of the heap satisfies i.e(with recursion)
        upHeap(tail - 1);

        return newEntry;
    }
    
    /**
    * Returns (but does not remove) an entry with minimal key.
    * O(1)
    * @return entry having a minimal key (or null if empty)
    */
    public Entry<K,V> min(){
        if(isEmpty()){
            return null;
        }

        // simply returns the first element of the heap since it should be the smallest
        return storage[0];
    } 
    
    /**
    * Removes and returns an entry with minimal key.
    * O(log(n))
    * @return the removed entry (or null if empty)
    */ 
    public Entry<K,V> removeMin(){
        if(isEmpty()){
            return null;
        }

        // store entry in a temporary variable
        Entry<K,V> minimumEntry = min();

        // swap it with the tail
        swap(0, tail - 1);

        // delete it
        tail--;

        // down heap from the root to satisfy the conditions for the heap
        downHeap(0);

        // return the deleted element
        return minimumEntry;
    }  
    
    
    /**
    * Algorithm to place element after insertion at the tail.
    * O(log(n))
    */
    private void upHeap(int location){
        // base case for when we reach the root node
        if(location == 0){
            return;
        }

        // the parent index of the current location
        int parent = parent(location);

        // checks to see if the parent is larger
        if(storage[parent].getKey().compareTo(storage[location].getKey()) > 0){
            swap(parent, location);
            
            // recursively call the 
            upHeap(parent);
        }
    }
    
    /**
    * Algorithm to place element after removal of root and tail element placed at root.
    * O(log(n))
    */
    private void downHeap(int location){
        // Personal Notes:
        // find the smaller child
        // swap
        // recursion 

        // Child Indexes
        int rightChild = rightChild(location);
		int leftChild = leftChild(location);
		
		// base case when the location is at the lowest point and its children are dummy nodes
		if(!validIndex(leftChild) && !validIndex(rightChild)){
			return;
		}
		
		// case 1: Only left child
		if(!validIndex(rightChild)){
			if(storage[leftChild].getKey().compareTo(storage[location].getKey()) < 0){
				swap(leftChild, location);
				downHeap(leftChild);
			}
		}
		
		// case 2: Only right child
		else if(!validIndex(leftChild)){
			if(storage[rightChild].getKey().compareTo(storage[location].getKey()) < 0){
				swap(rightChild, location);
				downHeap(rightChild);
			}
		}

		// case 3: Both

        // Case 3.1: Left child is smaller than right
		else if(storage[leftChild].getKey().compareTo(storage[rightChild].getKey()) < 0){
			if(storage[leftChild].getKey().compareTo(storage[location].getKey()) < 0){
				swap(leftChild, location);
				downHeap(leftChild);
			}
		}

        // Case 3.2: Right child is smaller than left
        else{
            if(storage[rightChild].getKey().compareTo(storage[location].getKey()) < 0){
				swap(rightChild, location);
				downHeap(rightChild);
			}
        }
    }
    
    /**
    * Find parent of a given location,Can
    * Parent of the root is the root
    * O(1)
    */
    private int parent(int location){

        // formula from the lecture slides
        return ((location - 1) / 2);
    }

    /**
     * 
     * @param location Current node
     * @return The index of the left child of the current heap node
     */
    private int leftChild(int location){

        // formula from the lecture slides
        return (2 * location) + 1;
    }

    /**
     * @param location Current node
     * @return The index of the right child of the current heap node
     */
    private int rightChild(int location){

        // formula from the lecture slides
        return (2 * location) + 2;
    }
	
    /**
     * @param index 
     * @return Checks to see if the index is valid and within the range of the heap
     */
    private boolean validIndex(int index){
        if(index >= tail || index < 0){
            return false;
        }

        return true;
    }
    
   
    /**
    * Inplace swap of 2 elements, assumes locations are in array
    * O(1)
    * @param location1 index of the first location
    * @param location2 index of the second location
    */
    private void swap(int location1, int location2){
        Entry<K,V> temp = storage[location1];
        storage[location1] = storage[location2];
        storage[location2] = temp;
    }
}