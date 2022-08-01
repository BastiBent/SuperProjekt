import java.awt.Color;

import javax.swing.JColorChooser;

public class myColor {

	public static void main(String[] args) {
		// Erstellen eines ColorChooser Dialoges,
		//der eine Farbe zurück gibt.
		
		Color ausgewaehlteFarbe = JColorChooser.showDialog(null, "Farbauswahl", null);
		// Ausgabe der Ausgewaehlten Farbe
		System.out.println(ausgewaehlteFarbe);

	}

}
