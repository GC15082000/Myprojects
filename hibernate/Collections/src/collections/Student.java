package collections;

public class Student {

   int roll_num;
   String name_of_student;
   String class_of_student;
   
   public Student()
   {
	   super();
   }
public Student(int roll_num, String name_of_student, String class_of_student) {
	super();
	this.roll_num = roll_num;
	this.name_of_student = name_of_student;
	this.class_of_student = class_of_student;
}
@Override
public String toString() {
	return "Student [roll_num=" + roll_num + ", name_of_student=" + name_of_student + ", class_of_student="
			+ class_of_student + "]";
}
   
   
}
