
public class StudentMarks 
{
	public static void main(String[] args)
	{
		Student student1 = new Student(50,70,80);
		System.out.println("Total marks of student1"+"="+ student1.getTotalMarks());
		System.out.println("Average marks of student1"+"="+ student1.getAverageMarks());
		
		Student student2 = new Student(70,80,90);
		System.out.println("Total marks of student2"+"="+ student2.getTotalMarks());
		System.out.println("Average marks of student2"+"="+ student2.getAverageMarks());
		
		Student student3 = new Student(52,62,72);
		System.out.println("Total marks of student3"+"="+ student3.getTotalMarks());
		System.out.println("Average marks of student3"+"="+ student3.getAverageMarks());
		
		int totalofSubjectA;
		totalofSubjectA = student1.getSubjectA() + student2.getSubjectA() + student3.getSubjectA();
		System.out.println("Total Marks of SubjectA"+"=" + totalofSubjectA);
		System.out.println("Average Marks of SubjectA"+"=" + totalofSubjectA/3);
		
		int totalofSubjectB;
		totalofSubjectB = student1.getSubjectB() + student2.getSubjectB() + student3.getSubjectB();
		System.out.println("Total Marks of SubjectB"+"=" + totalofSubjectB);
		System.out.println("Average Marks of SubjectB"+"=" + totalofSubjectB/3);
		
		int totalofSubjectC;
		totalofSubjectC = student1.getSubjectC() + student2.getSubjectC() + student3.getSubjectC();
		System.out.println("Total Marks of SubjectC"+"=" + totalofSubjectC);
		System.out.println("Average Marks of SubjectC"+"=" + totalofSubjectC/3);
		
	}
}

class Student {

	private int SubjectA;
	private int SubjectB;
	private int SubjectC;
	
	public Student(int subjectA, int subjectB, int subjectC) {
		this.SubjectA = subjectA;
		this.SubjectB = subjectB;
		this.SubjectC = subjectC;
	}

	public int getSubjectA() {
		
		return SubjectA;
	}
	
	public void setSubjectA(int subjectA) {
		SubjectA = subjectA;
	}

	public int getSubjectB() {
		return SubjectB;
	}

	public void setSubjectB(int subjectB) {
		SubjectB = subjectB;
	}

	public int getSubjectC() {
		return SubjectC;
	}

	public void setSubjectC(int subjectC) {
		SubjectC = subjectC;
	}

	public int getTotalMarks() {
		// TODO Auto-generated method stub
	 return SubjectA + SubjectB + SubjectC;
	}

	public int getAverageMarks() {
		// TODO Auto-generated method stub
		return (SubjectA + SubjectB + SubjectC)/3;
	}

}
