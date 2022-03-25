package IOStreamExceQ;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import IOStream.Externalizable1;

public class StudentQ5 implements Externalizable {

	transient int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		age = in.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeInt(age);
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileOutputStream file = new FileOutputStream("F:\\object1.ser");

		ObjectOutputStream out = new ObjectOutputStream(file);

		StudentQ5 ext = new StudentQ5();

		ext.setAge(21);

		out.writeObject(ext);

		System.out.println("File written");

		FileInputStream file1 = new FileInputStream("F:\\object1.ser");

		ObjectInputStream in = new ObjectInputStream(file1);

		StudentQ5 ext1 = (StudentQ5) in.readObject();

		System.out.println("Age Value :" + ext1.getAge());

		file.close();
		out.close();
		in.close();
	}

}
