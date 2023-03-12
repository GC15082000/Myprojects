public class Student implements Comparable<Student> {

	Integer rollNumber;
	String name;

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.rollNumber.compareTo(this.rollNumber);
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}

	public Student(Integer rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
 
}
