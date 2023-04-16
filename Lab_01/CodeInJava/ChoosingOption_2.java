import javax.swing.JOptionPane;

public class ChoosingOption_2 {

	public static void main(String[] args) {
	int option = JOptionPane.showOptionDialog(null, "Do you want to change the first class ticket?", 
			"Confirmation", JOptionPane.YES_NO_OPTION, 
			JOptionPane.QUESTION_MESSAGE, null, new String[] {"Yes", "No"}, "Yes");
	JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));


	}

}
