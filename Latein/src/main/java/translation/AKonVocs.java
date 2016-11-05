package translation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import bu88le.gui.MainFrame;

public class AKonVocs {

	static ArrayList<String[]> gesamtVokabeln = new ArrayList<String[]>();
	private static ArrayList<String[]> stammVocs = new ArrayList<String[]>();
	private ArrayList<String> foundVoc = new ArrayList<String>();
	private StringBuffer ausgabe = new StringBuffer("<html>");

	String auslesen;
	URL url1 = getClass().getClassLoader().getResource("vocabulary/akon.dat");
	URL url2 = getClass().getClassLoader().getResource("stems/akon.dat");

	File file = null;
	BufferedReader reader = null;


	public AKonVocs() {
		gesamtVokabeln.clear();
		stammVocs.clear();
		stammAuslesen();
		vocsAuslesen();
	}


	public AKonVocs(ArrayList<String> foundVoc) {
		this.foundVoc.clear();
		this.foundVoc = foundVoc;

		ausgabe();
	}


	private void ausgabe() {

		for (int i = 0; i < gesamtVokabeln.size(); i++) {
			if (gesamtVokabeln.get(i)[0].contains(foundVoc.get(0))) {
				for (int z = 1; z < gesamtVokabeln.get(i).length; z++) {
					ausgabe.append(gesamtVokabeln.get(i)[z]);
				}
				break;
			}
		}

		ausgabe.append("<html/>");
		MainFrame.panelTranslation(ausgabe);
	}


	public void vocsAuslesen() {
		try {
			file = new File(url1.toURI());
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException fnfe) {
			JOptionPane.showMessageDialog(null, "Datei nicht gefunden. Bitte umgehend an den Support wenden!",
					"Warning: File not found", JOptionPane.WARNING_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			auslesen = reader.readLine();
			while (auslesen != null) {
				try {
					gesamtVokabeln.add(auslesen.split(","));
					auslesen = reader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE);
				}
			}

		}
	}


	public void stammAuslesen() {
		try {
			file = new File(url2.toURI());
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException fnfe) {
			JOptionPane.showMessageDialog(null, "Datei nicht gefunden. Bitte umgehend an den Support wenden!",
					"Warning: File not found", JOptionPane.WARNING_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			auslesen = reader.readLine();
			while (auslesen != null) {
				try {
					stammVocs.add(auslesen.split(","));
					auslesen = reader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE);
				}
			}

		}

	}


	public static ArrayList<String[]> getAKonStamm() {
		return stammVocs;
	}


	public static ArrayList<String[]> getAKonVocs() {
		return gesamtVokabeln;
	}

}
