package hust.soict.dsai.lab01;
import java.util.Scanner;

public class EquationSolving {
	
	static void FirstDegreeEquation() {
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
        double a = input1.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input1.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinitely solutions.");
            } else {
                System.out.println("The equation has no solutions.");
            }
        } else {
            double x = -b / a;
            System.out.printf("The solution x = %.2f", x);
        }

        input1.close();
    }
	static void SystemOfFirstDegreeEquation() {
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the value of a11: ");
		double a11 = input2.nextDouble();
		System.out.println("Enter the value of a12: ");
		double a12 = input2.nextDouble();
		System.out.println("Enter the value of b1: ");
		double b1 = input2.nextDouble();
		System.out.println("Enter the value of a21: ");
		double a21 = input2.nextDouble();
		System.out.println("Enter the value of a22: ");
		double a22 = input2.nextDouble();
		System.out.println("Enter the value of b2: ");
		double b2 = input2.nextDouble();
		double D = a11*a22 - a12*a21,
			   Dx = b1*a22 - b2*a12,
			   Dy = a11*b2 - a21*b1;
		if(D==Dx && Dx==Dy) {
			System.out.println("The system has infinite solutions\n");
			}
		else if (D==0 && Dx != 0 && Dy != 0) {
			System.out.println("The system has no solutions\n");
		}
		else {
			double x1=Dx/D;
			double x2=Dy/D;
			System.out.printf("The linear system has solution x1= %.2f and x2= %.2f ",x1,x2);
		}
		input2.close();
	}
	static void SecondDegreeEquation(){
		Scanner input3= new Scanner(System.in);
		System.out.println("Enter the value of a:");
		double a=input3.nextDouble();
		System.out.println("Enter the value of b:");
		double b=input3.nextDouble();
		System.out.println("Enter the value of c:");
		double c=input3.nextDouble();
		double denta = b*b - 4*a*c;
		if (a==0) {
			System.out.println("This is a first-degree equation.\n");
			
		}
		else {
		 if (denta<0) {
			System.out.println("The equation has no solution");
		}
		else if (denta == 0) {
			double x = -b/(2*a);
			System.out.printf("The equation has double root that x1=x2=%.2f",x);
					}
		else { 
			double x1 = (-b+Math.sqrt(denta))/(2*a),
				   x2 = (-b-Math.sqrt(denta))/(2*a);
			System.out.printf("The equation has two solution x1 = %.2f and x2 = %.2f",x1,x2);
		}
		}
		input3.close();
	}
	
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

          System.out.println("Choose the type of equation:\n"
          		+ "1.First-Degree Equation\n"
          		+ "2.System of First-Degree Equations\n"
          		+ "3.Second-Degree Equation");
          int a = input.nextInt();
          switch (a) {
        	  case 1:
        		  FirstDegreeEquation();
        		  break;
        	  case 2:
        		  SystemOfFirstDegreeEquation();
        		  break;
        	  case 3:
        		  SecondDegreeEquation();
        		  break;
              default:
            	  break;          
          
    }
          input.close();
}
}