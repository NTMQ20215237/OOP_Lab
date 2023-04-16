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

    	
    }
	}


