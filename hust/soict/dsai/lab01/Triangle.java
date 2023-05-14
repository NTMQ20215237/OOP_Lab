package hust.soict.dsai.lab01;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ENter the height of triangle:");
		int n = input.nextInt();
		for (int a=0;a<n;a++) {
			for (int b=0;b<n-a-1;b++) {
				System.out.print(" ");}
			for (int c=0;c<2*a+1;c++) {
			System.out.print("*");
			
			}
			System.out.println();
		}
    
		input.close();
	}

}
