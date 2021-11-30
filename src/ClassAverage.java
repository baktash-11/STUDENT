import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Class Average");


		Scanner input = new Scanner(System.in);

		int total =0; 
		int gradeCounter = 0; 

		System.out.print("Enter grade or -1 to quit! ");
		int grade = input.nextInt(); 

		while(grade != -1){
			total = total + grade; 
			gradeCounter = gradeCounter +1; 
			System.out.print("Enter grade or -1 to quit! ");

			grade = input.nextInt();

		}

		if(gradeCounter !=0){
			double average = (double) total / gradeCounter; 
			System.out.printf("%nTotal of the %d grades enered is %d%n", gradeCounter, total);
			System.out.printf("Class Average is %.2f%n", average);

		}else{
			System.out.println("No Grades were Entered!");
		}







	}

}
