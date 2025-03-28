package org.howard.edu.lsp.assignment5;

/**
 * used starter code example  and google 
 */

public class Driver {
    public static void main(String[] args) {    	
    	/**
         * Create and test Set 1
         */
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());
       
        /**
         * Create and test Set 2
         */
        
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        
        System.out.println("\nUnion of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());
        
        /**
         * test intersection
         */
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("\nIntersection of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.intersect(set2);
        System.out.println("Result of intersection of Set1 and Set2: " + set1.toString());
        
        /**
         * test difference
         */
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("\nDifference of Set1 - Set2");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.diff(set2);
        System.out.println("Result of difference of Set1 - Set2: " + set1.toString());
        
        /**
         * test remove and isEmpty
         */
        System.out.println("\nTesting contains, remove, and isEmpty");
        System.out.println("Set1 contains 2: " + set1.contains(2));
        set1.add(2);
        System.out.println("Set1 contains 2 after adding: " + set1.contains(2));
        set1.remove(2);
        System.out.println("Set1 contains 2 after removal: " + set1.contains(2));
        System.out.println("Is Set1 empty? " + set1.isEmpty());
        set1.clear();
        System.out.println("Is Set1 empty after clear? " + set1.isEmpty());
    }
}
