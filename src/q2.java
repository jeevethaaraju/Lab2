import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner= new Scanner(System.in);
System.out.print("Insert your first number: ");
int numMarks = scanner.nextInt();

System.out.print("Insert your second number: ");
int numMarks1 = scanner.nextInt();

int totalSum = 0;

	
	totalSum += numMarks + numMarks1;
	

System.out.println("The sum of two value is :" + totalSum);

scanner.close();
	}

}
