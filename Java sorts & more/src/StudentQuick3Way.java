
public class StudentQuick3Way {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Class[] students = {
		
		new Student_Class(25, "Illinois", "Joe", "Johnson"),
		new Student_Class(22, "Indiana", "Michael", "Agombar"),
		new Student_Class(40, "Ohio", "Taco", "AreGood"),
		new Student_Class(18, "Alabama", "Burrito", "Eater"),
		new Student_Class(21, "Georgia", "Hans", "Solo"),
		};
	//Student_Class[] studentArray = students.toArray(new Student_Class[0]);
	{
	for(Student_Class student: students)
		System.out.println(student);
	}
	System.out.println("------------");
	Quick3way.sort(students);
	for(Student_Class student: students)
		System.out.println(student);
}
	
}