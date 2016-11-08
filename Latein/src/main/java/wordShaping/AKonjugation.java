package wordShaping;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

public class AKonjugation extends Thread {

	BufferedReader reader = null;
	URL url1 = this.getClass().getClassLoader()
			.getResource("endings" + File.separator + "aKon" + File.separator + "normalAKon.dat");
	String gvs;

	static String[] präsensAktivIndikativ = new String[6];
	static String[] präsensAktivKonjunktiv = new String[6];
	static String[] präsensPassivIndikativ = new String[6];
	static String[] präsensPassivKonjunktiv = new String[6];

	static String[] imperfektAktivIndikativ = new String[6];
	static String[] imperfektAktivKonjunktiv = new String[6];
	static String[] imperfektPassivIndikativ = new String[6];
	static String[] imperfektPassivKonjunktiv = new String[6];

	static String[] futurIAktivIndikativ = new String[6];
	static String[] futurIPassivIndikativ = new String[6];

	static String[] perfektAktivIndikativ = new String[6];
	static String[] perfektAktivKonjunktiv = new String[6];
	static String[] perfektPassivIndikativ = new String[6];
	static String[] perfektPassivKonjunktiv = new String[6];

	static String[] plusquamperfektAktivIndikativ = new String[6];
	static String[] plusquamperfektAktivKonjunktiv = new String[6];
	static String[] plusquamperfektPassivIndikativ = new String[6];
	static String[] plusquamperfektPassivKonjunktiv = new String[6];

	static String[] futurIIAktivIndikativ = new String[6];
	static String[] futurIIPassivKonjunktiv = new String[6];


	public AKonjugation(String gvs) {
		this.gvs = gvs;
	}


	public void run() {
		aKonNormal();
	}


	private void aKonNormal() {
		try {
			File file = new File(url1.toURI());
			reader = new BufferedReader(new FileReader(file));
			String auslesen = reader.readLine();

			ArrayList<String[]> auslesenArray = new ArrayList<>();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(0).length; i++) {
				präsensAktivIndikativ[i] = gvs + auslesenArray.get(0)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(1).length; i++) {
				präsensAktivKonjunktiv[i] = gvs + auslesenArray.get(1)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(2).length; i++) {
				präsensPassivIndikativ[i] = gvs + auslesenArray.get(2)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(3).length; i++) {
				präsensPassivKonjunktiv[i] = gvs + auslesenArray.get(3)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(4).length; i++) {
				imperfektAktivIndikativ[i] = gvs + auslesenArray.get(4)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(5).length; i++) {
				imperfektAktivKonjunktiv[i] = gvs + auslesenArray.get(5)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(6).length; i++) {
				imperfektPassivIndikativ[i] = gvs + auslesenArray.get(6)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(7).length; i++) {
				imperfektPassivKonjunktiv[i] = gvs + auslesenArray.get(7)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(8).length; i++) {
				futurIAktivIndikativ[i] = gvs + auslesenArray.get(8)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(9).length; i++) {
				futurIPassivIndikativ[i] = gvs + auslesenArray.get(9)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(10).length; i++) {
				perfektAktivIndikativ[i] = gvs + auslesenArray.get(10)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(11).length; i++) {
				perfektAktivKonjunktiv[i] = gvs + auslesenArray.get(11)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(12).length; i++) {
				perfektPassivIndikativ[i] = gvs + auslesenArray.get(12)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(13).length; i++) {
				perfektPassivKonjunktiv[i] = gvs + auslesenArray.get(13)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(14).length; i++) {
				plusquamperfektAktivIndikativ[i] = gvs + auslesenArray.get(14)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(15).length; i++) {
				plusquamperfektAktivKonjunktiv[i] = gvs + auslesenArray.get(15)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(16).length; i++) {
				plusquamperfektPassivIndikativ[i] = gvs + auslesenArray.get(16)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(17).length; i++) {
				plusquamperfektPassivKonjunktiv[i] = gvs + auslesenArray.get(17)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(18).length; i++) {
				futurIIAktivIndikativ[i] = gvs + auslesenArray.get(18)[i];
			}

			auslesen = reader.readLine();
			auslesenArray.add(auslesen.split(","));
			for (int i = 0; i < auslesenArray.get(19).length; i++) {
				futurIIPassivKonjunktiv[i] = gvs + auslesenArray.get(19)[i];
			}

		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static String[] returnPräsensAktivIndikativ() {
		return präsensAktivIndikativ;

	}


	public static String[] returnPräsensAktivKonjunktiv() {
		return präsensAktivKonjunktiv;
	}


	public static String[] returnPräsensPassivIndikativ() {
		return präsensPassivIndikativ;
	}


	public static String[] returnPräsensPassivKonjunktiv() {
		return präsensPassivKonjunktiv;
	}


	public static String[] returnImperfektAktivIndikativ() {
		return imperfektAktivIndikativ;
	}


	public static String[] returnImperfektAktvKonjunktiv() {
		return imperfektAktivKonjunktiv;
	}


	public static String[] returnImperfektPassivIndikativ() {
		return imperfektPassivIndikativ;
	}


	public static String[] returnImperfektPassivKonjunktiv() {
		return imperfektPassivKonjunktiv;
	}


	public static String[] returnFuturIAktivIndikativ() {
		return futurIAktivIndikativ;
	}


	public static String[] returnFuturIPassivIndikativ() {
		return futurIPassivIndikativ;
	}


	public static String[] returnPerfektAktivIndikativ() {
		return perfektAktivIndikativ;
	}


	public static String[] returnPerfektAktivKonjunktiv() {
		return perfektAktivKonjunktiv;
	}


	public static String[] returnPerfektPassivIndikativ() {
		return perfektPassivIndikativ;
	}


	public static String[] returnPerfektPassivKonjunktiv() {
		return perfektPassivKonjunktiv;
	}


	public static String[] returnPlusquamperfektAktivIndikativ() {
		return plusquamperfektAktivIndikativ;
	}


	public static String[] returnPlusquamperfektAktivKonjunktiv() {
		return plusquamperfektAktivKonjunktiv;
	}


	public static String[] returnPlusquamperfektPassivIndikativ() {
		return plusquamperfektPassivIndikativ;
	}


	public static String[] returnPlusquamperfektPassivKonjunktiv() {
		return plusquamperfektPassivKonjunktiv;
	}


	public static String[] returnFuturIIAktivIndikativ() {
		return futurIIAktivIndikativ;
	}


	public static String[] returnFuturIIPassivIndikativ() {
		return futurIIPassivKonjunktiv;
	}
}
