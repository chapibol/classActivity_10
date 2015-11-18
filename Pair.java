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

public class Pair<T,S> {
	T first; 
	S second; 
	
	public Pair(T u1 , S u2){
		first = u1;
		second = u2; 
	}
	
	public T getFirst() { 
		return first; 
	}
	
	public S getSecond() { 
		return second; 
	}
	
}
