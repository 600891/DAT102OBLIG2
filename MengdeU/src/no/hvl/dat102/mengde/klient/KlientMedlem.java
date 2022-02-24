package no.hvl.dat102.mengde.klient;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class KlientMedlem {
	public static void main (String[] args) {
		MengdeADT<Hobby> hobbyMengde1 = new TabellMengde<>();
		MengdeADT<Hobby> hobbyMengde2 = new TabellMengde<>();
		
		hobbyMengde1.leggTil(new Hobby("tegne"));
		hobbyMengde1.leggTil(new Hobby("male"));
		hobbyMengde2.leggTil(new Hobby("bryting"));
		hobbyMengde2.leggTil(new Hobby("ski"));
		
		Medlem nora = new Medlem("Nora", hobbyMengde1);
		Medlem oda = new Medlem("Oda", hobbyMengde1);
		Medlem siri = new Medlem("Siri", hobbyMengde2);
		Medlem aurora = new Medlem("Aurora", hobbyMengde2);
		
		TabellMengde<Medlem> medlemTab = new TabellMengde<>();
		medlemTab.leggTil(nora);
		medlemTab.leggTil(oda);
		medlemTab.leggTil(siri);
		medlemTab.leggTil(aurora);
		
		Datakontakt kontakt = new Datakontakt(medlemTab);
		kontakt.finnPartnerFor("Nora");
		medlemData(nora);
		medlemData(siri);
		kontakt.tilbakestillStatusIndeks("Oda");
		medlemData(oda);
		

	}
	public static void medlemData(Medlem medlem) {
		System.out.println(medlem.toString());
	}
}
