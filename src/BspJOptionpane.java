import javax.swing.JOptionPane;

public class BspJOptionpane {

	public static void main(String[] args) {
		//Eingabe Dialog
		//JOptionPane.showInputDialog("Dies ist ein Input Dialog");
		
		// Dialog zur Bestätigung
		//JOptionPane.showConfirmDialog(null, "Dies ist ein Confirm Dialog");
		
		// Nachrichten Dialog
		//JOptionPane.showMessageDialog(null, "Dies ist ein Message Dialog");
		
		// Optionsdialog mit Warnhinweis
		JOptionPane.showInputDialog(null, "Dies ist ein Optionsdialog", JOptionPane.YES_NO_CANCEL_OPTION);

	}

}
