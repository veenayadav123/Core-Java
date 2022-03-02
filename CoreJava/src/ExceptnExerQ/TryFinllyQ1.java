package ExceptnExerQ;

import ExcpHandlng.LoginException;

public class TryFinllyQ1 {

	public static void main(String[] args) throws LoginExceptionQ1 {

		TryFinllyQ1 t = new TryFinllyQ1();

		try {

			t.authenticate("admin");

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

	public void authenticate(String name) throws LoginExceptionQ1 {

		if (!"admin".equals(name)) {

			LoginExceptionQ1 e = new LoginExceptionQ1();
			
			throw e;

		}

	}

}
