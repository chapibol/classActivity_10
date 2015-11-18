/**
 * Group Member 1: Luis Velascco 
 * Group Member 2: Larry Hong
 * Group Member 3: Peter Alvarado Nunez
 * Group Leader: Peter Alvarado Nunez
 * Date: 11-18-2015
 * Course: IT 306 - 001
 * Class Activity 10
 */
package classActivity_10;

import java.util.*;

public class Combination{
	/**
	 * Method to create a combination by creating a vector that takes Pair objects.
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static <T, S> Vector<Pair<T, S>> calCombination(Vector<T> v1, Vector<S> v2){
		//If to check that both v1 and v2 have elements.
		if(v1.isEmpty() || v2.isEmpty()){
			return null;
		}
		
		//New vector that takes a Pair Object.
		Vector<Pair<T, S>> permutation = new Vector<Pair<T,S>>();
		
		//Iterator for the first vector. The names of the people.
		Iterator<T> stringIT = v1.iterator();
		//UNNECESSARY VARIABLE, BUT IS TO COUNT THE NUMBER OF TIMES THE LOOPS ITERATES. TESTING PURPOSES.
		int count = 0;
		
		//While loop to iterate through the v1 vector until there are no more elements.
		while(stringIT.hasNext()){
			//Variable to store the index position of the element at v1 and to move the iterator to the next position.
			int x = v1.indexOf(stringIT.next());
			
			//Iterator of the v2 vector. Declaration is done here to create a new iterator each time to go through all elements.
			Iterator<S> doubleIT = v2.iterator();
			
			//While loop to iterate through the v1 vector until there are no more elements.
			while(doubleIT.hasNext()){
				//TESTING PURPOSES CAN BE DELETED.
				++count;
				//New pair object to store the values that will be added to our vector of permutations.
				Pair<T,S> perm = new Pair<T,S>(v1.get(x), v2.get(v2.indexOf(doubleIT.next())));
				//Add the new pair object to our vector.
				permutation.add(perm);
			}
		}
		//TESTING PURPOSES CAN BE DELETED.
		System.out.println(count);
		
		//Same operations as above, but using a for loop. CAN BE DELETED.
//		int smallestVector = Math.min(v1.size(), v2.size());
//		int greatestVector = Math.max(v1.size(), v2.size());
		
//		for(int x = 0; x < greatestVector; x++){
//			
//			for(int i = 0; i < smallestVector; i++){
//				++count;
//				Pair<T,S> perm = new Pair<T,S>(v1.get(x), v2.get(i));
//				permutation.add(perm);
//			}
//		}
		//Returns the vector that holds all the permutations.
		return permutation;
	}
	
	/**
	 * Method to display all the permutations of the vector created earlier.
	 * @param pairVectors
	 * @return
	 */
	public static <T, S> String displayPermutations(Vector<Pair<T,S>> pairVectors){
		//String variable to display all the pairs as a String.
		String pair = "";
		//Iterator to go through the vector that holds all the permutations.
		Iterator<Pair<T, S>> it = pairVectors.iterator();
		
		//While loop to print all permutations.
		while(it.hasNext()){
			Pair<T, S> variation = (Pair<T,S>)(it.next());
			pair += variation.getFirst() + " " + variation.getSecond() + "\n";
		}
		//Returns the string with all the permutations.
		return pair;
	}
}
