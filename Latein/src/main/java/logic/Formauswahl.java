package logic;

public class Formauswahl {

	String gv, gvs;


	public Formauswahl(String gv) throws IllegalArgumentException {
		this.gv = gv;
		aussortierungPassivGrob();
	}


	// \/\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\/
	// /\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\/PASSIV-GROB/\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\/
	// /\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\/
	private void aussortierungPassivGrob() throws IllegalArgumentException {

		// If-Schleifen �berpr�fuen die gesuchte Vokabel auf typische
		// Passivendungen in der Vergangenheit auf das charakteristische
		// " " +Endung

		if (gv.contains(" ")) {

			if (gv.endsWith(" sum") || gv.endsWith(" es") || gv.endsWith(" est") || gv.endsWith(" sumus")
					|| gv.endsWith(" estis") || gv.endsWith(" sunt")) {

				tempusPerfektPassivIndikativ();

			} else if (gv.endsWith(" eram") || gv.endsWith(" eras") || gv.endsWith(" erat") || gv.endsWith(" eramus")
					|| gv.endsWith(" eratis") || gv.endsWith(" erant")) {

				tempusPlusquamperfektPassivIndikativ();

			} else if (gv.endsWith(" ero") || gv.endsWith(" eris") || gv.endsWith(" erit") || gv.endsWith(" erimus")
					|| gv.endsWith(" eritis") || gv.endsWith(" erunt")) {

				tempusFuturIIPassivIndikativ();

			} else if (gv.endsWith(" sim") || gv.endsWith("s is") || gv.endsWith(" sit") || gv.endsWith(" simus")
					|| gv.endsWith(" sitis") || gv.endsWith(" sint")) {

				tempusPerfektPassivKonjunktiv();

			} else if (gv.endsWith(" essem") || gv.endsWith(" esses") || gv.endsWith(" esset")
					|| gv.endsWith(" essemus") || gv.endsWith(" essetis") || gv.endsWith(" essent")) {

				tempusPlusquamperfektPassivKonjunktiv();

			} else {

				aussortierungPassivFein();
			}
		} else {

			aussortierungPassivFein();
		}
	}


	// /\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\/
	// /\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\/PASSIV-FEIN/\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\/
	// /\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\/

