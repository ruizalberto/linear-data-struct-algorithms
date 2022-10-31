import javax.swing.text.Position;

/**
 * A class that implements a list of objects using a linked list. 
 * Duplicated entries are allowed.
 * 
 * @author Jing Hua Ye
 * @date Oct/30/2021
 * @version 1.0
 */
 public class LinkedList<T> implements ListInterface<T>
 {
/* =============================================================================
                        HELPER CLASSES
   =============================================================================
 */
    /**
     * A class represents a node, which contains two parts - data and pointer 
     * to the next node
     */
     private class Node
     {    //the data of a node
          private T data;
          //pointer to the next node
          private Node next;
   
          /**
           * To create a new node instance with a specific data
           * @param data the data of a specific node
           */
           public Node(T data)
           {  //to-complete
            this.data = data;
            this.next = null;
           }
      
          /**
           * To create a new node instance with a specific data and pointer of 
           * the next node
           * @param data the data of a specific node
           * @param next the pointer of a specific next node
           */
           public Node(T data, Node next)
           {  //to-complete
            this.data = data;
            this.next = next;
           }

          /**
           * To get the data of this node 
           * @return the data of this Node
           */
           public T getData()
           {   //to-complete
            return this.data;
           }

          /**
           * To get the pointer of the next node 
           * @return the pointer of the next Node
           */
           public Node getNextNode()
           {  //to-complete
            return this.next;
           }

          /**
           * To set the data of this node 
           * @param data the data of this node 
           */
           public void setData(T data)
           {  //to-complete
            this.data = data;
           }   
          
          /**
           * To set the pointer of next node 
           * @param nextNode the pointer of the next node 
           */
           public void setNextNode(Node nextNode)
           {  //to-complete
            this.next = nextNode;
           }
     }
/* ============================================================================
                        INSTANCE VARIABLES
   ============================================================================
 */
     //the header node
     private Node head;

     //the number of entries in the list
     private int numEntries;

/* ============================================================================
                        CONSTRUCTORS
   ============================================================================
 */
     /**
      * A default constructor 
      */
      public LinkedList()
      {  //to-complete
        this.head = null;
        this.numEntries = 0;
      }
/* =============================================================================
                       INSTANCE METHODS
   =============================================================================
 */
/* ---------------------- Getters --------------------------------------------*/
    /**
     * Gets the length of this list.
     * @return the integer number of entries currently in the list
     */
     public int getLength()
     { //to-complete
      return this.numEntries;
     }
/* ---------------------- Other Methods --------------------------------------*/
    /**
     * Add a new entry to the end of this list.
     * Entries currently in the list are unaffected.
     * The list's size is increased by 1.
     *
     * @param newEntry the object to be added as a new entry
     */
     public void add(T newEntry)
     { //to-complete
      Node newNode = new Node(newEntry);

      if (this.head == null) {
        this.head = newNode;
      }
      else {
        Node last = this.head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
      }
      numEntries++;
     }
    
    /**
     * Adds a new entry at a specified position within this list.
     * Entries originally at and above the specified position are 
     * at the next higher position within the list.
     * The list's size is increased by 1.
     * 
     * @param newPosition an integer that specifies the desired position 
     * of the new entry
     * @param newEntry the object to be added as a new entry
     * @throws IndexOutOfBoundsException if either newPosition < 1 or 
     * mewPosition > getLength() - 1
     */
     public void add(int newPosition, T newEntry)
     {  if (newPosition >= 1 && newPosition <= numEntries + 1)
        { //to-complete
          if (newPosition == 1) {
            Node newNode = new Node(newEntry);
            newNode.next = head;
            head = newNode;
          } else {
            while (newPosition-- != 0){
              if (newPosition == 1){
                Node newNode = new Node(newEntry);
                newNode.next = head.next;
                head.next = newNode;
              }
            }
          }
          numEntries++;
        }  
        else
           throw new IndexOutOfBoundsException("Illegal position given to add operation");
     }
    
    /**
     * Removes the entry at a given position from this list.
     * Entries originally at positions higher than the given position
     * are at the next lower position within the list.
     * 
     * @param givenPosition an integer that indicates the position of the 
     * entry to be removed
     * @return A pointer to the removed entry
     * @throws IndexOutOfBoundsException if either givenPosition < 1 or 
     * givenPosition > getLength()
     */
     public T remove(int givenPosition)    
     { if (givenPosition >= 1 && givenPosition <= numEntries)
       {  if (!isEmpty())
          { //to-complete
            Node temp = head;
            for (int i = 0; i < givenPosition - 1; i++){
              temp = temp.next;
            }
            Node nextNode = temp.next.next;
            temp.next = nextNode;
            numEntries--;
            return temp.getData();
          }
          else
            throw new IndexOutOfBoundsException("Illegal position given to remove operation");
       }
       return null;
     }

    /**
     * Replaces the entry at a given position in this list.
     * 
     * @param givenPosition an integer that indicates the position of the entry 
     * to be replaced
     * @param newEntry the object that will replace the entry at the position  
     * givenPosition
     * @throws IndexOutOfBoundsException if either givenPosition < 1 or 
     * givenPosition > getLength()
     */
     public T replace(int givenPosition, T newEntry)
     { if (givenPosition >= 1 && givenPosition <= numEntries) 
      {  //to-complete
          Node temp = head;
          for (int i = 0; i < givenPosition; i++){
            temp = temp.next;
          }
          temp.setData(newEntry);
          return temp.getData();
       }
        else {
          throw new IndexOutOfBoundsException("Illegal position given to replace operation"); 
       }
     }
    
    /**
     * Retrieves the entry at a given position in this list.
     * 
     * @param givenPosition an integer that indicates the position of the 
     * desired entry
     * @return A pointer to the indicated entry
     * @throws IndexOutOfBoundsException if either givenPosition < 1 or 
     * givenPosition > getLength()   
     */
     public T getEntry(int givenPosition)
     { if (givenPosition >= 1 && givenPosition <= numEntries)
       {  //to-complete
        Node temp = head;
        for (int i = 1; i < givenPosition - 1; i++){
          temp = temp.next;
        }
        return temp.getData();
       }
       else
          throw new IndexOutOfBoundsException("Illegal position given to getEntry operation");
     }

    /**
     * Sees whether this list contains a given entry.
     * 
     * @param anEntry the object that is the desired entry
     * @return true if the list contains anEntry, otherwise false
     */
     public boolean contains(T anEntry)
     {//to-complete
      Node temp = head;
      for (int i = 0; i < numEntries; i++){
        temp = temp.next;
        if (temp.getData().equals(anEntry)){
          return true;
        }
      }
      return false;
     }

    /**
     * Sees whether this list is empty.
     * @return true if the list is empty, otherwise false
     */
     public boolean isEmpty()
     {  //to-complete
      if (head == null || numEntries<1){
        return true;
      }
      return false;
     }

    /**
     * Retrieves all entries that are in this list in the order in which they
     * occur in the list.
     * 
     * @return a newly allocation array of all the entries in the list. If the 
     * list is empty, the returned array is empty.
     */
     public T[] toArray()
     {   T[] result = (T[])new Object[numEntries];
         int index = 0;
         Node currentNode = head;
         while (index < numEntries && currentNode != null)
         {   result[index] = currentNode.getData();
             currentNode = currentNode.getNextNode();
             index++;
         }
         return result;
     }
    
    /**
     * To remove all nodes in the list
     */
     public void clear()
     { //to-complete
      head.next = null;
      head = null;
      numEntries = 0;
     }
/* =============================================================================
                       HELPER METHODS
   =============================================================================
 */
   /**
    * It traverse the whole list until we locate the node at the desired 
    * position within the list
    * @param givenPosition an integer that indicates the position of the 
    * desired entry
    */
    private Node getNodeAt(int givenPosition)
    { if (head != null && givenPosition >= 1 && givenPosition <= numEntries)
      {  Node currentNode = head;
         for (int counter = 1; counter < givenPosition; counter++)
            if (currentNode != null)
               currentNode = currentNode.getNextNode();
         return currentNode;
      }   
      return null;
    }
 }
