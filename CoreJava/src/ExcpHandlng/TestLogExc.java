package excpHandlng;

public class TestLogExc {

	public static void main(String[] args) throws LoginException {

		TestLogExc t = new TestLogExc();

		try {

			t.authenticate("adm");

		} /*
			 * catch (LoginException e) {
			 * 
			 * System.out.println("Message"+" "+ e.getMessage());
			 * 
			 * }
			 */
		finally {

			System.out.println("This is finally Bloack");
		}
	}

	public void authenticate(String name) throws LoginException {

		if (!"admin".equals(name)) {

			LoginException e = new LoginException();

			throw e;

		}

	}

}