	private void aussortierungPassivFein() throws IllegalArgumentException {

		// Pr�ft die gesuchte Vokabel auf Passiv-Endungen
		if (gv.endsWith("or") || gv.endsWith("ris") || gv.endsWith("tur") || gv.endsWith("mur") || gv.endsWith("mini")
				|| gv.endsWith("ntur") || gv.endsWith("er") || gv.endsWith("ar")) {

			//@formatter:off
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--IMPERFEKT::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--

				// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				// ::--::--::--::--::--::--Konjunktiv::--::--::--::--::--::--
				// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				/* �berpr�ft auf Endungen f�r:
				 *  1) Tempus: Imperfekt
				 *  2) Modus: Konjunktiv
				 *  3) Genus verbi: Passiv
				 */ 
			
				if (gv.endsWith("rer") || gv.endsWith("reris") || gv.endsWith("retur") || gv.endsWith("remur")
						|| gv.endsWith("remini") || gv.endsWith("rentur")) {
	
					
					if (gv.endsWith("erer") || gv.endsWith("ereris")
							|| gv.endsWith("eretur") || gv.endsWith("eremur")
							|| gv.endsWith("eremini") || gv.endsWith("erentur")) {
	
						tempusImperfektPassivKonjunktivEKonjugation();
	
					} else if (gv.endsWith("arer") || gv.endsWith("areris")
							|| gv.endsWith("aretur") || gv.endsWith("aremur")
							|| gv.endsWith("aremini") || gv.endsWith("arentur")) {
	
						tempusImperfektPassivKonjunktivAKonjugation();
	
					} else if (gv.endsWith("irer") || gv.endsWith("ireris")
							|| gv.endsWith("iretur") || gv.endsWith("iremur")
							|| gv.endsWith("iremini") || gv.endsWith("irentur")) {
	
						tempusImperfektPassivKonjunktivIKonjugation();
					} else {
						tempusPraesensPassivKonjunktivAKonjugation();
					}
					
					
				// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
				// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					
				/* �berpr�ft auf Endungen f�r:
				 *   1) Tempus: Imperfekt
				 *   2) Modus: Indikativ
				 *   3) Genus verbi: Passiv
				 */

				} else if (gv.endsWith("bar") || gv.endsWith("baris")
						|| gv.endsWith("batur") || gv.endsWith("bamur")
						|| gv.endsWith("bamini") || gv.endsWith("bantur")) {
	
					if (gv.endsWith("abar") || gv.endsWith("abaris")
							|| gv.endsWith("abatur") || gv.endsWith("abamur")
							|| gv.endsWith("abamini") || gv.endsWith("abantur")) {
						
						tempusImperfektPassivIndikativAKonjugation();
	
					} else if (gv.endsWith("iebar") || gv.endsWith("iebaris")
							|| gv.endsWith("iebatur") || gv.endsWith("iebamur")
							|| gv.endsWith("iebamini") || gv.endsWith("iebantur")) {
						
						tempusImperfektPassivIndikativIKonjugation();
	
					} else if (gv.endsWith("ebar") || gv.endsWith("ebaris")
							|| gv.endsWith("ebatur") || gv.endsWith("ebamur")
							|| gv.endsWith("ebamini") || gv.endsWith("ebantur")) {
						
						tempusImperfektPassivIndikativEKonjugation();
					}

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--Futur I::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--

					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					
					/* �berpr�ft auf Endungen f�r:
					 *  1) Tempus: Futur I
					 *  2) Modus: Indikativ
					 * 	3) Genus verbi: Passiv
					 */

					} else if (gv.endsWith("abor") || gv.endsWith("aberis")
							|| gv.endsWith("abitur") || gv.endsWith("abimur")
							|| gv.endsWith("abimini") || gv.endsWith("abuntur")) {
						
						tempusFuturIPassivIndikativAKonjugation();
		
					} else if (gv.endsWith("ebor") || gv.endsWith("eberis")
							|| gv.endsWith("ebitur") || gv.endsWith("ebimur")
							|| gv.endsWith("ebimini") || gv.endsWith("ebuntur")) {
						
						tempusFuturIPassivIndikativEKonjugation();
		
					} else if(gv.endsWith("iar") || gv.endsWith("ieris")
							|| gv.endsWith("ietur") || gv.endsWith("iemur")
							|| gv.endsWith("iemini") || gv.endsWith("ientur")) {
						
						tempusFuturIPassivIndikativIKonjugation();
						
					}else if (gv.endsWith("ar") || gv.endsWith("eris")
							|| gv.endsWith("etur") || gv.endsWith("emur")
							|| gv.endsWith("emini") || gv.endsWith("entur")
							|| gv.endsWith("er")) {
		
							tempusFuturIPassivIndikativKonsKOnjugation();
						

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--PR�SENS::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					
					/* �berpr�ft auf Endungen f�r:
					 *  1) Tempus: Pr�sens
					 *  2) Modus: Konjunktiv
					 * 	3) Genus verbi: Passiv
					 */

					} else if (gv.endsWith("earis") || gv.endsWith("eatur")
							|| gv.endsWith("eamur") || gv.endsWith("eamini")
							|| gv.endsWith("eantur") || gv.endsWith("ear")) {
						
						tempusPraesensPassivKonjunktivEKonjugation();
		
					} else if (gv.endsWith("iaris") || gv.endsWith("iatur")
							|| gv.endsWith("iamur") || gv.endsWith("iamini")
							|| gv.endsWith("iantur")) {
						
						tempusPraesensPassivKonjunktivIKonjugation();
		
					} else if (gv.endsWith("er") || gv.endsWith("eris")
							|| gv.endsWith("etur") || gv.endsWith("emur")
							|| gv.endsWith("emini") || gv.endsWith("entur")) {
						
						tempusPraesensPassivKonjunktivAKonjugation();
					
					}else if (gv.endsWith("aris") || gv.endsWith("atur")
							|| gv.endsWith("amur") || gv.endsWith("amini")
							|| gv.endsWith("antur") || gv.endsWith("ar")) {
						
						tempusPraesensPassivKonjunktivEKonjugation();
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					
					/* �berpr�ft auf Endungen f�r:
					 *  1) Tempus: Pr�sens
					 *  2) Modus: Konjunktiv
					 * 	3) Genus verbi: Passiv
					 */

					} else if (gv.endsWith("or") || gv.endsWith("ris")
							|| gv.endsWith("tur") || gv.endsWith("mur")
							|| gv.endsWith("mini") || gv.endsWith("ntur")) {
		
						if (gv.endsWith("eor") || gv.endsWith("eris") || gv.endsWith("etur")
								|| gv.endsWith("emur") || gv.endsWith("emini")
								|| gv.endsWith("entur")) {
							
							tempusPraesensPassivIndikativEKonjugation();
			
						} else if (gv.endsWith("ior") || gv.endsWith("iris")
								|| gv.endsWith("itur") || gv.endsWith("imur")
								|| gv.endsWith("imini") || gv.endsWith("iuntur")) {
							
							tempusPraesensPassivIndikativIKonjugation();
			
						} else if (gv.endsWith("aris") || gv.endsWith("atur")
								|| gv.endsWith("amur") || gv.endsWith("amini")
								|| gv.endsWith("antur") || gv.endsWith("or")) {
							
							tempusPraesensPassivIndikativAKonjugation();
			
						} else if (gv.endsWith("untur")) {
							
							tempusPraesensPassivIndikativKonsKonjugation();
						}
					}

			/*
			 * Wenn keine Passiv-Endung vorhanden ist -> Suche nach
			 * Aktivendungen
			 */

		} else {
			aussortierungAktiv();
		}
	}
	
	void aussortierungAktiv() throws IllegalArgumentException {	

		
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--PLUSQUAMPERFEKT::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
							
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--

					/* �berpr�ft auf Endungen f�r:
					 *  1) Tempus: Plusquamperfekt
					 *  2) Modus: Indikativ
					 *  3) Genus verbi: Aktiv
					 */
					
					if (gv.endsWith("eram") || gv.endsWith("eras") || gv.endsWith("erat") ||
							gv.endsWith("eramus") || gv.endsWith("eratis") || gv.endsWith("erant")) {
						
						if (gv.endsWith("averam") || gv.endsWith("averas") ||
								gv.endsWith("averat") || gv.endsWith("averamus") ||
								gv.endsWith("averatis") || gv.endsWith("averant")) {
							
							tempusPlusquamperfektAktivIndikativAKonjugation();
							
						}else if (gv.endsWith("iveram") || gv.endsWith("iveras") ||
								gv.endsWith("iverat") || gv.endsWith("iveramus") ||
								gv.endsWith("iveratis") || gv.endsWith("iverant")) {
						
							tempusPlusquamperfektAktivIndikativIKonjugation();
							
						}else if (gv.endsWith("ueram") || gv.endsWith("ueras") ||
								gv.endsWith("uerat") || gv.endsWith("ueramus") ||
								gv.endsWith("ueratis") || gv.endsWith("uerant")) {
							
							tempusPlusquamperfektAktivIndikativEKonjugation();
							
						}else if (gv.endsWith("seram")|| gv.endsWith("seras") ||
								gv.endsWith("serat") || gv.endsWith("seramus") ||
								gv.endsWith("seratis") || gv.endsWith("serant")){
							
							tempusPlusquamperfektAktivIndikativEKonjugation();
							
						}else { 
							
							tempusPlusquamperfektAktivIndikativKonsKonjugation();
						}
		
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--

					/* �berpr�ft auf Endungen f�r:
					 *  1) Tempus: PLusquamperfekt
					 *  2) Modus: Konjunktiv
					 *  3) Genus verbi: Aktiv
					 */
									
					}else if (gv.endsWith("issem") || gv.endsWith("isses") || 
							gv.endsWith("isset") || gv.endsWith("issemus") ||
							gv.endsWith("issetis") || gv.endsWith("issent")) {
						
						if (gv.endsWith("avissem") || gv.endsWith("avisses") ||
								gv.endsWith("avisset") || gv.endsWith("avissemus") ||
								gv.endsWith("avissetis") || gv.endsWith("avissent")) {
							
							tempusPlusquamperfektAktivKonjunktivAKonjugation();
							
						}else if (gv.endsWith("uissem") || gv.endsWith("uisses") ||
								gv.endsWith("uisset") || gv.endsWith("uissemus") ||
								gv.endsWith("uissetis") || gv.endsWith("uissent")) {
							
							tempusPlusquamperfektAktivKonjunktivEKonjugation();
							
						}else if(gv.endsWith("ivissem") || gv.endsWith("ivisses") ||
								gv.endsWith("ivisset") || gv.endsWith("ivissemus") ||
								gv.endsWith("ivissetis") || gv.endsWith("ivissent")) {
							
							tempusPlusquamperfektAktivKonjunktivIKonjugation();
							
						}else if (gv.endsWith("sissem") || gv.endsWith("sisses") ||
								gv.endsWith("sisset") || gv.endsWith("sissemus") ||
								gv.endsWith("sissetis") || gv.endsWith("sissent")){
							
							tempusPlusquamperfektAktivKonjunktivEKonjugation();

						}else {
							
							tempusPlusquamperfektAktivKonjunktivKonsKonjugation();
							
						}
			

		
					
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--IMPERFEKT::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
										
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						
						/* �berpr�ft auf Endungen f�r:
						 *  1) Tempus: Imperfekt
						 *  2) Modus: Indikativ
						 *  3) Genus verbi: Aktiv
						 */
			
						}else if (gv.endsWith("bam") || gv.endsWith("bas") ||
								gv.endsWith("bat") || gv.endsWith("bamus") ||
								gv.endsWith("batis") || gv.endsWith("bant")) {
							
								if (gv.endsWith("abam") || gv.endsWith("abas") ||
										gv.endsWith("abat") || gv.endsWith("abamus") ||
										gv.endsWith("abatis") || gv.endsWith("abant")) {
									
									tempusImperfektAktivIndikativAKonjugation();
									
								}else if (gv.endsWith("iebam") || gv.endsWith("iebas") ||
										gv.endsWith("iebat") || gv.endsWith("iebamus") ||
										gv.endsWith("iebatis") || gv.endsWith("iebant")) {
									
									tempusImperfektAktivIndikativIKonjugation();
									
								}else if (gv.endsWith("ebam") || gv.endsWith("ebas") ||
										gv.endsWith("ebat") || gv.endsWith("ebamus") ||
										gv.endsWith("ebatis") || gv.endsWith("ebant")) {
									
									tempusImperfektAktivIndikativEKonjugation();
									
								}
		
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						
						/* �berpr�ft auf Endungen f�r:
						 *  1) Tempus: Imperfekt
						 *  2) Modus: Konjunktiv
						 *  3) Genus verbi: Aktiv
						 */
				
						}else if (gv.endsWith("rem") || gv.endsWith("res") || 
								gv.endsWith("ret") || gv.endsWith("remus") ||
								gv.endsWith("retis") || gv.endsWith("rent")) {
							
							if (gv.endsWith("arem") || gv.endsWith("ares") ||
									gv.endsWith("aret") || gv.endsWith("aremus") ||
									gv.endsWith("aretis") || gv.endsWith("arent")) {
							
								tempusImperfektAktivKonjunktivAKonjugation();
								
							}else if(gv.endsWith("irem") || gv.endsWith("ires") ||
									gv.endsWith("iret") || gv.endsWith("iremus") ||
									gv.endsWith("iretis") || gv.endsWith("irent")) {
								
								tempusImperfektAktivKonjunktivIKonjugation();
								
							}else {
								
								tempusImperfektAktivKonjunktivEUndKonsKonjugation();
								
							}
			
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--FUTUR I::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
														
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
							
						/* �berpr�ft auf Endungen f�r:
						 *  1) Tempus: Futur I
						 *  2) Modus: Indikativ
						 *  3) Genus verbi: Aktiv
						 */
			
						}else if (gv.endsWith("bo") || gv.endsWith("bis") ||
								gv.endsWith("bit") || gv.endsWith("bimus") ||
								gv.endsWith("bitis") || gv.endsWith("bunt")) {
							
							if (gv.endsWith("abo") || gv.endsWith("abis") ||
									gv.endsWith("abit") || gv.endsWith("abimus") ||
									gv.endsWith("abitis") || gv.endsWith("abunt")) {
								
								tempusFuturIAktivIndikativAKonjugation();
								
							}else if (gv.endsWith("ebo") || gv.endsWith("ebis") ||
									gv.endsWith("ebit") || gv.endsWith("ebimus") ||
									gv.endsWith("ebitis") || gv.endsWith("ebunt")) {
								
								tempusFuturIAktivIndikativEKonjugation();
								
							}else if (gv.endsWith("ibo") || gv.endsWith("ibis") ||
									gv.endsWith("ibit") || gv.endsWith("ibimus") ||
									gv.endsWith("ibitis") || gv.endsWith("ibunt")) {
								
								tempusFuturIAktivIndikativIKonjugation();
								
							}
						
						} else if (gv.endsWith("am") || gv.endsWith("es") ||
								gv.endsWith("et") || gv.endsWith("emus") ||
								gv.endsWith("etis") || gv.endsWith("ent")) {
							
							tempusFuturIAktivIndikativKonsKonjugation();
			
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--PERFEKT::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
																		
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
											
						/* �berpr�ft auf Endungen f�r:
						 *  1) Tempus: Perfekt
						 *  2) Modus: Konjunktiv
						 *  3) Genus verbi: Aktiv
						 */
			
						}else if (gv.endsWith("ero") || gv.endsWith("erim") ||
								gv.endsWith("eris") || gv.endsWith("erit") ||
								gv.endsWith("erimus") || gv.endsWith("eritis") ||
								gv.endsWith("erint")) {
							
							
							if (gv.endsWith("avero") || gv.endsWith("averim") ||
									gv.endsWith("averis") || gv.endsWith("averit") ||
									gv.endsWith("averimus") || gv.endsWith("averitis") ||
									gv.endsWith("averint")) {
								
								tempusPerfektAktivKonjunktivAKonjugation();
							
								
							}else if (gv.endsWith("uerim") || gv.endsWith("uero") ||
									gv.endsWith("ueris") || gv.endsWith("uerit") ||
									gv.endsWith("uerimus") || gv.endsWith("ueritis") ||
									gv.endsWith("uerint")) {
								
								tempusPerfektAktivKonjunktivEKonjugation();
							
								
							}else if (gv.endsWith("ivero") || gv.endsWith("iverim") ||
									gv.endsWith("iveris") || gv.endsWith("iverit") ||
									gv.endsWith("iverimus") || gv.endsWith("iveritis") ||
									gv.endsWith("iverint")) {
								
								tempusPerfektAktivKonjunktivIKonjugation();
								
							}else if (gv.endsWith("sero") || gv.endsWith("seris") ||
									gv.endsWith("serit") || gv.endsWith("serimus") ||
									gv.endsWith("seritis") || gv.endsWith("serint") ||
									gv.endsWith("serim")){
								
								tempusPerfektAktivKonjunktivEKonjugation();
								
							}else {
								
								tempusPerfektAktivKonjunktivKonsKonjugation();
							}

			
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
											
						/* �berpr�ft auf Endungen f�r:
						 *  1) Tempus: Perfekt
						 *  2) Modus: Indikativ
						 *  3) Genus verbi: Aktiv
						 */

						}else if ( gv.endsWith("i") || gv.endsWith("isti") ||
								gv.endsWith("it") || gv.endsWith("imus") ||
								gv.endsWith("itis") || gv.endsWith("erunt")) {
							
							
								if (gv.endsWith("avi") || gv.endsWith("avisti") ||
										gv.endsWith("avit") || gv.endsWith("avimus") ||
										gv.endsWith("avitis") || gv.endsWith("averunt")) {
									
									tempusPerfektAktivIndikativAKonjugation();
								
									
								}else if (gv.endsWith("ui") || gv.endsWith("uisti") ||
										gv.endsWith("uit") || gv.endsWith("uimus") ||
										gv.endsWith("uistis") || gv.endsWith("uerunt")) {
									
									tempusPerfektAktivIndikativEKonjugation();

									
								}else if (gv.endsWith("ivi") || gv.endsWith("ivisti") ||
										gv.endsWith("ivit") || gv.endsWith("ivimus") ||
										gv.endsWith("ivitis") || gv.endsWith("iverunt")) {
									
									tempusPerfektAktivIndikativIKonjugation();
									
								}else if (gv.endsWith("si") || gv.endsWith("sisti") ||
										gv.endsWith("sit") || gv.endsWith("simus") ||
										gv.endsWith("sitis") || gv.endsWith("serunt")) {
									
									tempusPerfektAktivIndikativEKonjugation();
									
								}else {
									
									tempusPerfektAktivIndikativKonsKonjugation();
								}
						
			 
			
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--PR�SENS::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
																							
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
																
						/* �berpr�ft auf Endungen f�r:
						 *  1) Tempus: Pr�sens
						 *  2) Modus: Konjunktiv
						 *  3) Genus verbi: Aktiv
						 */
		
					
						}else if (gv.endsWith("em") || gv.endsWith("es") ||
								gv.endsWith("et") || gv.endsWith("emus") ||
								gv.endsWith("etis") || gv.endsWith("ament")) {
							
							tempusPraesensAktivKonjunktivAKonjugation();
							
						}else if (gv.endsWith("am") || gv.endsWith("as") ||
								gv.endsWith("at") || gv.endsWith("amus") ||
								gv.endsWith("atis") || gv.endsWith("ant")) {
							
							if (gv.endsWith("iam") || gv.endsWith("ias") ||
									gv.endsWith("iat") || gv.endsWith("iamus") ||
									gv.endsWith("iatis") || gv.endsWith("iant")) {
								
								tempusPraesensAktivKonjunktivIKonjugation();
								
							}else if(gv.endsWith("eam") || gv.endsWith("eas") ||
									gv.endsWith("eat") || gv.endsWith("eamus") ||
									gv.endsWith("eatis") || gv.endsWith("eant")) {
								
								tempusPraesensAktivKonjunktivEKonjugation();
								
							}else {
								tempusPraesensAktivKonjunktivKonsKonjugation();
							}
				
		
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
																
						/* �berpr�ft auf Endungen f�r:
						 *  1) Tempus: Pr�sens
						 *  2) Modus: Indikativ
						 *  3) Genus verbi: Aktiv
						 */
		
				
					}else if (gv.endsWith("eo") || gv.endsWith("es") || 
								gv.endsWith("et") || gv.endsWith("emus") ||
								gv.endsWith("etis") || gv.endsWith("ent")) {
					
							tempusPraesensAktivIndikativEKonjugation();
					
					}else if (gv.endsWith("io") || gv.endsWith("is") ||
								gv.endsWith("it") || gv.endsWith("imus") ||
								gv.endsWith("itis") || gv.endsWith("iunt")) {
					
							tempusPraesensAktivIndikativIKonjugation();
					
					}else if (gv.endsWith("o") || gv.endsWith("as") ||
								gv.endsWith("at") || gv.endsWith("amus") ||
								gv.endsWith("atis") || gv.endsWith("ant")) {
					
							tempusPraesensAktivIndikativAKonjugation();
					}else if (gv.endsWith("unt")) {
					
							tempusPraesensAktivIndikativKonsKonjugation();
				}else {
					throw new IllegalArgumentException();
				}
	}

	//@formatter:off
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--PR�SENS::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--AKTIV::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				private void tempusPraesensAktivIndikativAKonjugation() {
					System.out.println("Pr�sens - Aktiv - Indikativ - A Konjugation");
					
					if (gv.endsWith("o")) {
						gvs = gv.substring(0, gv.length()-1);
						new Auswahl(gvs);
					}else if (gv.endsWith("as") || gv.endsWith("at")) {
						gvs = gv.substring(0, gv.length()-2);
						new Auswahl(gvs);
					}else if (gv.endsWith("amus") || gv.endsWith("atis")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("ant")) {
						gvs = gv.substring(0, gv.length()-3);
						new Auswahl(gvs);
					}else {
						tempusPraesensAktivKonjunktivAKonjugation();
					}
					
				}
				
				private void tempusPraesensAktivIndikativEKonjugation() {
					System.out.println("Pr�sens - Aktiv - Indikativ - E Konjugation");
					
					if (gv.endsWith("eo") || gv.endsWith("es") || gv.endsWith("et")) {
						gvs = gv.substring(0, gv.length()-2);
						new Auswahl(gvs);
					}else if (gv.endsWith("emus") || gv.endsWith("etis")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("ent")) {
						gvs = gv.substring(0, gv.length()-3);
						new Auswahl(gvs);
					}else {
						tempusPraesensAktivKonjunktivEKonjugation();
					}
				}
				
				private void tempusPraesensAktivIndikativIKonjugation() {
					System.out.println("Pr�sens - Aktiv - Indikativ - I Konjugation");
					
					if (gv.endsWith("io")||gv.endsWith("is") || gv.endsWith("it")) {
						gvs = gv.substring(0, gv.length()-2);
						new Auswahl(gvs);
					}else if (gv.endsWith("imus") || gv.endsWith("itis") || gv.endsWith("iunt")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else {
						tempusPraesensAktivKonjunktivIKonjugation();
					}
					
				}
				
				private void tempusPraesensAktivIndikativKonsKonjugation() {
					System.out.println("Pr�sens - Aktiv - Indikativ - Kons Konjugation");
					
					gvs = gv.substring(0, gv.length()-3); //"unt"-Endung
					new Auswahl(gvs);
					
				}
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				private void tempusPraesensAktivKonjunktivAKonjugation() {
					System.out.println("Pr�sens - Aktiv - Konjunktiv - A Konjugation");
					
					if (gv.endsWith("em") || gv.endsWith("es") || gv.endsWith("et")) {
						gvs = gv.substring(0,  gv.length()-2);
						new Auswahl(gvs);
					}else if (gv.endsWith("emus") || gv.endsWith("etis")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("ent")) {
						gvs = gv.substring(0, gv.length()-3);
						new Auswahl(gvs);
					}else {
						tempusPraesensPassivIndikativAKonjugation();
					}
					
				}
				
				private void tempusPraesensAktivKonjunktivEKonjugation() {
					System.out.println("Pr�sens - Aktiv - Konjunktiv - E Konjugation");
					
					if (gv.endsWith("eam") || gv.endsWith("eas") || gv.endsWith("eat")) {
						gvs = gv.substring(0,  gv.length()-3);
						new Auswahl(gvs);
					}else if (gv.endsWith("eamus") || gv.endsWith("eatis")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}else if (gv.endsWith("eant")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else {
						tempusPraesensPassivIndikativEKonjugation();
					}
				}
				
				private void tempusPraesensAktivKonjunktivIKonjugation() {
					System.out.println("Pr�sens - Aktiv - Konjunktiv - I Konjugation");
					
					if (gv.endsWith("iam") || gv.endsWith("ias") || gv.endsWith("iat")) {
						gvs = gv.substring(0,  gv.length()-3);
						new Auswahl(gvs);
					}else if (gv.endsWith("iamus") || gv.endsWith("iatis")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}else if (gv.endsWith("iant")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else {
						tempusPraesensPassivIndikativIKonjugation();
					}
					
					
				}
				
				private void tempusPraesensAktivKonjunktivKonsKonjugation() {
					System.out.println("Pr�sens - Aktiv - Konjunktiv - Kons Konjugation");
					
					gvs = gv.substring(0, gv.length()-4); //"iunt"-Endung
					new Auswahl(gvs);					
				}
	
	

		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--PASSIV::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				private void tempusPraesensPassivIndikativAKonjugation() {
					System.out.println("Pr�sens - Passiv - Indikativ - A Konjugation");
					
					if (gv.endsWith("or")) {
						gvs = gv.substring(0,  gv.length()-2);
						new Auswahl(gvs);
					}else if (gv.endsWith("aris") || gv.endsWith("atur") || gv.endsWith("amur")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("amini") || gv.endsWith("antur")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}else {
						tempusPraesensPassivKonjunktivAKonjugation();
					}
					
				}
				
				private void tempusPraesensPassivIndikativEKonjugation() {
					System.out.println("Pr�sens - Passiv - Indikativ - E Konjugation");
					
					if (gv.endsWith("eor")) {
						gvs = gv.substring(0,  gv.length()-3);
						new Auswahl(gvs);
					}else if (gv.endsWith("eris") || gv.endsWith("etur") || gv.endsWith("emur")){
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("emini") || gv.endsWith("entur")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}else {
						tempusPraesensPassivKonjunktivEKonjugation();
					}
					
				}
				
				private void tempusPraesensPassivIndikativIKonjugation() {
					System.out.println("Pr�sens - Passiv - Indikativ - I Konjugation");
					
					if (gv.endsWith("ior")) {
						gvs = gv.substring(0,  gv.length()-3);
						new Auswahl(gvs);
					}else if (gv.endsWith("iris") || gv.endsWith("itur") || gv.endsWith("imur")){
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("imini")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}else if (gv.endsWith("iuntur")) {
						gvs =gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else {
						tempusPraesensPassivKonjunktivIKonjugation();
					}
					
				}
				
				private void tempusPraesensPassivIndikativKonsKonjugation() {
					System.out.println("Pr�sens - Passiv - Indikativ - Kons Konjugation");
					
					gvs = gv.substring(0, gv.length()-5); //"untur"-Endung
					new Auswahl(gvs);					
				}
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				private void tempusPraesensPassivKonjunktivAKonjugation() {
					System.out.println("Pr�sens - Passiv - Konjunktiv - A Konjugation");
					
					if (gv.endsWith("er")) {
						gvs = gv.substring(0, gv.length()-2);
						new Auswahl(gvs);
					}else if (gv.endsWith("eris") || gv.endsWith("etur") || gv.endsWith("emur")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("emini") || gv.endsWith("entur")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusPraesensPassivKonjunktivEKonjugation() {
					System.out.println("Pr�sens - Passiv - Konjunktiv - E Konjugation");
					
					if (gv.endsWith("ear")) {
						gvs = gv.substring(0,  gv.length()-3);
						new Auswahl(gvs);
					}else if (gv.endsWith("earis") || gv.endsWith("eatur") || gv.endsWith("eamur")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}else if (gv.endsWith("eamini") || gv.endsWith("eantur")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("ar")) {
						gvs = gv.substring(0, gv.length()-2);
						new Auswahl(gvs);
					}else if (gv.endsWith("aris") || gv.endsWith("atur") || gv.endsWith("amur")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("amini") || gv.endsWith("antur")) {
						gvs  = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusPraesensPassivKonjunktivIKonjugation() {
					System.out.println("Pr�sens - Passiv - Konjunktiv - I Konjugation");
					
					if (gv.endsWith("iar")) {
						gvs = gv.substring(0,  gv.length()-3);
						new Auswahl(gvs);
					}else if (gv.endsWith("iaris") || gv.endsWith("iatur") || gv.endsWith("iamur")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}else if (gv.endsWith("iamini") || gv.endsWith("iantur")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}
					
				}
	
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--IMPERFEKT::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--AKTIV::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				private void tempusImperfektAktivIndikativAKonjugation() {
					System.out.println("Imperfekt - Aktiv - Indikativ - A Konjugation");
					
					if (gv.endsWith("abam") || gv.endsWith("abas") || gv.endsWith("abat")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("abamus") || gv.endsWith("abatis")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("abant")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusImperfektAktivIndikativEKonjugation() {
					System.out.println("Imperfekt - Aktiv - Indikativ - E Konjugation");
					
					if (gv.endsWith("ebam") || gv.endsWith("ebas") || gv.endsWith("ebat")) {
						gvs = gv.substring(0,  gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("ebamus") || gv.endsWith("ebatis")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("ebant")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusImperfektAktivIndikativIKonjugation() {
					System.out.println("Imperfekt - Aktiv - Indikativ - I Konjugation");
					
					if (gv.endsWith("iebam") || gv.endsWith("iebas") || gv.endsWith("iebat")) {
						gvs = gv.substring(0,  gv.length()-5);
						new Auswahl(gvs);
					}else if (gv.endsWith("iebamus") || gv.endsWith("iebatis")) {
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}else if (gv.endsWith("iebant")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}
					
				}
				
				
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusImperfektAktivKonjunktivAKonjugation() {
					System.out.println("Imperfekt - Aktiv - Konjunktiv - A Konjugation");
					
					if (gv.endsWith("arem") || gv.endsWith("ares") || gv.endsWith("aret")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("aremus") || gv.endsWith("aretis")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("arent")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusImperfektAktivKonjunktivIKonjugation() {
					System.out.println("Imperfekt - Aktiv - Konjunktiv - E Konjugation");
					
					if (gv.endsWith("eres") || gv.endsWith("erem") || gv.endsWith("eret")) {
						gvs = gv.substring(0,  gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("eremus") || gv.endsWith("eretis")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("erent")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusImperfektAktivKonjunktivEUndKonsKonjugation() {
					System.out.println("Imperfekt - Aktiv - Konjunktiv - I Konjugation");
					
					if (gv.endsWith("ierem") || gv.endsWith("ieres") || gv.endsWith("ieret")) {
						gvs = gv.substring(0,  gv.length()-5);
						new Auswahl(gvs);
					}else if (gv.endsWith("ieremus") || gv.endsWith("ieretis")) {
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}else if (gv.endsWith("ierent")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}
					
				}
	
	

		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--PASSIV::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				private void tempusImperfektPassivIndikativAKonjugation() {
					System.out.println("Imperfekt - Passiv - Indikativ - A Konjugation");
					
					if (gv.endsWith("abar")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("abaris") || gv.endsWith("abatur") || gv.endsWith("abamur")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("abamini") || gv.endsWith("abantur")) {
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusImperfektPassivIndikativIKonjugation() {
					System.out.println("Imperfekt - Passiv - Indikativ - E Konjugation");
					
					if (gv.endsWith("ebar")) {
						gvs = gv.substring(0,  gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("ebaris") || gv.endsWith("ebatur") || gv.endsWith("ebamur")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("abamini") || gv.endsWith("abantur")) {
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusImperfektPassivIndikativEKonjugation() {
					System.out.println("Imperfekt - Passiv - Indikativ - I Konjugation");
					
					if (gv.endsWith("iebar")) {
						gvs = gv.substring(0,  gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("iebaris") || gv.endsWith("iebatur") || gv.endsWith("iebamur")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("iabamini") || gv.endsWith("iabantur")) {
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}
					
				}
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				private void tempusImperfektPassivKonjunktivAKonjugation() {
					System.out.println("Imperfekt - Passiv - Konjunktiv - A Konjugation");
					
					if (gv.endsWith("arer")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("areris") || gv.endsWith("aretur") || gv.endsWith("aremur")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("aremini") || gv.endsWith("arentur")) {
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusImperfektPassivKonjunktivEKonjugation() {
					System.out.println("Imperfekt - Passiv - Konjunktiv - E Konjugation");
					
					if (gv.endsWith("erer")) {
						gvs = gv.substring(0,  gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("ereris") || gv.endsWith("eretur") || gv.endsWith("eremus")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("erentur")) {
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusImperfektPassivKonjunktivIKonjugation() {
					System.out.println("Imperfekt - Passiv - Konjunktiv - I Konjugation");
					
					if (gv.endsWith("ierer")) {
						gvs = gv.substring(0,  gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("iereris") || gv.endsWith("ieretur") || gv.endsWith("ieremus")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("ierentur")) {
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}
					
				}
	
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--FUTURI::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--AKTIV::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusFuturIAktivIndikativAKonjugation() {
					System.out.println("Futur I - Aktiv - Indikativ - A Konjugation");
					
					if (gv.endsWith("abo")){
						gvs = gv.substring(0,  gv.length()-3);
						new Auswahl(gvs);
					}else if (gv.endsWith("abis") || gv.endsWith("abit")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("abimus") || gv.endsWith("abitis")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("abunt")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusFuturIAktivIndikativEKonjugation() {
					System.out.println("Futur I - Aktiv - Indikativ - E Konjugation");
					
					if (gv.endsWith("ebo")) {
						gvs = gv.substring(0,  gv.length()-3);
						new Auswahl(gvs);
					}else if (gv.endsWith("ebis") || gv.endsWith("ebit")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("ebimus") || gv.endsWith("ebitis")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("ebunt")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusFuturIAktivIndikativIKonjugation() {
					System.out.println("Futur I - Aktiv - Indikativ - I Konjugation");
					
					if (gv.endsWith("iam") || gv.endsWith("ies") || gv.endsWith("iet")) {
						gvs = gv.substring(0,  gv.length()-3);
						new Auswahl(gvs);
					}else if (gv.endsWith("iemus") || gv.endsWith("ietis")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}else if (gv.endsWith("ient")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}					
				}
				
				private void tempusFuturIAktivIndikativKonsKonjugation() {
					System.out.println("Futur I - Aktiv - Indikativ - Kons Konjugation");
					
					if (gv.endsWith("am") || gv.endsWith("es") || gv.endsWith("et")) {
						gvs = gv.substring(0,  gv.length()-2);
						new Auswahl(gvs);
					}else if (gv.endsWith("emus") || gv.endsWith("etis")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("ent")) {
						gvs = gv.substring(0, gv.length()-3);
						new Auswahl(gvs);
					}	
					
				}
	

		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--PASSIV::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusFuturIPassivIndikativAKonjugation() {
					System.out.println("Futur I - Passiv - Indikativ - A Konjugation");
					
					if (gv.endsWith("abor")) {
						gvs = gv.substring(0,  gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("aberis") || gv.endsWith("abitur") || gv.endsWith("abimur")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("abimini") || gv.endsWith("abuntur")) {
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}
				}
				
				private void tempusFuturIPassivIndikativEKonjugation() {
					System.out.println("Futur I - Passiv - Indikativ - E Konjugation");
					
					if (gv.endsWith("ebor")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("eberis") || gv.endsWith("ebitur") || gv.endsWith("ebimur")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("ebimini") || gv.endsWith("ebuntur")) {
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusFuturIPassivIndikativIKonjugation() {
					System.out.println("Futur I - Passiv - Indikativ - I Konjugation");
					
					if (gv.endsWith("iar")) {
						gvs = gv.substring(0,  gv.length()-3);
						new Auswahl(gvs);
					}else if (gv.endsWith("ieris") || gv.endsWith("ietur") || gv.endsWith("iemur")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}else if (gv.endsWith("iemini") || gv.endsWith("ientur")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}	
					
				}
				
				private void tempusFuturIPassivIndikativKonsKOnjugation() {
					System.out.println("Futur I - Passiv - Indikativ - Kons Konjugation");
					
					if (gv.endsWith("ar")) {
						gvs = gv.substring(0,  gv.length()-2);
						new Auswahl(gvs);
					}else if (gv.endsWith("eris") || gv.endsWith("etur") || gv.endsWith("emur")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("emini") || gv.endsWith("entur")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}
					
				}

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
	
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--PERFEKT::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--AKTIV::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusPerfektAktivIndikativAKonjugation() {
					System.out.println("Perfekt - Aktiv - Indikativ - A Konjugation");
					
					if (gv.endsWith("avi")) {						
						gvs = gv.substring(0, gv.length()-3);
						new Auswahl(gvs);
					}else if (gv.endsWith("avisti") || gv.endsWith("avimus")) {						
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if(gv.endsWith("avit")) {						
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if(gv.endsWith("avistis") || gv.endsWith("averunt")) {						
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusPerfektAktivIndikativEKonjugation() {
					System.out.println("Perfekt - Aktiv - Indikativ - E Konjugation");
					
					if (gv.endsWith("ui")) {
						gvs = gv.substring(0, gv.length()-2);
						new Auswahl(gvs);
					}else if (gv.endsWith("uisti") || gv.endsWith("uimus") ) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}else if (gv.endsWith("uit")) {
						gvs = gv.substring(0, gv.length()-3);
						new Auswahl(gvs);
					}else if (gv.endsWith("uerunt") || gv.endsWith("uistis")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if(gv.endsWith("si")) {
						gvs = gv.substring(0, gv.length()-2);
						new Auswahl(gvs);
					}else if (gv.endsWith("sisti") || gv.endsWith("simus")){
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}else if (gv.endsWith("sit")){
						gvs = gv.substring(0, gv.length()-3);
						new Auswahl(gvs);
					}else if (gv.endsWith("serunt") || gv.endsWith("sistis")){
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusPerfektAktivIndikativIKonjugation() {
					System.out.println("Perfekt - Aktiv - Indikativ - I Konjugation");
					
					if (gv.endsWith("ivi")) {						
						gvs = gv.substring(0, gv.length()-3);
						new Auswahl(gvs);
					}else if (gv.endsWith("ivisti") || gv.endsWith("ivimus")) {						
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if(gv.endsWith("ivit")) {						
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if(gv.endsWith("ivistis") || gv.endsWith("iverunt")) {						
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusPerfektAktivIndikativKonsKonjugation() {
					System.out.println("Perfekt - Aktiv - Indikativ - Kons Konjugation");
					
					//TODO
					
				}
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				private void tempusPerfektAktivKonjunktivAKonjugation() {
					System.out.println("Perfekt - Aktiv - Konjunktiv - A Konjugation");
					
					if (gv.endsWith("averim")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("averitis") || gv.endsWith("averimus")) {
						gvs = gv.substring(0, gv.length()-8);
						new Auswahl(gvs);
					}else if (gv.endsWith("averis") || gv.endsWith("averit")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("averint")) {
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}else if (gv.endsWith("avero")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusPerfektAktivKonjunktivEKonjugation() {
					System.out.println("Perfekt - Aktiv - Konjunktiv - E Konjugation");
					
					if (gv.endsWith("uerim") || gv.endsWith("ueris") || gv.endsWith("uerit")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}else if (gv.endsWith("uerimus") || gv.endsWith("ueritis")) {
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}else if (gv.endsWith("uerint")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("serim") || gv.endsWith("seris") || gv.endsWith("serit")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}else if (gv.endsWith("serimus") || gv.endsWith("seritis")) {
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}else if (gv.endsWith("serint")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusPerfektAktivKonjunktivIKonjugation() {
					System.out.println("Perfekt - Aktiv - Konjunktiv - I Konjugation");
					
					if (gv.endsWith("iverim")) {						
						gvs = gv.substring(0, gv.length()-3);
						new Auswahl(gvs);
					}else if (gv.endsWith("iverisi") || gv.endsWith("iverimus")) {						
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if(gv.endsWith("iverit")) {						
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if(gv.endsWith("iveritis") || gv.endsWith("iverunt")) {						
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusPerfektAktivKonjunktivKonsKonjugation() {
					System.out.println("Perfekt - Aktiv - Konjunktiv - Kons Konjugation");
					
					//TODO
					
				}
	

		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--PASSIV::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusPerfektPassivIndikativ() {
					System.out.println("Pr�sens - Passiv - Indikativ");
					
					if (gv.endsWith(" sum") || gv.endsWith(" est")) {
						if (gv.substring(0, gv.length()-4).endsWith("atus")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-4).endsWith("itus")){
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-4).endsWith("tus")) {
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-4).endsWith("sus")){
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);								
						}else if (gv.substring(0, gv.length()-4).endsWith("us")) {
							gvs = gv.substring(0, gv.length()-6);
							new Auswahl(gvs);
						}
					}else if (gv.endsWith(" es")) {
						if (gv.substring(0, gv.length()-3).endsWith("atus")) {
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-3).endsWith("itus")){
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-3).endsWith("tus")) {
							gvs = gv.substring(0, gv.length()-6);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-3).endsWith("sus")){
							gvs = gv.substring(0, gv.length()-6);
							new Auswahl(gvs);						
						}else if (gv.substring(0, gv.length()-4).endsWith("us")) {
							gvs = gv.substring(0, gv.length()-5);
							new Auswahl(gvs);
						}
					}else if (gv.endsWith(" sumus") || gv.endsWith(" estis")) {
						if (gv.substring(0, gv.length()-6).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("iti")) {
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("si")){
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);									
						}else if (gv.substring(0, gv.length()-6).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);
						}
					}else if (gv.endsWith(" sunt")) {
						if (gv.substring(0, gv.length()-5).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("iti")){
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("si")){
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);								
						}else if (gv.substring(0, gv.length()-5).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-6);
							new Auswahl(gvs);
						}	
					}					
					
				}
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusPerfektPassivKonjunktiv() {
					System.out.println("Perfekt - Passiv - Konjunktiv");
					
					if (gv.endsWith(" sim") || gv.endsWith(" sis") || gv.endsWith(" sit")) {
						if (gv.substring(0, gv.length()-4).endsWith("atus")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-4).endsWith("itus")){
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-4).endsWith("tus")) {
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-4).endsWith("sus")){
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);
						}else if(gv.substring(0, gv.length()-4).endsWith("us")) {
							gvs = gv.substring(0, gv.length()-6);
							new Auswahl(gvs);
						}
					}else if (gv.endsWith(" simus") || gv.endsWith(" sitis")) {
						if (gv.substring(0, gv.length()-6).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("iti")){
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("si")){
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);
						}
					}else if (gv.endsWith(" sint")) {
						if (gv.substring(0, gv.length()-5).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("iti")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("si")){
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-6);
							new Auswahl(gvs);
						}
					}
					
				}
	
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--PLUSQUAMPERFEKT::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--AKTIV::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--

				private void tempusPlusquamperfektAktivIndikativAKonjugation() {
					System.out.println("Plusquamperfekt - Aktiv - Indikativ - A Konjugation");
					
					if (gv.endsWith("averam") || gv.endsWith("averas") || gv.endsWith("averat") ) {						
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);						
					}else if(gv.endsWith("averamus") || gv.endsWith("averatis")) {						
						gvs = gv.substring(0, gv.length()-8);
						new Auswahl(gvs);						
					}else if(gv.endsWith("averant")) {						
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusPlusquamperfektAktivIndikativEKonjugation() {
					System.out.println("Plusquamperfekt - Aktiv - Indikativ - E Konjugation");
					
					if (gv.endsWith("ueram") || gv.endsWith("ueras") || gv.endsWith("uerat")) {						
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);						
					}else if (gv.endsWith("ueramus") || gv.endsWith("ueratis")) {
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);						
					}else if(gv.endsWith("uerant")) {						
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);						
					}else if (gv.endsWith("seram") || gv.endsWith("seras") || gv.endsWith("serat")) {
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);
					}else if (gv.endsWith("seramus") || gv.endsWith("seratis")) {
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}else if (gv.endsWith("serant")){
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusPlusquamperfektAktivIndikativIKonjugation() {
					System.out.println("Plusquamperfekt - Aktiv - Indikativ - I Konjugation");
					
					if (gv.endsWith("iveram") || gv.endsWith("iveras") || gv.endsWith("iverat")) {						
						gvs = gv.substring(0, gv.length()-5);
						new Auswahl(gvs);						
					}else if(gv.endsWith("iveramus") || gv.endsWith("iveratis")) {						
						gvs=gv.substring(0, gv.length()-7);
						new Auswahl(gvs);						
					}else if(gv.endsWith("iverant")) {						
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}
					
				}
				
				private void tempusPlusquamperfektAktivIndikativKonsKonjugation() {
					System.out.println("Plusquamperfekt - Aktiv - Indikativ - Kons Konjugation");
					
					//TODO
					
				}

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusPlusquamperfektAktivKonjunktivAKonjugation() {
					System.out.println("Plusquamperfekt - Aktiv - Konjunktiv - A Konjugation");
					
					if (gv.endsWith("avissem") || gv.endsWith("avisses") || gv.endsWith("avisset")) {						
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);						
					}else if (gv.endsWith("avissemus") || gv.endsWith("avissetis")) {						
						gvs = gv.substring(0, gv.length()-9);
						new Auswahl(gvs);						
					}else if(gv.endsWith("avissent")) {						
						gvs = gv.substring(0, gv.length()-8);
						new Auswahl(gvs);						
					}
					
				}
				
				private void tempusPlusquamperfektAktivKonjunktivEKonjugation() {
					System.out.println("Pr�sens - Aktiv - Konjunktiv - A Konjugation");
					
					if (gv.endsWith("uissem") || gv.endsWith("uisses") || gv.endsWith("uisset")) {						
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);						
					}else if (gv.endsWith("uissemus") || gv.endsWith("uissetis")) {						
						gvs = gv.substring(0, gv.length()-8);
						new Auswahl(gvs);						
					}else if (gv.endsWith("uissent")) {						
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}else if (gv.endsWith("sissem") || gv.endsWith("sisses") || gv.endsWith("sisset")) {
						gvs = gv.substring(0, gv.length()-6);
						new Auswahl(gvs);
					}else if (gv.endsWith("sissemus") || gv.endsWith("sissetis")) {
						gvs = gv.substring(0, gv.length()-8);
						new Auswahl(gvs);
					}else if (gv.endsWith("sissent")) {
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);
					}	
					
				}
				
				private void tempusPlusquamperfektAktivKonjunktivIKonjugation() {
					System.out.println("Pr�sens - Aktiv - Konjunktiv - A Konjugation");
					
					if (gv.endsWith("ivissem") || gv.endsWith("ivisses") || gv.endsWith("ivisset")) {						
						gvs = gv.substring(0, gv.length()-7);
						new Auswahl(gvs);						
					}else if (gv.endsWith("ivissemus") || gv.endsWith("ivissetis")) {						
						gvs = gv.substring(0, gv.length()-9);
						new Auswahl(gvs);						
					}else if(gv.endsWith("ivissent")) {						
						gvs = gv.substring(0, gv.length()-8);
						new Auswahl(gvs);						
					}
					
				}
				
				private void tempusPlusquamperfektAktivKonjunktivKonsKonjugation() {
					System.out.println("Pr�sens - Aktiv - Konjunktiv - A Konjugation");
					
					//TODO
					
				}
	

		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--PASSIV::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusPlusquamperfektPassivIndikativ() {
					System.out.println("Plusquamperfekt - Passiv - Indikativ");
					
					if (gv.endsWith(" eram") ||gv.endsWith(" erat") || gv.endsWith(" eras")) {
						if (gv.substring(0, gv.length()-5).endsWith("atus")) {
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("itus")) {
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("tus")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("sus")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if(gv.substring(0, gv.length()-5).endsWith("us")) {
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);					
						}
					}else if (gv.endsWith(" eramus") || gv.endsWith(" eratis")) {
						if (gv.substring(0, gv.length()-7).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-10);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("iti")) {
							gvs = gv.substring(0, gv.length()-10);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("si")) {
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}
					}else if(gv.endsWith(" erant")) {
						if (gv.substring(0, gv.length()-6).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("iti")){
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("si")){
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);
						}
					}
					
				}
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusPlusquamperfektPassivKonjunktiv() {
					System.out.println("Plusquamperfekt - Passiv - Konjunktiv");
					
					if (gv.endsWith(" essem") || gv.endsWith(" esses") || gv.endsWith(" esset")) {
						if (gv.substring(0, gv.length()-6).endsWith("atus")) {
							gvs = gv.substring(0, gv.length()-10);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("itus")){
							gvs = gv.substring(0, gv.length()-10);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("tus")) {
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("sus")){
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("us")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}
					}else if (gv.endsWith(" essemus") || gv.endsWith(" essetis")) {
						if (gv.substring(0, gv.length()-8).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-11);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-8).endsWith("iti")){
							gvs = gv.substring(0, gv.length()-11);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-8).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-10);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-8).endsWith("si")){
							gvs = gv.substring(0, gv.length()-10);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-8).endsWith("si")) {
							gvs = gv.substring(0, gv.length()-10);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-8).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}
					}else if (gv.endsWith(" essent")) {
						if (gv.substring(0, gv.length()-7).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-10);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("iti")){
							gvs =gv.substring(0, gv.length()-10);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("si")){
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}
					}
					
				}
	
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--FUTUR II::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--AKTIV::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				/* Methode nicht vorhanden, da Endungen identich mit:
				 * tempusPerfektAktivKonjunktiv 
				 */
	
	

		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--PASSIV::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusFuturIIPassivIndikativ() {
					System.out.println("Futur II - Passiv - Indikativ");
					
					if (gv.endsWith(" ero")) {
						if (gv.substring(0, gv.length()-4).endsWith("atus")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-4).endsWith("itus")){
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-4).endsWith("tus")) {
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-4).endsWith("sus")){
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-4).endsWith("us")) {
							gvs = gv.substring(0, gv.length()-6);
							new Auswahl(gvs);
						}
					}else if (gv.endsWith(" eris") || gv.endsWith(" erit")) {
						if (gv.substring(0, gv.length()-5).endsWith("atus")) {
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("itus")){
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("tus")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("sus")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("us")) {
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);
						}
					}else if (gv.endsWith(" erimus") || gv.endsWith(" eritis")) {
						if (gv.substring(0, gv.length()-7).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-10);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("iti")){
							gvs = gv.substring(0, gv.length()-10);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if(gv.substring(0, gv.length()-7).endsWith("si")) {
							gvs = gv.substring(0,  gv.length() - 9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("i")) {						
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}
					}else if (gv.endsWith(" erunt")) {
						if (gv.substring(0, gv.length()-6).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("iti")){
							gvs = gv.substring(0, gv.length()-9);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("si")){
							gvs =gv.substring(0,  gv.length()-8);
							new Auswahl(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-7);
							new Auswahl(gvs);
						}
					}
					
				}
}