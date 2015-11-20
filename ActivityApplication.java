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

import java.util.Vector;

public class ActivityApplication {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<String>(); 
		Vector<Double> v2 = new Vector<Double> ();

	    v1.addElement(new String("Tom"));
	    v1.addElement(new String("Jon"));
	    v1.addElement(new String("Mary"));
	    v1.addElement(new String("Sam"));
	    v1.addElement(new String("Nina"));
	    v1.addElement(new String("Tara"));
		
		for (int i = 0; i< 5; i++){
			v2.addElement(new Double(i+99));  
		}
		
		//*********DotProduct***************
//		Vector<Pair<String,Double>> product = DotProduct.calcDotProduct(v1, v2);
//		System.out.println("Printing DotProduct ************\n"+DotProduct.display(product));
//		System.out.println("\n\n");
		
		//*********Permutations***************
		Vector<Pair<String, Double>> permutation = Combination.calCombination(v1, v2);
		System.out.println("Printing Permutations ************\n" + Combination.displayPermutations(permutation));
	}
}