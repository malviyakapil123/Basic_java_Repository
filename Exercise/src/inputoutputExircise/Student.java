package inputoutputExircise;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable{
	
	private String name;
	private String rollno;
	transient int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(rollno);
		out.writeInt(age);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name =(String) in.readObject();
		rollno =(String) in.readObject();
		age =in.readInt();
	}
	
	
	

}
