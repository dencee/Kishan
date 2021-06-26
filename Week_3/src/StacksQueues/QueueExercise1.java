package StacksQueues;

import static org.junit.Assert.assertEquals;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class QueueExercise1 {
    /*
     * OBJECTIVE: Complete the calculateWaitTime() method to return the amount of
     * time it takes to get the tickets.
     * 
     * You managed to send your friend to queue for tickets in your stead, but there
     * is a catch: he will get there only if you tell him how much that is going to
     * take. And everybody can only take ONE TICKET at a time, then they go back in
     * the last position of the queue if they need more (or go home if they are
     * fine).
     * 
     * Each ticket takes one minutes to emit with no wasted time between purchases.
     * You will be given a queue with all the people queuing and the initial
     * position of your buddy.
     * 
     * Example: queue: [2, 5, 3, 4, 6] position: 1 (the person who wants to buy 5
     * tickets)
     * 
     * The first person buys 1 ticket then moves to the back of the queue because
     * they still need to buy 1 more ticket. Everyone else moves up the queue.
     * queue: [5, 3, 4, 6, 1]
     * 
     * Now it's your turn to buy a ticket. You buy 1 and move to the back of the
     * queue because you still need to buy 4 more queue: [3, 4, 6, 1, 4]
     *
     * For this queue it takes a total of 18 minutes!
     */
    public static int calculateWaitTime( ArrayDeque<Integer> ticketsQueue, int position ) {
        /*
         * PUT YOUR CODE HERE
         * 
         * Check your code by running this file. If all 5 tests pass (all green) then your code works
         * If any of the tests fail (red) then something needs to be fixed in your code.
         */
        
        return -1;
    }
    
    
    @Test
    public void test1() {
        List<Integer> list = Arrays.asList(2, 5, 3, 6, 4);
        ArrayDeque<Integer> ticketsQueue = new ArrayDeque<Integer>(list);

        assertEquals(6, QueueExercise1.calculateWaitTime(ticketsQueue, 0));
    }

    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(2, 5, 3, 6, 4);
        ArrayDeque<Integer> ticketsQueue = new ArrayDeque<Integer>(list);

        assertEquals(18, QueueExercise1.calculateWaitTime(ticketsQueue, 1));
    }

    @Test
    public void test3() {
        List<Integer> list = Arrays.asList(2, 5, 3, 6, 4);
        ArrayDeque<Integer> ticketsQueue = new ArrayDeque<Integer>(list);

        assertEquals(12, QueueExercise1.calculateWaitTime(ticketsQueue, 2));
    }

    @Test
    public void test4() {
        List<Integer> list = Arrays.asList(2, 5, 3, 6, 4);
        ArrayDeque<Integer> ticketsQueue = new ArrayDeque<Integer>(list);

        assertEquals(20, QueueExercise1.calculateWaitTime(ticketsQueue, 3));
    }

    @Test
    public void test5() {
        List<Integer> list = Arrays.asList(2, 5, 3, 6, 4);
        ArrayDeque<Integer> ticketsQueue = new ArrayDeque<Integer>(list);

        assertEquals(17, QueueExercise1.calculateWaitTime(ticketsQueue, 4));
    }
}
