package ExcpHandlng;

public class ExcpHndl {

	public static void main(String[] args) {

		int i = 24;
		int j = 0;

		try {

			System.out.println("veena");
			double d = i / j;
			System.out.println("yadav");
		} catch (Exception e) {

			System.out.println(e.getMessage());

			e.printStackTrace();
		}
		finally {
			
			System.out.println("This is Finally Bloack");
		}

	}

}
