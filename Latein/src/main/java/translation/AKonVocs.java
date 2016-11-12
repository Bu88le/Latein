package translation;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import bu88le.gui.MainFrame;

public class AKonVocs {

	static ArrayList<String[]>			gesamtVokabeln	= new ArrayList<>();
	private static ArrayList<String[]>	stammVocs		= new ArrayList<>();
	private ArrayList<String>			foundVoc		= new ArrayList<>();
	private final StringBuffer			ausgabe			= new StringBuffer("<html>");

	String								auslesen;
	InputStream							inputStream1	= getClass().getClassLoader()
			.getResourceAsStream("vocabulary/akon.dat");
	InputStream							inputStream2	= getClass().getClassLoader()
			.getResourceAsStream("stems/akon.dat");

	File								file			= null;
	BufferedReader						reader			= null;

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

		for (int i = 0; i < gesamtVokabeln.size(); i++)
			if (gesamtVokabeln.get(i)[0].contains(foundVoc.get(0))) {
				for (int z = 1; z < gesamtVokabeln.get(i).length; z++)
					ausgabe.append(gesamtVokabeln.get(i)[z]);
				break;
			}

		ausgabe.append("<html/>");
		MainFrame.panelTranslation(ausgabe);
	}

	public void vocsAuslesen() {
		reader = new BufferedReader(new InputStreamReader(inputStream1));
		
		try {
			auslesen = reader.readLine();
			while (auslesen != null)
				try {
					gesamtVokabeln.add(auslesen.split(","));
					//					for (final String[] strings : gesamtVokabeln)
					//						for (final String str : strings)
					//							System.out.println(str);
					auslesen = reader.readLine();
				} catch (final IOException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE);
				}
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null)
				try {
					reader.close();
				} catch (final IOException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE);
				}
			
		}
	}

	public void stammAuslesen() {

		reader = new BufferedReader(new InputStreamReader(inputStream2));
		try {
			auslesen = reader.readLine();
			while (auslesen != null)
				try {
					stammVocs.add(auslesen.split(","));
					auslesen = reader.readLine();
				} catch (final IOException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE);
				}
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null)
				try {
					reader.close();
				} catch (final IOException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE);
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
