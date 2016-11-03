package logic;

import java.util.ArrayList;

import bu88le.gui.MainFrame;
import translation.AKonVocs;
import translation.EKonVocs;
import translation.IKonVocs;
import translation.KonsKonVocs;

public class Auswahl {

	String gvs, info;
	boolean aKon, eKon, iKon, konsKon;
	int vocCount;
	ArrayList<String> foundVoc = new ArrayList<String>();
	ArrayList<String> unusualForms = new ArrayList<String>();
	ArrayList<String> infinitive = new ArrayList<String>();
	ArrayList<String> translation = new ArrayList<String>();
	ArrayList<Integer> placeFoundVocs = new ArrayList<Integer>();


	public Auswahl(String gvs) {

		this.gvs = gvs;
		foundVoc.clear();
		unusualForms.clear();
		infinitive.clear();
		translation.clear();
		placeFoundVocs.clear();
		testing();

	}


	private void testing() {

		for (int i = 0; i < AKonVocs.getAKonStamm().size(); i++) {
			for (int z = 0; z < AKonVocs.getAKonStamm().get(i).length; z++) {
				if (gvs.equals(AKonVocs.getAKonStamm().get(i)[z])) {
					aKon = true;
					vocCount++;
					placeFoundVocs.add(z);
					if (i == 4) {
						info = "Deponens";
						foundVoc.add(AKonVocs.getAKonStamm().get(i)[z]);
						infinitive.add(AKonVocs.getAKonStamm().get(i)[z] + "ari");
					} else if (i == 2) {
						info = "u-Perfekt";
						foundVoc.add(AKonVocs.getAKonStamm().get(3)[z].substring(0,
								AKonVocs.getAKonStamm().get(3)[z].length() - 3));
						unusualForms.add(AKonVocs.getAKonStamm().get(2)[z]);
						infinitive.add(AKonVocs.getAKonStamm().get(3)[z]);
					} else {
						foundVoc.add(AKonVocs.getAKonStamm().get(i)[z]);
						infinitive.add(AKonVocs.getAKonStamm().get(i)[z] + "are");
					}
				}
			}
		}

		for (int i = 0; i < EKonVocs.getEKonStamm().size(); i++) {
			for (int z = 0; z < EKonVocs.getEKonStamm().get(i).length; z++) {
				if (gvs.equals(EKonVocs.getEKonStamm().get(i)[z])) {
					eKon = true;
					vocCount++;
					if (i == 2) {
						info = "Deponens";
						foundVoc.add(EKonVocs.getEKonStamm().get(4)[z]);
						unusualForms.add(EKonVocs.getEKonStamm().get(2)[z]);
						infinitive.add(EKonVocs.getEKonStamm().get(3)[z].substring(0,
								EKonVocs.getEKonStamm().get(3)[z].length() - 1) + "re");
					} else if (i == 4) {
						info = "Deponens";
						foundVoc.add(EKonVocs.getEKonStamm().get(4)[z]);
						unusualForms.add(EKonVocs.getEKonStamm().get(2)[z]);
						infinitive.add(EKonVocs.getEKonStamm().get(3)[z].substring(0,
								EKonVocs.getEKonStamm().get(3)[z].length() - 1) + "re");
					}
				}
			}
		}

		for (int i = 0; i < IKonVocs.getIKonStamm().size(); i++) {
			for (int z = 0; z < IKonVocs.getIKonStamm().get(i).length; z++) {
				if (gvs.equals(IKonVocs.getIKonStamm().get(i)[z])) {
					iKon = true;
					vocCount++;
					// TODO
				}
			}
		}

		for (int i = 0; i < KonsKonVocs.getKonsKonStamm().size(); i++) {
			for (int z = 0; z < KonsKonVocs.getKonsKonStamm().get(i).length; z++) {
				if (gvs.equals(KonsKonVocs.getKonsKonStamm().get(i)[z])) {
					konsKon = true;
					vocCount++;
					// TODO
				}
			}
		}

		counting();
	}


	private void counting() {
		if (vocCount == 1) {
			if (aKon) {

			} else if (eKon) {

			} else if (iKon) {

			} else if (konsKon) {

			}

		} else {
			if (aKon) {
				for (int i = 0; i < AKonVocs.getAKonVocs().size(); i++) {
					if (AKonVocs.getAKonVocs().get(i)[0].contains(gvs)) {
						translation.add(AKonVocs.getAKonVocs().get(i)[2]);
					}
				}
			}
			if (eKon) {
				for (int i = 0; i < EKonVocs.getEKonVocs().size(); i++) {
					if (EKonVocs.getEKonVocs().get(i)[0].contains(gvs)) {
						translation.add(EKonVocs.getEKonVocs().get(i)[2]);
					}
				}
			}
			if (iKon) {
				for (int i = 0; i < IKonVocs.getIKonVocs().size(); i++) {
					if (IKonVocs.getIKonVocs().get(i)[0].contains(gvs)) {
						translation.add(IKonVocs.getIKonVocs().get(i)[2]);
					}
				}
			}
			if (konsKon) {
				for (int i = 0; i < KonsKonVocs.getKonsKonVocs().size(); i++) {
					if (KonsKonVocs.getKonsKonVocs().get(i)[0].contains(gvs)) {
						translation.add(KonsKonVocs.getKonsKonVocs().get(i)[2]);
					}
				}
			}

			MainFrame.panelSelectWords(foundVoc, unusualForms, infinitive, placeFoundVocs, translation);
		}
	}

}
