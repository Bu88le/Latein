package logic;

import java.util.ArrayList;

import translation.AKonVocs;

public class Auswahl {

	String gvs, info;
	boolean aKon, eKon, iKon, konsKon;
	int vocCount;
	ArrayList<String> foundVoc = new ArrayList<String>();


	public Auswahl(String gvs) {

		this.gvs = gvs;
		testing();

	}


	private void testing() {

		for (int i = 0; i < AKonVocs.getAKonStamm().size(); i++) {
			for (int z = 0; z < AKonVocs.getAKonStamm().get(i).length; z++) {
				if (gvs.equals(AKonVocs.getAKonStamm().get(i)[z])) {
					aKon = true;
					vocCount++;
					if (i == 4) {
						info = "Deponens";
						foundVoc.add(AKonVocs.getAKonStamm().get(i)[z]);
					} else if (i == 2) {
						info = "u-Perfekt";
						foundVoc.add(AKonVocs.getAKonStamm().get(3)[z]);
					} else {
						foundVoc.add(AKonVocs.getAKonStamm().get(i)[z]);
					}
				}
			}
		}

	}

}
