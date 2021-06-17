package array;

public class ArrayDemo {

    public static void main(String[] args) {

        /*
         * Declaring and Initializing an array of Strings
         */
        String[] names = new String[5];

        names[0] = "Jan";
        names[1] = "Sara";
        names[2] = "Fred";
        names[3] = "Marc";
        names[4] = "Randy";

        /*
         * Declaring and Initializing an array of ints using a '{' and '}'
         * Both ways below are valid
         */
        int[] ints = { 0, 1, 2, 3, 4 };
        int[] ints2 = new int[] { 5, 6, 7, 8, 9 };
        
        /*
         * Getting the size of an array
         */
        System.out.println("Array names has " + names.length + " elements");

        /*
         * Iterating through array with a for-each loop
         */
        System.out.println("Here's the array of ints:");

        for (Integer i : ints) {
            System.out.println("int: " + i);
        }
        System.out.println("");
        
        /*
         * Iterating through array with a for-loop by index
         */
        System.out.println("Here's the array of Strings:");

        for (int i = 0; i < names.length; i++) {
            String s = names[i];
            System.out.println("String at element " + i + " " + s);
        }
        System.out.println("\n");
    }
}
