package com.akhtar.practice1;

public class dummy {
	public static void main(String[] args) {
		
		
		/*Java LinkedList class can contain duplicate elements.
		Java LinkedList class maintains insertion order.
		Java LinkedList class is non synchronized.
		In Java LinkedList class, manipulation is fast because no shifting needs to occur.
		Java LinkedList class can be used as a list, stack or queue.*/
		
		/*HashSet stores the elements by using a mechanism called hashing.
		HashSet contains unique elements only.
		HashSet allows null value.
		HashSet class is non synchronized.
		HashSet doesn't maintain the insertion order. Here, elements are inserted on
		the basis of their hashcode.
		HashSet is the best approach for search operations
		*/
		/*
		 * Java LinkedHashSet class contains unique elements only like HashSet. Java
		 * LinkedHashSet class provides all optional set operation and permits null
		 * elements. 
		 * Java LinkedHashSet class is non synchronized. 
		 * Java LinkedHashSet class maintains insertion order.
		 * 
		 */
		
		
		/*
		 * A map contains values on the basis of key, i.e. key and value pair. Each key
		 * and value pair is known as an entry. A Map contains unique keys. A Map is
		 * useful if you have to search, update or delete elements on the basis of a
		 * key.
		 */
		
		/*
		 Java HashMap contains values based on the key.
 Java HashMap contains only unique keys.
 Java HashMap may have one null key and multiple null values.
 Java HashMap is non synchronized.
 Java HashMap maintains no order.
 The initial default capacity of Java HashMap class is 16 with a load factor of 0.75
		 */
		
		/* HashMap is like a data structure that stores data in key-value pairs. 
		Internally, it uses an array of buckets, where each bucket holds entries (nodes).
		Each node contains a key, its value, the hash of the key, 
		and a pointer to the next node (in case of collisions).

		🟩 Step-by-step: How HashMap Stores Data
		When you use:

		
		map.put("abc", 123);
		Java calls "abc".hashCode() to generate a hash number.

		It calculates the bucket index using this hash:
			index = (n - 1) & hash;
		where n is the current size of the array (default is 16).

		If the bucket at index is empty:

		It creates a new node and puts it there.

		If the bucket already has something (hash collision):

		It checks if the key already exists using .equals().

		If yes, it updates the value.

		If no, it adds the new node at the end of the linked list in that bucket.

		If more than 8 nodes exist in one bucket → it converts the list to a Red-Black Tree for faster search.
		
		How HashMap Retrieves Data
		When you use:

		map.get("abc");
		HashMap calculates the hash and index again using the same method.

		Goes to that bucket and:

		If one node exists, checks the key using .equals() and returns the value.

		If a list/tree exists, it searches each node or tree node using .equals() to find the key.*/
		
		/* Java LinkedHashMap contains values based on the key.
		 Java LinkedHashMap contains unique elements.
		 Java LinkedHashMap may have one null key and multiple null values.
		 Java LinkedHashMap is non synchronized.
		 Java LinkedHashMap maintains insertion order.
		 The initial default capacity of Java HashMap class is 16 with a load factor of 0.75*/
		
		/*Java TreeMap contains values based on the key. It implements the NavigableMap 
		interface and extends AbstractMap class.
		 Java TreeMap contains only unique elements.
		 Java TreeMap cannot have a null key but can have multiple null values.
		 Java TreeMap is non synchronized.
		Java TreeMap maintains ascending order.*/
	}
}
