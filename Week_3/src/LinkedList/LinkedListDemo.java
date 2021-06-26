package LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        new LinkedListDemo().demo();
    }
    
    /*
     * Each link/element/node in the list
     */
    class LLNode{
        LLNode prev;
        LLNode next;
        int value;
        
        LLNode(int value){
            prev = null;
            next = null;
            this.value = value;
        }
    }

    /*
     * OBJECTIVE:
     * Run the code. The numbers 0 to 5 should be printed.
     */
    void demo() {
        LLNode first = new LLNode(0);
        addNode(first, new LLNode(1));
        addNode(first, new LLNode(2));
        addNode(first, new LLNode(3));
        addNode(first, new LLNode(4));
        addNode(first, new LLNode(5));
        
        printLinkedListForward(first);
    }

    /*
     * Add a new link/element/node to the end of the list
     */
    void addNode(LLNode root, LLNode newNode) {
        LLNode curNode = root;
        while( curNode.next != null ) {
            curNode = curNode.next;
        }
        
        // Last node's next points to the new node
        curNode.next = newNode;
        
        // New node's prev points to the previous last node
        newNode.prev = curNode;
        
        // Note the new node's next still points to null
    }
    
    /*
     * Print all the link/element/nodes in the list starting from the
     * root/start node.
     */
    public void printLinkedListForward(LLNode root) {
        LLNode curNode = root;
        
        while( curNode != null ) {
            System.out.println(curNode.value);
            curNode = curNode.next;     // traverse forwards by looking at next
        }
    }
}
