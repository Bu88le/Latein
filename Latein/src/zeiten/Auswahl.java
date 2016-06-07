package zeiten;

import java.util.concurrent.SynchronousQueue;

import vokabeln.a;
import wörter.akonjugation;

public class Auswahl {
	
	private static String gv;
	
	public static void überprüfung(String gvs) {
		akonjugation:
		for (int i = 0; i < a.rverbenakon().length; i++) {
			for (int z = 0; z < a.rverbenakon()[i].length; z++) {
				System.out.println(a.rverbenakon()[i][z]);
				System.out.println(gvs);
				System.out.println("-----------");
				if (gvs.equals(a.rverbenakon()[i][z])) {
					gv = gvs + "ao";
					new akonjugation(gv, gvs);
					break akonjugation;
				}
			}
		}
	}
	

}
