
public class Student_Class implements Comparable {
//	private static final long serialVersionUID = -6381801229629928103L;
	
	private Integer age;
	private String state;
	private String firstName;
	private String lastName;

	public Student_Class(Integer age, String state, String firstName, String lastName) {
		super();
		this.age = age;
		this.state = state;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getage() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	public String firstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String lastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public int compareTo(Object o) {
		Student_Class sClass = (Student_Class) o;	
		return this.getage().compareTo(sClass.getage());
	}

	@Override
	public String toString() {
		return "Student [age = " + age + ", state = " + state
				+  ", firstName = " + firstName
				+ ", lastName = " + lastName + "]";
	}

}