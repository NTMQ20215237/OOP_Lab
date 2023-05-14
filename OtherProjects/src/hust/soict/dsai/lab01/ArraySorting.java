package hust.soict.dsai.lab01;

import java.util.Arrays;
public class ArraySorting {

	public static void main(String[] args) {

    int[] arr = {1798,2035,1899,1456,2013};
    System.out.println("Before sorting:");
    for (int i=0;i<5;i++) {
   	 System.out.print(arr[i]+" ");
    }
     Arrays.sort(arr);
     System.out.println("\nAfter sorting:");

     for (int i=0;i<5;i++) {
    	 System.out.print(arr[i]+" ");
     }
     int sum=0;

     for (int i=0;i<5;i++) {
    	 sum = sum+ arr[i];
    	
     }
    	System.out.printf("\nThe Sum of the Array is %d",sum);
    	System.out.printf("\nThe Average of the Array is %.2f",(double)sum/5);

    }
	}


