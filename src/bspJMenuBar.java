import java.awt.Color;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class bspJMenuBar {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Erzeugen eines Neuen Dialoges
		JDialog myJDialog = new JDialog();
		myJDialog.setTitle("JMenuBar für unser Java Tutorial");
		myJDialog.setSize(450, 300);
		// Zur Veranschaulichung erstellen wir eine Gelbe Umrandung
		LineBorder bo = new LineBorder(Color.yellow);
		// Erstellen einer Menüleiste
		JMenuBar bar = new JMenuBar();
		// Wir setzten die erstellte Umrandung für unsere Menüleiste
		bar.setBorder(bo);
		// Erzeugung eines Objektes in der Klasse JMenu
		JMenu menu = new JMenu("Ich bin ein JMenu");
		// Erzeugung eines Objektes der Klasse JMenuItem
        JMenuItem item = new JMenuItem("Ich bin das JMenuItem");
        menu.add(item);
        // Erzeugen eines Objektes der Klasse JSeperator
        JSeparator sep = new JSeparator();
        // Jseparator wird unserem Menü zugefügt
        menu.add(sep);
        // Erzeugung eines Objektes der Klasse JCheckBoxMenuItem
        JCheckBoxMenuItem checkBoxItem = new JCheckBoxMenuItem
                ("Ich bin das JCheckBoxMenuItem");
        // JCeckboxMenuItem wird unserem JMenu hinzugefügt
        menu.add(checkBoxItem);
     // Erzeugung eines Objektes der Klasse JRadioButtonMenuItem
        JRadioButtonMenuItem radioButtonItem = new JRadioButtonMenuItem
            ("Ich bin ein JRadionButtonMenuItem");
        // JRadioButtonMenuItem wird unserem Menü hinzugefügt
        menu.add(radioButtonItem);
        //Menü wird der Menüleiste hinzugefügt
		bar.add(menu);
		// Menüleiste für den Dialog wird gesetzt
		myJDialog.setJMenuBar(bar);
		
		
		myJDialog.setVisible(true);

	}

}
