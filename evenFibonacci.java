package intellect_seec;

import java.util.Scanner;

public class evenFibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x=2;

	int num1= 1, num2= 2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the :");
	int num= sc.nextInt();
	
	if(num<40000){
		for(int i=0; i<=num; i++){
			int num3= num1+ num2;
			num1= num2;
			num2= num3;
			if(num3%2 == 0)
			{
				x+=num3;
			}
		}
	}
	System.out.println("Sum: " + x);
	}
}