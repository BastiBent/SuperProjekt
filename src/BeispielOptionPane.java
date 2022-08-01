import javax.swing.JOptionPane;

public class BeispielOptionPane {
	
	public static void main(String[] args) {
		
		String name1 = JOptionPane.showInputDialog("Gib den ersten Namen ein! ");
		String name2 = JOptionPane.showInputDialog("Gib den zweiten Namen ein! ");
		
		int num1 = name1.length();
		int num2 = name2.length();
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "Sie lieben sich zu " +sum + "%!", "Liebesprogramm", JOptionPane.PLAIN_MESSAGE);
		
	}

	//JOptionPane jop = new JOptionPane();
	
}
