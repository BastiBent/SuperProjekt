import javax.swing.JFileChooser;

public class myFile {

	public static void main(String[] args) {
		
		//JFileChooser Objekt erstellen
		JFileChooser chooser = new JFileChooser();
		// Dialog zum �ffnen von Dateien anzeigen
		int rueckgabewert = chooser.showOpenDialog(null);
		
		// Abfrage, ob auf "�ffnen" geklickt wurde
		if(rueckgabewert == JFileChooser.APPROVE_OPTION)
		{
			// Ausgabe der ausgew�hlten Datei
			System.out.println("Die zu �ffnende Datei ist: " 
					+ chooser.getSelectedFile().getName());
		}

	}

}
