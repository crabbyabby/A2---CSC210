/**
 * Class to implement a singly linked list
 *
 * @author Abigail Lei
 * @version Spring 2026
 */
public class SLL<T> implements ListADT<T>, NodeBasedOps<T>{

    // Attributes
    private NodeSL<T> head;
    private int size;

    SLL() {
        this.head = null;
        this.size = 0;
    }

    SLL(NodeSL<T> head) {
        this.head = head;
        this.size = 1;
    }

    /**
     * An accessor that returns the number of elements in the list
     * @return integer of how many elements are in the list
     * @throws NullPointerException if called on a list that has not been created yet.
     */
    public int size() {
        return this.size;
    }

    /**
     * Checks the list and returns whether it is empty or not
     * True means the list empty and has size of 0
     * False means having at least one element
     * @return a boolean of if the list is empty or not
     */
    public boolean isEmpty() {
        if (this.size == 0){
            return true;
        }
        return false;
    }

    /**
     * Accesses an element at a specific index, then returns it
     * @param index of element to access
     * @return T - the element at the index
     * @throws IndexOutOfBoundsException if index is invalid, less than 0 or is greater than the size
     */
    public T get(int index) {
        if (index < 0 || index > this.size){
            throw new IndexOutOfBoundsException("Invalid index");
        } 
       return getNode(index).getData();
    }

    /**
     * Helper method that returns a node at a specific index
     * @param index of element to access
     * @return N
     * @throws IndexOutOfBoundsException invalid index
     */
    public NodeSL<T> getNode(int index) {
        if (index < 0 || index > this.size){
            throw new IndexOutOfBoundsException("Invalid index");
        } 

        NodeSL<T> current = this.getHead();

        for (int i = 0; i < index; i++){
            current = current.getNext();
        }
        
        return current;
    }

    /**
     * Replaces the element of a specific index with a new element, T item
     * @param index an integer for the index of the position to change
     * @param value the new element of T type to replace the previous element with.
     * @throws IndexOutOfBoundsException if index is invalid, less than 0 or is greater than size
     * @throws IllegalStateException` if list is empty
     * @return the previous element that got replaced
     */
    public T set(int index, T value) {
        T returned;

        if (index < 0 || index > this.size){
            throw new IndexOutOfBoundsException("Invalid index");
        } else if (size < 0) {
            throw new IllegalStateException("Operation invalid in current state");
        } else{
             NodeSL<T> node = getNode(index);
            returned = node.getData();
            node.setData(value);
            if (this.size == 0){
                this.head = node; //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
            }
            return returned;
        } 
    }

    /**
     * Adds a new element at a specific index
     * pushes every element after it back an index
     * @param index an integer which is the index of where the new element is added
     * @param value is the element being added, can be many different types
     * @throws IndexOutOfBoundsException if index is invalid as in less than 0 or is greater than size
    */
    public void add(int index, T value){
        
    }

    /**
     * Appends the new element to the end of the list since there is no index
     * @param value the item being added to the list, can be any type
     */
    public void add(T value){

    }

    /**
     * Removes the item at the specific index
     * Pushes forward each element behind the element that was removed
     * @param index the index of the item to be removed
     * @return the item that was removed from the list
     * @throws IndexOutOfBoundsException if index is invalid: less than 0 or is greater than size
     * @throws IndexOutOfBoundsException if list is empty
     */
    public T remove(int index){

    }
    

    /**
     * toString printing method that formats the dynamic array nicely
     * @return String of dyanmic array in format with brackets and commas
     */
    public String toString(){
        String returned = "[";
        if (this.size == 0){
            return "[]";
        }

        
        for (int i = 0; i < this.size; i++){
            returned += this.getNode(i).getData();
            returned = returned + ", ";
        }

        return returned.substring(0, returned.length()-2) + "]";
    }

    public NodeSL<T> getHead();
  
    /** 
     *  Accessor for tail node
     *  @return the tail node
     */
    public NodeSL<T> getTail();

    /** 
     *  Inserts the given item at the head of the list
     *  @param v item to insert 
     */
    public void addFirst(T v);

    /** 
     *  Inserts the given item at the tail of the list
     *  @param v item to insert 
     */
    public void addLast(T v);

    /** 
     *  Removes the given item from the head of the list
     *  @return v item removed
     */
    public T removeFirst();

    /** 
     *  Removes the given item from the tail of the list
     *  @return item removed
     */
    public T removeLast();

    /** 
     *  Inserts the given item after the specified node.
     *  If here is null, insert at the head.
     *  @param here node to insert after
     *  @param v item to insert 
     */
    public void addAfter(NodeSL<T> here, T v);

    /** 
     *  Removes the node after the given position.
     *  If here is null, remove the head node.
     *  @param here marks position to remove after
     *  @return item removed
     */
    public T removeAfter(NodeSL<T> here);

}
