import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * A class of stacks whose entries are stored in a dynamic array
 *
 * @author Jing Hua Ye
 * @date Oct 26 2021
 * @version 1.0
 */
 public class ArrayDynamicStack<T> implements StackInterface<T>
 {
/*==============================================================================
                        INSTANCE VARIABLES
  ==============================================================================
*/
    //An array of stack entries
    private ArrayList<T> stack;

    //default capacity
    private static final int DEFAULT_CAPACITY = 50;

/*==============================================================================
                      CONSTRUCTORS
  ==============================================================================
*/
 /**
  * A default constructor for this stack
  */
  public ArrayDynamicStack()
  {  //to-complete
    this.stack = new ArrayList<>(DEFAULT_CAPACITY);
  }

  /**
   * Create a stack with a specific initail capacity
   * @param initCapacity the initial capacity of this stack
   */
   public ArrayDynamicStack(int initCapacity)
   {  //to-complete
    this.stack = new ArrayList<>(initCapacity);
   }

/* =============================================================================
                     INSTANCE METHODS
   =============================================================================
 */
/* ---------------------- Getters --------------------------------------------*/
   /**
    * Get a full stack
    * @return a full stack
    */
    public ArrayList<T> getStack()
    {   //to-complete
      return this.stack;
    }

/* -------------------- Setters ---------------------------------------------*/
   /**
    * To set this stack to a new stack
    * @param stack a new stack
    */
    public void setStack(ArrayList<T> stack)
    {  //to-complete
      this.stack = stack;
    }    
/* ------------------- Other methods -----------------------------------------*/
  
   /**
   * Detects whether this stack is empty
   * @return true if the stack is empty
   */
   public boolean isEmpty()
   { //to-complete
    if (size()==0){
      return true;
    }
    return false;
   }

  
  /**
   * Count the number of entries in this stack
   * @return the number of entries in this stack
   */
   public int size()
   {  //to-complete
    return this.stack.size();
   } 
  
  /**
   * Retrieves this stack's top entry
   * @return the object at the top of the stack 
   * @throws NoSuchElementException if the stack is empty before the operation
   */
   public T peek()
   {  if (isEmpty())
         throw new NoSuchElementException("Stack is empty, no peek element");
      else
          //to-complete
          return this.stack.get(size()-1);
   } 
  
  /**
   * Removes and returns this stack's top entry
   * @return the object at the top of the stack
   * @throws NoSuchElementException if the stack is empty before the operation
   */
   public T pop()
   {  
      if (isEmpty())
        throw new NoSuchElementException("Stack is empty, cannot pop");
      else {
        //to-complete
        return this.stack.remove(size()-1);
      }
   }
  
  /**
    * Adds an entry to the top of this stack
    * @param newEntry an object to be added to the stack
    */
    public void push(T newEntry)
    { //to-complete
      this.stack.add(newEntry);
    } 
  
  /**
   * Removes all entries from this stack
   * @throws NoSuchElementException if the stack is empty before the operation
   */
   public void clear()
   {  if (isEmpty())
         throw new NoSuchElementException("Cannot clear an empty stack");
      else
         //to-complete
         this.stack = new ArrayList<>();
   }

  /**
   * List out all entries in this stack
   */
   public void display()
   {  //to-complete
    for (T element: this.stack){
      System.out.println(element.toString());
    }
   }

  @Override
  public boolean isFull() {
    // TODO Auto-generated method stub
    return false;
  } 
 }
