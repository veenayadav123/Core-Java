package Generics;

public class TestData {
	
	public static void main(String[] args) {
		
		Data<Integer> i = new Date<Integer>(786);
		i.showType();
		int v = i.getValue();
		System.out.println("Value :" +v);
	}

}
