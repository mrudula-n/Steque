/*
 *  File: Steque_Resize.java
 *  Author: 
 *  Date: 18th Nov, 2021
 *  ---------------------------------------
 *  Steque is stack-ended queue data structure which supports
 *  stack operations: pop and push, along with queue enqueue 
 *  operation.
 *  
 *  Salient features:
 *  1. Operations like push, pop, enqueue are supported.
 *  2. NullPointerException is thrown when null element is inserted.
 *  3. UnsupportedOperationException is thrown when using remove() method.
 *  4. The data structure is iterable and is implemented for generic type.
 *  
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 
 * Steque is a stack-ended data structure which 
 * supports stack operations as well as queue's 
 * enqueue operation.
 * 
 * @author 
 * @version 1.0
 *
 */
public class Steque_Resize<Item> implements Iterable<Item> {
    private Item[] stack  = (Item[]) new Object[capacity];
    private int size;
    public int rear;
    public int last;
    private static int capacity = 10;
    


    /**
     * constructs a steque object.
     */
    public Steque_Resize() {
        size = 0;
        rear = 0;
    }
    private void resize(int newCapacity) {
        Item[] newstack= (Item[]) new Object[newCapacity];

		for(int i=0; i<stack.length; i++) {
			newstack[i] = stack[i];
		}
		stack = newstack;
    }
    
    /**
     * inserts an item in the steque in queue fashion.
     * @param item Item to be inserted.
     * 
     */
     // time complexity: O(n) space complexity: O(n)
    public void enqueue(Item item) {
        if (item == null) throw new IllegalArgumentException();
        if(size >= stack.length) resize(2*stack.length);
        for(int i=stack.length-1; i > 0;i--) stack[i] = stack[i-1];
        stack[0] = item;
        size++;
    }
    
    
    /**
     * inserts an item in the steque in stack fashion.
     * @param item Item to be inserted.
     */
      //time complexity: O(1) space complexity: O(n)
    public void push(Item item) {
        if(item==null) throw new IllegalArgumentException();
        if(size >= stack.length) resize(2*stack.length);
        stack[size] = item;
        size++;
    }
    
    /**
     * pops a least recent item in steque.
     * @return Item object from steque.
     */
     
    public Item pop() {
        
        
    }
    
    /**
     * checks to see if steque is empty.
     * @return true if steque is empty, false otherwise.
     */
    
    public boolean isEmpty() {
         
    }
    
    /**
     * return the number of elements currently in the steque.
     * @return size as integer.
     */
     //time complexity: O(1), space complexity: 0
    public int size() {
        
       
    }
    
    /**
     * returns an iterator over the elements 
     * stored in steque.
     * 
     */
     //time complexity: O(1), space complexity: 0
    public Iterator<Item> iterator() {
       
    }
    public class ArrayIterator implements Iterator<Item> {
       
        }

      
        public void remove() {
           
        }

        
        public Item next() {
            
    }
}
    public static void main(String[] args){
        Steque<Integer> s = new Steque<Integer>();
        s.enqueue(14);
        s.enqueue(17);
        s.enqueue(20);
        s.push(5);
        s.push(10);
        s.push(15);
        s.enqueue(25);
       
       }
    }}