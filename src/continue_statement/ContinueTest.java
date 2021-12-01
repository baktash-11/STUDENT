package continue_statement;

public class ContinueTest {

	public static void main(String[] args) {

		System.out.println();
		for (int i = 1; i < 12; i++) {

			if (i % 6 == 0) {
				break;
			}
			System.out.printf("%d ", i);
			
		}
		System.out.println();
		System.out.println("Used break-statement to break  jump out of loop when i % 6 == 0 numbers!");
		
		for (int i = 1; i <10; i++) {
			if(i %2 !=0){
				continue;
			}
			System.out.printf("%d  ", i);

			
		}
		System.out.printf("%nUsed Contiunue to skip printing Odd numbers!");

		
	}

}
