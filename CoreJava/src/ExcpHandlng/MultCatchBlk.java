package ExcpHandlng;

public class MultCatchBlk {

	public static void main(String[] args) {

		String name = null;

		try {
			System.out.println("Length of Name is " + name.length());

			System.out.println("Charactor at 5th position is " + name.charAt(4));

		} catch (StringIndexOutOfBoundsException e) {

			System.out.println("Less Charactor !!");

		} catch (NullPointerException e) {

			System.out.println("Null Pointer");
		}
		catch(Exception e) {
			
			System.out.println("Exception class in the last");
			}

		finally {
			
			System.out.println("This is Finally Block");
		}
	}

}
