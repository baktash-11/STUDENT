import java.util.*;
public class StudentTest {

	public static void main(String[] args) {
		Student student1= new Student("Baktash Sana");
		

		// System.out.printf("Student1 Name:%s%nStudent1 Average $%.2f%n" , student1.getName(), student1.getAverage());
		
		System.out.println(student1.getName());

		Scanner  input = new Scanner(System.in);

		int total=0; 

		int counter=1;
		while(counter <=10){
			System.out.print(counter+ " Enter grade: ");
			int grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		input.close();
		student1.setAverage(total/10);
		System.out.println(student1.toString());
	}

}
