package übersetzung;

import java.util.ArrayList;
import java.util.Collections;

import vokabeln.a;
import vokabeln.e;
import wörter.akonjugation;
import wörter.ekonjugation;

public class zusammenfassung {
	private static ArrayList<String> list = new ArrayList<String>();
	private static String s = "<html><b><font color=\"#0101DF\", size=\"12\">A</font></b><p/>";
	private static Character c;
	
	public zusammenfassung() {
		returnallevocsa();
	}
	
	public static void returnallevocsa() {
		
		for (int i = 0; i < a.rverbena().length;i++) {
			list.add(a.rverbena()[i] + akonjugation.endungeninf[0]);
		}
		for (int i = 0; i < a.rverbenadp().length; i++) {
			list.add(a.rverbenadp()[i] + akonjugation.endungeninf[1]);
		}
		for (int i = 0; i < a.rverbenau().length; i++) {
			list.add(a.rverbenau()[i] + akonjugation.endungeninf[0]);
		}	
		
		returnallevocse();
		
	}
	
	private static void returnallevocse() {
		for (int i = 0; i < e.rverbene().length;i++) {
			list.add(e.rverbene()[i] + ekonjugation.endungeninf[0]);
		}
		for (int i = 0; i < e.rverbenespn().length; i++) {
			list.add(e.rverbenespn()[i] + ekonjugation.endungeninf[0]);
		}
	}
	
	public static String returnallevocs() {
		new zusammenfassung();
		Collections.sort(list);
			for (int i = 0; i < list.size(); i++) {
				if (i > 0) {
					System.out.println("Hi");
					if (!(list.get(i).charAt(0) == list.get(i-1).charAt(0))) {
						System.out.println("This is me");
						c = list.get(i).charAt(0);
						s+="<b><font color=\"#0101DF\", size=\"12\">" + c.toUpperCase(c) + "</font></b>";
						s+="<p/>";
					}
				}			
				if (i<10) {
					s+=" ";
					s+=i+1;
					s+=". ";
				}
				if (i>=10) {
					s += i+1;
					s += ". ";
				}			
				s +=list.get(i);
				s += "<p/>";
			}
		return s;
	}
}
