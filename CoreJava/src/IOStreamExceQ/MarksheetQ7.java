package iOStreamExceQ;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class MarksheetQ7 implements Externalizable {

	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		message = (String) in.readObject(); // Deserialize transient variable

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(message); // Serialize transient variable

	}

}
