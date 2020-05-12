
public class TestingStudent {
	
	public static void main(String[] args) 
	{
		
		Student n1 = new Student(1113245,"Mark Moore");
		n1.addGrade(90);
		n1.addGrade(80);
		n1.addGrade(70);
		n1.addGrade(60);
		n1.addGrade(50);
		n1.addGrade(45);
		n1.addGrade(97);
		System.out.printf("Created record for student %s. Number of grades on record:%d\n",n1.getName(),n1.getNumberOfGrades());
		
		Student n2 = new Student(1234567,"Melissa Copola");
		n2.addGrade(76);
		n2.addGrade(56);
		n2.addGrade(98);
		n2.addGrade(86);
		n2.addGrade(92);
		n2.addGrade(74);
		n2.addGrade(79);
		System.out.printf("Created record for student %s. Number of grades on record:%d\n",n2.getName(),n2.getNumberOfGrades());
		System.out.println("Number of students records created so far: " + Student.numberOfStudentsRecords());
		System.out.println();
}
}