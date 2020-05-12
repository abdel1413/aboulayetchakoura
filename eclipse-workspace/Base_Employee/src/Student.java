
public class Student {
	
	private int id; // Student's ID
	private String name; // Student's name
	private int[] grades; // array of student's grades earned so far, grades range from 0 to 100, including
	private int gradesCount = 0; // counter for the number of grades student received so far
	static int numberOfStudents = 0; // number of Students records created
	
	public Student(int id, String name){
		this.id = id;
		this.name = name;
		grades = new int[50]; // maximum number of grades is 50
		numberOfStudents++;
	}
	
	public int getID()
	{ return id; }
	
	public String getName()
	{ return name; }
	
	public Boolean addGrade(int num)
	{
		/* tries to add the grade 'num' to the list of Student's grades.
		 * If 'num' is a legal grade and space is available, True is returned,
		 * otherwise 'grades' array stays intact, and False is returned
		 */
		if (gradesCount < 49)
		{	if (num >=0 && num <= 100)
			{ 
			grades[gradesCount]= num;
			gradesCount++;
			return true;
			}
			else // illegal grade
				return false;
		}
		else // no more space to add a grade
			return false;
			
	}
	
	public int getNumberOfGrades()
	{ return gradesCount;
	}
	
	public static int numberOfStudentsRecords()
	
		{return numberOfStudents;}
	

	public int[] getCopyOfGrades() {
	int[] CopyOfGrades= new int[gradesCount];
	for(int i = 0; i < gradesCount; i++)
	{
		CopyOfGrades[i] = grades[i];
	}
	return CopyOfGrades;
}
	
}