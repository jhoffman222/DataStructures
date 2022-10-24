

/*
 *********************************  STACKS   ******************************

 Stack is a linear data structure that follows LIFO order in which the operations are performed.

LIFO( Last In First Out ):-

   This is the process in which the element that is inserted last will come out first.

    Operations on Stack :-

    push()      -to insert an element into the stack
    pop()       -to remove an element from the stack
    top()       -Returns the top element of the stack.
    isEmpty()   -returns true is stack is empty else false
    size()      -returns the size of stack

    Push():
            Adds an item to the stack. If the stack is full, then it is said to be an Overflow condition.

            Algorithm for push:
                                    begin
                                     if stack is full
                                        return
                                     endif
                                    else
                                     increment top
                                     stack[top] assign value
                                    end else
                                    end procedure
    Pop:
        Removes an item from the stack. The items are popped in the reversed order in which they are pushed.
        * If the stack is empty, then it is said to be an Underflow condition.

        Algorithm for pop:
                            begin
                             if stack is empty
                                return
                             endif
                            else
                             store value of stack[top]
                             decrement top
                             return value
                            end else
                            end procedure
     Top:
            Returns the top element of the stack.

    Algorithm for Top:

                    begin
                      return stack[top]
                    end procedure
    isEmpty:
            Returns true if the stack is empty, else false.

    Algorithm for isEmpty:

                        begin
                     if top < 1
                        return true
                     else
                        return false
                    end procedure


*/



public class stacks {

    static final int MAX = 1000;
    int top;
    int arr[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return (top < 0);
    }
    stacks()
    {
        top = -1;
    }

    boolean push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            arr[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = arr[top--];
            return x;
        }
    }

    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = arr[top];
            return x;
        }
    }

    void print(){
        for(int i = top;i>-1;i--){
            System.out.print(" "+ arr[i]);
        }
    }
}

// Driver code
class Main {
    public static void main(String args[])
    {
        stacks s1 = new stacks();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1.pop() + " Popped from stack");
        System.out.println("Top element is :" + s1.peek());
        System.out.print("Elements in the stack are :");
        s1.print();
    }
}

