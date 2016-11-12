package logic;

import java.util.ArrayList;
import java.util.Collections;

import translation.AKonVocs;
import translation.EKonVocs;
import translation.IKonVocs;
import translation.KonsKonVocs;

public class ZusammenfassungVokabeln {

	static ArrayList<String> zusammengefasst = new ArrayList<>();
	static String returnString;


	public static String zusammenfasung() {
		new AKonVocs(true);
		new EKonVocs(true);
		new IKonVocs(true);
		new KonsKonVocs(true);

		for (int i = 0; i < AKonVocs.getAKonVocs().size(); i++) {
			System.out.println(AKonVocs.getAKonVocs().get(i)[1]);
			zusammengefasst.add(AKonVocs.getAKonVocs().get(i)[1]);
		}
		for (int i = 0; i < EKonVocs.getEKonVocs().size(); i++) {
			zusammengefasst.add(EKonVocs.getEKonVocs().get(i)[1]);
		}
		for (int i = 0; i < IKonVocs.getIKonVocs().size(); i++) {
			zusammengefasst.add(IKonVocs.getIKonVocs().get(i)[1]);
		}
		for (int i = 0; i < KonsKonVocs.getKonsKonVocs().size(); i++) {
			zusammengefasst.add(KonsKonVocs.getKonsKonVocs().get(i)[1]);
		}

		Collections.sort(zusammengefasst);
		System.out.println(zusammengefasst.toString());
		returnString = "<html><b><font color=\"#0101DF\", size=\"12\">A</font></b><p/>";
		for (int i = 0; i < zusammengefasst.size(); i++) {
			if (i > 0) {
				if (!(zusammengefasst.get(i).charAt(0) == zusammengefasst.get(i - 1).charAt(0))) {
					returnString += "<b><font color=\"#0101DF\", size=\"12\">"
							+ Character.toUpperCase(zusammengefasst.get(i).charAt(0)) + "</font></b>";
					returnString += "<p/>";
				}
			}
			if (i <= 8) {
				returnString += "&nbsp ";
				returnString += i + 1;
				returnString += ". ";
			}
			if (i > 8) {
				returnString += i + 1;
				returnString += ". ";
			}

			returnString += zusammengefasst.get(i);
			returnString += "<p/>";
		}
		returnString += "<html/>";

		return returnString;

	}

}
