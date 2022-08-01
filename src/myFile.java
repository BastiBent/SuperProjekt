import javax.swing.JFileChooser;

public class myFile {

	public static void main(String[] args) {
		
		//JFileChooser Objekt erstellen
		JFileChooser chooser = new JFileChooser();
		// Dialog zum öffnen von Dateien anzeigen
		int rueckgabewert = chooser.showOpenDialog(null);
		
		// Abfrage, ob auf "Öffnen" geklickt wurde
		if(rueckgabewert == JFileChooser.APPROVE_OPTION)
		{
			// Ausgabe der ausgewählten Datei
			System.out.println("Die zu öffnende Datei ist: " 
					+ chooser.getSelectedFile().getName());
		}

	}

}
