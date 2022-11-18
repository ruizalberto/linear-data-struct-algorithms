/**
 * A class of queue whose entries are stored in a singly linked list
 *
 * @author Jing Hua Ye
 * @date Oct 26 2021
 * @version 1.0
 */
 public class LinkedQueue<T> implements QueueInterface<T>
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
           * To create a new node instance with a specific data and pointer of 
           * the next node
           * @param data the data of a specific node
           * @param next the pointer of a specific next node
           */
           public Node(T data, Node next)
           {  this.data = data;
              this.next = next;
           }

          /**
           * To get the data of this node 
           * @return the data of this Node
           */
           public T getData()
           {   return data;  
           }

          /**
           * To get the pointer of the next node 
           * @return the pointer of the next Node
           */
           public Node getNextNode()
           {  return next;
           }

          /**
           * To set the data of this node 
           * @param data the data of this node 
           */
           public void setData(T data)
           {  this.data = data;
           }   
          
          /**
           * To set the pointer of next node 
           * @param nextNode the pointer of the next node 
           */
           public void setNextNode(Node nextNode)
           {  next = nextNode;
           }
     }

/*==============================================================================
                        INSTANCE VARIABLES
  ==============================================================================
*/
    //References node at the front of queue
    private Node firstNode;

    //References node at the rear of queue
    private Node lastNode;

    //the number of data nodes in the queue
    private int numNodes;

/*==============================================================================
                      CONSTRUCTORS
  ==============================================================================
*/
 /**
  * A default constructor for this queue
  */
  public LinkedQueue()
  {   //to-complete
    this.firstNode = this.lastNode = null;
    this.numNodes = 0;
  }

/* =============================================================================
                     INSTANCE METHODS
   =============================================================================
 */
/* ------------------- Getters -----------------------------------------------*/
  /**
   * Count the number of entries in this queue
   * @return the number of entries in this queue
   */
   public int size()
   {  //to-complete
    Node temp = this.firstNode;
    int counter = 0;
    while (temp.next != this.lastNode){
      counter++;
      temp = temp.next;
    }
    return counter;
   } 
/* ------------------- Other methods -----------------------------------------*/
  
  /**
   * Detects whether this queue is empty
   * @return True if the queue is empty, or false otherwise
   */
   public boolean isEmpty()
   { //to-complete
    return this.numNodes == 0;
   }
  
  /**
   * Retrieve the entry at the font of this queue
   * @return The object at the front of the queue
   * @throws EmptyQueueException if the queue is empty before the operation
   */
   public T getFront()
   { try 
     { if (isEmpty())
         throw new EmptyQueueException("The queue is empty, cannot get front");
       else
        //to-complete
        return this.firstNode.getData();
     }
     catch (EmptyQueueException eqe)
     {  eqe.printStackTrace();
     }
     return null;
   } 
  
  /**
   * Remove and returns the entry at the front of this queue
   * @return The object at the front of the queue
   */
   public T dequeue()
   {  //to-complete
    Node temp = this.firstNode;
    this.firstNode = temp.next;
    this.numNodes--;
    return temp.getData();
   }
  
  /**
   * Adds a new entry to the back of this queue
   * @param newEntry An object to be added
   */
   public void enqueue(T newEntry)
   { //to-complete
    Node temp = new Node(newEntry, null);
    if (this.lastNode == null) {
        this.firstNode = this.lastNode = temp;
    }
    this.lastNode.next = temp;
    this.lastNode = temp;
    this.numNodes++;
   } 
  
  /**
   * Removes all entries from this queue
   */
   public void clear()
   {  //to-complete
    this.firstNode = this.lastNode = null;
    this.numNodes = 0;
   }

  /**
   * List out all entries in this queue
   */
   public void display()
   {  //to-complete
    if (!isEmpty()){
      Node temp = this.firstNode;
      if (temp == this.lastNode){
        System.out.println(temp.getData().toString());
      } else {
        while(temp.next != null){
          System.out.println(temp.getData().toString());
          temp = temp.next;
        }
        System.out.println(temp.getData().toString());
      }
    }
   } 
 }
