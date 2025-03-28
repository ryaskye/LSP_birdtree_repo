package org.howard.edu.lsp.assignment5;
/**
 * Rya McKinnon  student id 
 * @03056867
 * used google for intersection  and union part and chat gpt for debugging
 */

import java.util.*;

/**
 * This class represents a set of integers using an ArrayList.
 *   IntegerSet -Default constructor with empty set.
 *  
 */
public class IntegerSet {

	
	private List<Integer> set = new ArrayList<Integer>();

	/**
     * Default constructor with empty set.
     */
	public IntegerSet() {
	}
	/**
     * Clears all elements from the set.
     */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = new ArrayList<>(set);
	}

	/**
     * Clears all elements from the set.
     */
	public void clear() {
		set.clear();
	}

	/**
     * Returns the size of the set.
     */
	public int length() {
		return set.size();
	}
	/**
	 * Checks if two sets are equal.
	 */
	
	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof IntegerSet)) return false;
		IntegerSet otherSet = (IntegerSet) o;
		return new HashSet<>(set).equals(new HashSet<>(otherSet.set));
	}
	/**
     *Return true if the set contains the value. If not return false.
     */
	public boolean contains(int value) {
		return set.contains(value);
	}
	/**
     * Returns the largest item in the set.
	 */
	public int largest() {
		if (set.isEmpty()) throw new RuntimeException("Set is empty");
		return Collections.max(set);
	}

	/**
     * Returns the smallest value in the set.
     */
	public int smallest() {
		if (set.isEmpty()) throw new RuntimeException("Set is empty");
		return Collections.min(set);
	}

	/**
     * Adds an integer to the set if it is not already there.
     */

	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}

	/**
     * Removes an integer from the set if it's already there.
     */
	
	public void remove(int item) {
		set.remove(Integer.valueOf(item));
	}

	/**
     * Performs the union of the current set with another set.
     */
	public void union(IntegerSet intSetb) {
		for (int num : intSetb.set) {
			add(num);
		}
	}

	/**
     * Performs the intersection of the current set with another set.
     */
	
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	}

	/**
     * Performs the difference of the current set with another set.
     */
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	}

	/**
     * Computes the complement of the set with another set (elements not in the first set).
     */
	public void complement(IntegerSet intSetb) {
		System.out.println("Complement operation not applicable without a universal set.");
	}
	/**
     * Returns true if the set is empty.
     */

	public boolean isEmpty() {
		return set.isEmpty();
	}

	/**
     * Returns a string representation of the set.
     */
	
	@Override
	public String toString() {
		return set.toString();
	}
} 
