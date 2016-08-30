package übersetzung;

import java.util.ArrayList;
import java.util.Collections;

import vokabeln.a;
import vokabeln.e;
import wörter.akonjugation;
import wörter.ekonjugation;

public class zusammenfassung {
	private static ArrayList<String> list = new ArrayList<String>();
	//Erstellt einen String mit <html>-Formatierung und dem Buchstaben 'A'
	//in Schriftgröße 12 und Schriftfarbe BLAU
	private static String s = "<html><b><font color=\"#0101DF\", size=\"12\">A</font></b><p/>";
	private static Character c, chara, charb;
	static String y;
	static String z;
	
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
		for (int i = 0; i < a.verbenaun.length; i++) {
			list.add(a.verbenaun[i]);
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
		System.out.println(list.toString());
		Collections.sort(list); //Sortiert die ArrayList
			for (int i = 0; i < list.size(); i++) {
				if (i > 0) { //Greift beim zweiten Durchlauf der Schleife
					
					chara = Character.toLowerCase(list.get(i).charAt(0));
					charb = Character.toLowerCase(list.get(i-1).charAt(0));
					
					//Prüft, ob der erste 'Char' des Wortes an Stelle 'i'
					//der gleiche Buchstabe wie im vorhergehenden Wort
					// Greift nur wenn 'false'
					if (!(chara == charb)) {
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
