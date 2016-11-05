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


	public static String returnPräsensAktivIndikativ() {
		String r = "<html>";
		for (int i = 0; i < präsensAktivIndikativ.length; i++) {
			r += präsensAktivIndikativ[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;

	}


	public static String returnPräsensAktivKonjunktiv() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += präsensAktivKonjunktiv[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnPräsensPassivIndikativ() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += präsensPassivIndikativ[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnPräsensPassivKonjunktiv() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += präsensPassivKonjunktiv[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnImperfektAktivIndikativ() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += imperfektAktivIndikativ[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnImperfektAktvKonjunktiv() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += imperfektAktivKonjunktiv[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnImperfektPassivIndikativ() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += imperfektPassivIndikativ[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnImperfektPassivKonjunktiv() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += imperfektPassivKonjunktiv[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnFuturIAktivIndikativ() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += futurIAktivIndikativ[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnFuturIPassivIndikativ() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += futurIPassivIndikativ[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnPerfektAktivIndikativ() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += perfektAktivIndikativ[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnPerfektAktivKonjunktiv() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += perfektAktivKonjunktiv[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnPerfektPassivIndikativ() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += perfektPassivIndikativ[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnPerfektPassivKonjunktiv() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += perfektPassivKonjunktiv[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnPlusquamperfektAktivIndikativ() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += plusquamperfektAktivIndikativ[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnPlusquamperfektAktivKonjunktiv() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += plusquamperfektAktivKonjunktiv[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnPlusquamperfektPassivIndikativ() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += plusquamperfektPassivIndikativ[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnPlusquamperfektPassivKonjunktiv() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += plusquamperfektPassivKonjunktiv[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnFuturIIAktivIndikativ() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += futurIIAktivIndikativ[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}


	public static String returnFuturIIPassivIndikativ() {
		String r = "<html>";
		for (int i = 0; i < 6; i++) {
			r += futurIIPassivKonjunktiv[i];
			r += "<p/>";
		}
		r += "<html/>";
		return r;
	}
}
