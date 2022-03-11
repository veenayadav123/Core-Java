package IOStream;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Externalizable1 implements Externalizable {

	String name = null;
	int maths = 0;
	int physics = 0;
	int chemistry = 0;
	transient int temp = 0;

	public Externalizable1() {

	}

	public Externalizable1(String name, int maths, int physics, int chemistry, int temp) {

		this.name = name;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.temp = temp;
	}

	public String getName() {
		return name;
	}

	public int getMaths() {
		return maths;
	}

	public int getPhysics() {
		return physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public int getTemp() {
		return temp;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		name = (String) in.readObject();
		physics = in.readInt();
		chemistry = in.readInt();
		maths = in.readInt();
		temp = in.readInt(); // Deserialize transient variable

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(name);
		out.writeObject(physics);
		out.writeObject(chemistry);
		out.writeObject(maths);
		out.writeInt(temp); // Serialize transient variable

	}

}
