import java.util.Scanner;
public class AddTwoMatrices {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the size of two matrices");
int n = input.nextInt();
int arr1[]=new int[n];
int arr2[]=new int[n];
for(int i=0; i<n; i++) {
	System.out.printf("\narr1[%d]:",i);
	arr1[i]=input.nextInt();
}
for(int i=0; i<n; i++) {
	System.out.printf("\narr2[%d]:",i);
	arr2[i]=input.nextInt();
}
int SumArr[]=new int[n];
for(int i=0; i<n; i++) {
	SumArr[i]=arr1[i]+arr2[i];
}
System.out.println("The Sum Array:");
for(int i=0; i<n; i++) {
	System.out.print(SumArr[i]+" ");
}
input.close();
	}

}
