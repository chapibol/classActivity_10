/**
 * Group Member 1: Luis Velascco 
 * Group Member 2: Larry Hong
 * Group Member 3: Peter Alvarado Nunez
 * Group Leader: Peter Alvarado Nunez
 * Date: 11-19-2015
 * Course: IT 306 - 001
 * Class Activity 10
 */
package classActivity_10;

import java.util.*;
public class DotProduct {
	public static <T,S>  Vector<Pair<T,S>> calcDotProduct(Vector<T> v1 , Vector<S> v2){
		if (v1.isEmpty() || v2.isEmpty()) return null;
		Vector<Pair<T,S>> product = new Vector<Pair<T,S>>();
		int size = Math.min(v1.size(), v2.size());
		for(int i=0; i<size; i++){
			Pair<T, S> p = new Pair<T, S>(v1.get(i), v2.get(i));
			product.add(p);
		}
		return product;
	}
	
	public static <T,S> String display(Vector<Pair<T,S>> pairVect){
		String out="";
		Iterator<Pair<T, S>> it = pairVect.iterator(); 
		while(it.hasNext()){
			Pair<T,S> cursor= ((Pair<T, S>)it.next());
			out+= cursor.getFirst() + "," +cursor.getSecond() + "\n"; 
		}
		return out;
	}
}
