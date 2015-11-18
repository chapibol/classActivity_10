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
