package StacksQueues;
import java.util.ArrayDeque;
import java.util.Stack;

public class QueueAndStackDemo {
    public static void main(String[] args) {
        QueueAndStackDemo sq = new QueueAndStackDemo();
        sq.stacks();
        sq.queues();
    }

    void stacks() {
        /*
         * Initializing a Stack of Strings
         */
        System.out.println("Here is a Stack of Strings: \n");

        Stack<String> flavors = new Stack<String>();
        flavors.push("Strawberry");
        flavors.push("Mint");
        flavors.push("Chocolate");
        flavors.push("Apple");
        flavors.push("Vanilla");
        flavors.push("Mango");

        /*
         * Since Mango was the last one pushed, it will be the first one popped. The
         * pop() method reduces the size of the Stack by 1
         */
        System.out.println("Stack size: " + flavors.size());
        System.out.println("Popping 2 elements off the top of the stack:");

        String topOfStack = flavors.pop();
        System.out.println(topOfStack);
        System.out.println(flavors.pop());

        /*
         * Getting the size of the Stack Notice the size is smaller by 2 after two pop()
         * methods are called regardless of whether the return value of the pop() was
         * saved into a variable.
         */
        System.out.println("Stack size: " + flavors.size());

        /*
         * Looping through the Stack and clearing it
         */
        System.out.println("\nPopping all the Strings off the Stack:");
        while (!flavors.isEmpty()) {
            System.out.println(flavors.pop());
        }

        System.out.println("Stack size: " + flavors.size());
    }

    void queues() {
        /*
         * Initializing a Queue of Strings using the ArrayDeque class. Deque is short
         * for double-ended queue, which is a Queue with additional methods and
         * functionality.
         */
        System.out.println("Here is a Queue of Strings: \n");

        ArrayDeque<String> lineToEnter = new ArrayDeque<String>();
        lineToEnter.add("Jerry");
        lineToEnter.add("Mary");
        lineToEnter.add("Javier");
        lineToEnter.add("Irina");
        lineToEnter.add("Rosemary");
        lineToEnter.add("Arthur");

        /*
         * The first person added to the Queue, Jerry, will be the first person removed,
         * followed by second person added, third person, etc. The remove() method
         * reduces the size of the Queue by 1
         */
        System.out.println("Queue size: " + lineToEnter.size());
        System.out.println("Removing the front of the Queue:");
        System.out.println(lineToEnter.remove());

        /*
         * Getting the size of the Queue Notice the size is smaller by 1 after the
         * remove() method
         */
        System.out.println("Queue size: " + lineToEnter.size());

        /*
         * Looping through the Queue and clearing it
         */
        System.out.println("\nRemoving all the Strings off the Queue:");
        while (!lineToEnter.isEmpty()) {
            System.out.println(lineToEnter.remove());
        }

        System.out.println("Queue size: " + lineToEnter.size());
    }
}
