package LinkedList;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;


public class LinkedListExercise1 {
    /*
     * OBJECTIVE:
     * Complete the methods below using the LLNode class below.
     * When this file is run, all tests should pass and show green.
     */
    
    class LLNode {
        LLNode prev;
        LLNode next;
        String value;
        
        LLNode(String value){
            prev = null;
            next = null;
            this.value = value;
        }
    }
    
    void LinkedListInsert(LLNode root, int index, LLNode newNode) {
        /*
         * CODE HERE.
         */
    }
    
    void addNode(LLNode root, LLNode newNode) {
        /*
         * CODE HERE.
         */
    }
        
    @Test
    void TestAddNode() {
        String[] vals = {"head", "once", "twice", "thrice"};
        
        LLNode first = new LLNode(vals[0]);
        addNode(first, new LLNode(vals[1]));
        addNode(first, new LLNode(vals[2]));
        addNode(first, new LLNode(vals[3]));

        int index = 0;
        
        LLNode curNode = first;
        for( int i = 0; i < vals.length; i++) {
            System.out.println(curNode.value + " " + vals[index]);
            
            // Error if node value doesn't match expected value
            assertTrue( curNode.value.equals( vals[index++] ) );
            
            curNode = curNode.next;
        }
    }
    
    @Test
    void TestReverseLinkedList() {
        String[] vals = {"head", "once", "twice", "thrice"};
        
        LLNode first = new LLNode(vals[0]);
        addNode(first, new LLNode(vals[1]));
        addNode(first, new LLNode(vals[2]));
        addNode(first, new LLNode(vals[3]));

        // Insert at index 2
        LinkedListInsert(first, 2, new LLNode("INSERT"));
        String[] newVals = {"head", "once", "INSERT", "twice", "thrice"};
        
        int index = 0;
        
        LLNode curNode = first;
        for( int i = 0; i < newVals.length; i++) {
            System.out.println(curNode.value + " " + newVals[index]);
            
            // Error if node value doesn't match expected value
            assertTrue( curNode.value.equals( newVals[index++] ) );
            
            curNode = curNode.next;
        }
    }
}
