import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.print("How many marks do you want to insert?: ");
		int numMarks = scanner.nextInt();

		double totalMarks = 0;
		for(int i=1;i<= numMarks;i++) {
			System.out.print("Please enter mark no " + 1 + ":");
			double mark = scanner.nextDouble();
			totalMarks += mark;
			System.out.println("Mark " + mark + " has been inserted");
		}
		System.out.println("Total mark is :" + totalMarks);

		scanner.close();
			
	}

}


