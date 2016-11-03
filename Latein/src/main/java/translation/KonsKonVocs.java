package translation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class KonsKonVocs {

	static ArrayList<String[]> gesamtVokabeln = new ArrayList<String[]>();
	private static ArrayList<String[]> stammVocs = new ArrayList<String[]>();

	String auslesen;
	URL url1 = getClass().getClassLoader().getResource("vocabulary/konskon.dat");
	URL url2 = getClass().getClassLoader().getResource("stems/konskon.dat");

	File file = null;
	BufferedReader reader = null;


	public KonsKonVocs() {
		stammAuslesen();
		vocsAuslesen();
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
			System.out.println(auslesen);
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
			System.out.println(auslesen);
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


	public static ArrayList<String[]> getKonsKonStamm() {
		return stammVocs;
	}


	public static ArrayList<String[]> getKonsKonVocs() {
		return gesamtVokabeln;
	}

}
