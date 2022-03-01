package ExcpHandlng;

public class ParentCatch {

	public static void main(String[] args) {

		String name = "Aman";

		try {
			System.out.println("Length of Name is " + name.length());

			System.out.println("Charactor at 5th position is " + name.charAt(5));

		} catch (StringIndexOutOfBoundsException e) {

			System.out.println("Less Charactor !!");

		} catch (RuntimeException e) {

			System.out.println("Runtime Exception" + e.getMessage());

			e.printStackTrace();

		} finally {
			System.out.println("This is Finally Bloack");
		}
	}

}
