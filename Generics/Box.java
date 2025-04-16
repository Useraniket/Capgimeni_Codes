package Generics;

public class Box<T extends Number> {
	T value;
	
	Box(T value){
		this.value = value;
	}
	
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>(10);
		Box<Number>b2 = b1;
		
		
	}

}
