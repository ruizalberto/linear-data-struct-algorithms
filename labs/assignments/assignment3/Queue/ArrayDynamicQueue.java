import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * A class of queue whose entries are stored in a dynamic array
 *
 * @author Jing Hua Ye
 * @date Oct 26 2021
 * @version 1.0
 */
 public class ArrayDynamicQueue<T> implements QueueInterface<T>
 {
/*==============================================================================
                        INSTANCE VARIABLES
  ==============================================================================
*/
    //An array of queue entries
    private ArrayList<T> queue;

    //Index of front entry and rear entry
    private int front, rear;

/*==============================================================================
                      CONSTRUCTORS
  ==============================================================================
*/
 /**
  * A default constructor for this queue
  */
  public ArrayDynamicQueue()
  {   //to-complete
    this.queue = new ArrayList<>();
  }

  /**
   * Create a queue with a specific initail capacity
   * @param initCapacity the initial capacity of this queue
   */
   public ArrayDynamicQueue(int initCapacity)
   {   //to-complete
    this.queue = new ArrayList<>(initCapacity);
    this.front = this.rear = 0;
   }

/* =============================================================================
                     INSTANCE METHODS
   =============================================================================
 */
/* ---------------------- Getters --------------------------------------------*/
   /**
    * Get a full queue
    * @return a full queue
    */
    public ArrayList<T> getQueue()
    {   //to-complete
      return this.queue;
    }
   
   /**
    * Get the index of front entry
    * @return the index of front entry
    */
    public int getFrontPos()
    {  //to-complete
      return this.front;
    }  

  /**
   * Get the index of rear entry
   * @return int getRearPos()
   */
   public int getRearPos()
   {    //to-complete
    return this.rear;
   }

/* -------------------- Setters ---------------------------------------------*/
   /**
    * To set this queue to a new queue
    * @param queue a new queue
    */
    public void setQueue(ArrayList<T> queue)
    {   //to-complete
      this.queue = queue;
    }    
/* ------------------- Other methods -----------------------------------------*/
  
  /**
   * Detects whether this queue is empty
   * @return True if the queue is empty, or false otherwise
   */
   public boolean isEmpty()
   { //to-complete
    if (this.queue == null || this.queue.size() == 0){
      return true;
    }
    return false;
   }

  /**
   * Count the number of entries in this queue
   * @return the number of entries in this queue
   */
   public int size()
   {  //to-complete
    return this.queue.size();
   } 
  
  /**
   * Retrieve the entry at the font of this queue
   * @return The object at the front of the queue
   * @throws NoSuchElementException if the queue is empty before the operation
   */
   public T getFront()
   {  if (isEmpty())
         throw new NoSuchElementException("Queue is empty, no front element");
      else
         //to-complete
         return this.queue.get(front);
   } 
  
  /**
   * Remove and returns the entry at the front of this queue
   * @return The object at the front of the queue
   * @throws NoSuchElementException if the queue is empty before the operation
   */
   public T dequeue()
   {  if (isEmpty())
        throw new NoSuchElementException("Queue is empty, cannot remove");
      else
        //to-complete
        this.rear--;
        return this.queue.remove(front);
   }
  
  /**
   * Adds a new entry to the back of this queue
   * @param newEntry An object to be added
   */
   public void enqueue(T newEntry)
   {  //to-complete
    this.rear++;
    this.queue.add(newEntry);
   } 
  
  /**
   * Removes all entries from this queue
   *  @throws NoSuchElementException if the queue is empty before the operation
   */
   public void clear()
   {  if (isEmpty())
         throw new NoSuchElementException("Cannot clear an empty queue");
      else
         //to-complete
         this.queue = null;
         this.rear = this.front = 0;
   }

  /**
   * List out all entries in this queue
   */
   public void display()
   {  //to-complete
    for (T element: this.queue){
      System.out.println(element.toString());
    }
   } 
 }
