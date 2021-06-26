package StacksQueues;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class StackExercise2 {

    /*
     * OBJECTIVE:
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     * 
     * Implement the stack using the ArrayDeque class
     * 
     * *HINT*
     * If every open curly brace { is a push on the stack and every
     * closed curly brace } is a pop, it's possible to tell if there's
     * a mismatch of open and closed curly braces depending on the size
     * of the stack.
     */
    public static boolean doBracketsMatch(String b) {
        /*
         * PUT YOUR CODE HERE
         * 
         * Check your code by running this file. If all 5 tests pass (all green) then your code works
         * If any of the tests fail (red) then something needs to be fixed in your code.
         */
        
        
        return false;
    }
    
    
    @Test
    public void testMatchingBrackets() {
        assertTrue(StackExercise2.doBracketsMatch("{}"));
        assertTrue(StackExercise2.doBracketsMatch("{{}}"));
        assertTrue(StackExercise2.doBracketsMatch("{}{}{{}}"));
        assertFalse(StackExercise2.doBracketsMatch("{{}"));
        assertFalse(StackExercise2.doBracketsMatch("}{"));
    }
}
