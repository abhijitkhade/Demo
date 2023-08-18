package demo.overload;

public class Student {
	
	
	int id;
	String name;
	String Address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return Address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}
	
	
	
	
	

}
