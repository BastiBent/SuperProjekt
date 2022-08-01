import javax.swing.JDialog;
import javax.swing.JLabel;

public class myDialog{

	public static void main(String[] args) {
		/*Erzeugung eines neuen Frames mit
		 * dem Titel myDialog */
		JDialog jd = new JDialog();
		//Titel wird gesetzt
		jd.setTitle("MY JDialog Beispiel");
		// Breite und Höhe setzten
		jd.setSize(400,200);
		//Dialog auf Modal setzen
		jd.setModal(true);
		// Hinzufügen der Komponente JLabel
		//hier ein JLabel
		jd.add(new JLabel("Beispiel JLabel"));
		
		// Dialog anzeigen lassen
		jd.setVisible(true);
		

	}

}
