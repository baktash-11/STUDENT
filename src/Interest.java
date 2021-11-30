import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		interest();
		doWhile();
		switchFunction();

	}

	static void interest(){
		//variables
		double amount ; 
		double principle =2000;; 
		double rate = 0.05;
		
		//heading
		System.out.printf("%s%20s%n", "year", "amount on deposit");
		//for loop
		for(int i = 1; i<=10; i++) {

			// calculate amount on deposite for each of then years
			amount = principle * Math.pow(1.0 + rate, i);

			System.out.printf("%3d%,15.2f%n", i, amount);
			
		}



	}

	public static void doWhile(){
		System.out.printf("%nDo while loop%n");
		int i=1; 
		do{
			System.out.printf("%d ", i );
			++i;
		}while(i <= 10);

		System.out.println();
	}

	public static void switchFunction () {
		int total = 0 , gradeCounter =0,  aCount=0, bCount=0,  cCount=0, dCount=0, fCount=0;

		Scanner input = new Scanner(System.in);

		System.out.printf("%n%s%n%s%n %n%s %n%s%n", "Enter the integer grades in the range 0-100",
		"Type the end-of-file indicator to terminate input:", "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
		"On Windows type <Ctrl> z then press Enter" );

		while(input.hasNext()){
			int grade = input.nextInt(); 
			total += grade; 
			++gradeCounter; 

			switch (grade /10) {
				case 9:
				case 10:
					++aCount;
					break;
				case 8:
				
					++bCount;
					break;
				case 7:
					++cCount;
					break;
				case 6:
				
					++dCount;
					break;
				
				default:
					++fCount;
					break;
			}

		}

		System.out.printf("%nGrade Report:%n");
		if(gradeCounter != 0){
			double average = (double) total / gradeCounter;

			System.out.printf("Total of the %d grade entered is %d%n", gradeCounter, total);
			System.out.printf("class average is %.2f%n", average);
			System.out.printf("%s %d%n%s %d%n%s %d%n%s %d%n%s %d%n", "A", aCount, "B" , bCount, "C", cCount, "D" , dCount, "F", fCount);
		}


	}
	


}
