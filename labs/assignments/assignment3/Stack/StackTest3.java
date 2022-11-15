import java.util.EmptyStackException;

public class StackTest3
{
    public static void main(String[] args)
    {  Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
       Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       
       //create a StackInterface<Double> and StackInterface<Integer>
       StackInterface<Double> doubleStack = new LinkedStack<Double>();
       StackInterface<Integer> integerStack = new LinkedStack<Integer>();
       
       //push elements of doubleElements onto doubleStack
       testPush("doubleStack", doubleStack, doubleElements);
       System.out.println("The double stack:");
       doubleStack.display();
       
       //clear the doubleStack
       doubleStack.clear();
       System.out.println("After clearing the stack, it becomes:");
       doubleStack.display();
       
       //pop from doubleStack
       testPush("doubleStack", doubleStack, doubleElements);
       testPop("doubleStack", doubleStack);
       
       //push elements of integerElements onto integerStack
       testPush("integerStack", integerStack, integerElements);
       System.out.println("The integer stack: ");
       integerStack.display();
       
       try
       { //Display the top element in the integerStack
         System.out.println("The top integer is: " + integerStack.peek());
       }
       catch (EmptyStackException ese)
       {   ese.printStackTrace();
       }
       
       //pop from integerStack
       testPop("integerStack", integerStack);
    }

    /**
     * Generic method testPush pushes elements onto a stack 
     * @param name the name of the stack
     * @param stack a stack of elements
     * @param elements an array of elements
     */
     private static <T> void testPush(String name, StackInterface<T> stack, 
                                  T[] elements)
     {   System.out.printf("%nPushing elements onto %s%n", name);
         
         //push elements to stack 
         for (T element : elements)
         {   System.out.printf("%s ", element);
             stack.push(element);
         }  
         System.out.println();
     }

    /**
     * Generic method testPop pops elements from a stack 
     * @param name the name of the stack
     * @param stack a stack of elements
     */
     private static <T> void testPop(String name, StackInterface<T> stack)
     {      System.out.printf("%nPopping elements from %s%n", name);
            T popValue; // store element removed from stack
            while (!stack.isEmpty())
            {   popValue = stack.pop();
                System.out.printf("%s ", popValue);
            }
            System.out.println();
     } 
}
