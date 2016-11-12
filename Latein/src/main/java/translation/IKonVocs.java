package translation;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class IKonVocs {

	static ArrayList<String[]> gesamtVokabeln = new ArrayList<String[]>();
	private static ArrayList<String[]> stammVocs = new ArrayList<String[]>();

	String auslesen;
	URL url1 = getClass().getClassLoader().getResource("vocabulary/ikon.dat");
	URL url2 = getClass().getClassLoader().getResource("stems/ikon.dat");
	InputStream inpStream1 = getClass().getClassLoader().getResourceAsStream("vocabulary/ikon.dat");
	InputStream inpStream2 = getClass().getClassLoader().getResourceAsStream("stems/ikon.dat");

	File file = null;
	BufferedReader reader = null;


	public IKonVocs() {
		stammAuslesen();
		vocsAuslesen();
	}


	public IKonVocs(boolean run) {
		vocsAuslesen();
	}


	public void vocsAuslesen() {
		try {
			reader = new BufferedReader(new InputStreamReader(inpStream1));
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
			reader = new BufferedReader(new InputStreamReader(inpStream2));
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


	public static ArrayList<String[]> getIKonStamm() {
		return stammVocs;
	}


	public static ArrayList<String[]> getIKonVocs() {
		return gesamtVokabeln;
	}

}
