import java.lang.Exception;

/**
 * This class defines an exception when the operations are done with an empty
 * queue
 *
 * @author Jing Hua Ye
 * @date Oct/29/2021
 * @version 1.0
 */
 public class EmptyQueueException extends Exception
 {
/* ============================================================================
                     CONSTRUCTORS
   ============================================================================
 */
      /**
       * To create a customed exception with a specific error message
       *
       * @param message a specific error message when the exception is arisen
       */
       public EmptyQueueException(String message)
       {     super(message);
       }    

      /**
       * To create a customed exception with a specific error message and a 
       * specific cause of the exception
       *  
       * @param message a specific error message when the exception is arisen
       * @param cause the cause of the exception
       */
       public EmptyQueueException(String message, Throwable cause)
       {     super(message, cause);
       }
 }