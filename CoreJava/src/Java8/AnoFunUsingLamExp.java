package Java8;

public class AnoFunUsingLamExp {
	
	public static void main(String[] args) {
	
	HelloInt lambFun = () ->{
		
		System.out.println("Hello Lambda");
	};
	
	lambFun.say();
	}
}


