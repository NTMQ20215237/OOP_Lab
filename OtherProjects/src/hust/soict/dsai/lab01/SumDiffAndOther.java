package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
public class SumDiffAndOther {

	public static void main(String[] args) {
String strNum1, strNum2;
String strNotification = "You've just entered: ";
strNum1 = JOptionPane.showInputDialog(null,
		"Please input the first number: ","Input the first number",
		JOptionPane.INFORMATION_MESSAGE);
double num1=Double.parseDouble(strNum1);
strNotification += strNum1 +" and ";
strNum2 = JOptionPane.showInputDialog(null,
		"Please input the second number: ","Input the second number",
		JOptionPane.INFORMATION_MESSAGE);	
strNotification += strNum2 ;
JOptionPane.showMessageDialog(null, strNotification,
		"Show two numbers",JOptionPane.INFORMATION_MESSAGE);

double num2=Double.parseDouble(strNum2);
double sum=num1+num2;
double diff=num1-num2;
double product=num1*num2;
double quotient=num1/num2;
strNotification = strNotification+".Then the sum is "+sum+""
		+ ", the difference is "+diff+", the product is "+ product
		+", the quotient is "+ quotient ;
JOptionPane.showMessageDialog(null, strNotification,
		"The result",JOptionPane.INFORMATION_MESSAGE);

System.exit(0);
}

}
