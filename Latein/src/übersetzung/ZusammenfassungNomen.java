package übersetzung;

import java.util.ArrayList;
import java.util.Collections;

import vokabeln.Adeklination;
import wörter.ADeklination;

public class ZusammenfassungNomen {

	private static ArrayList<String> list = new ArrayList<String>();
	static Character c;
	private static String s;
	
	public ZusammenfassungNomen() {
		list.clear();
		s = "";
		returnAlleVocsADek();
	}
	
	void returnAlleVocsADek() {
		
		for (int i = 0; i < UeAD.zg.length; i++) {
			int z = UeAD.zg[i][0].length();
			list.add(UeAD.zg[i][1].substring(28, 28+z));
		}
	}
	
	public static String returnAlleNomen() {
		new ZusammenfassungNomen();
		
		Collections.sort(list); //Sortiert die ArrayList
		s = "<html><b><font color=\"#0101DF\", size=\"12\">A</font></b><p/>";
			for (int i = 0; i < list.size(); i++) {
				if (i > 0) { //Greift beim zweiten Durchlauf der Schleife
					
					
					//Prüft, ob der erste 'Char' des Wortes an Stelle 'i'
					//der gleiche Buchstabe wie im vorhergehenden Wort
					// Greift nur wenn 'false'
					if (!(list.get(i).charAt(0) == list.get(i-1).charAt(0))) {
						//Erster Buchstabe des Wortes an Stelle 'i' wird Char 'c' zugewiesen
						c = list.get(i).charAt(0);
						//Dem Return-String wird der gefundene BUchstabe in Schriftgröße 12 und Schriftfarbe BLAU hinzugefügt
						s+="<b><font color=\"#0101DF\", size=\"12\">" + c.toUpperCase(c) + "</font></b>";
						s+="<p/>";
					}
				}
				if (i<=8) {
					//Fügt der Ziffer eine Leerstelle zur korrekten Formatierung hinzu
					s+=" &#160 ";
					s+=i+1;
					s+=". ";
				}
				if (i>8) {
					s += i+1;
					s += ". ";
				}
				
				s +=list.get(i);
				s += "<p/>";
			}
		return s;
	}
}
