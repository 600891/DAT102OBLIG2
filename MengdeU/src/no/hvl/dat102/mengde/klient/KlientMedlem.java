package no.hvl.dat102.mengde.klient;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class KlientMedlem {
	public static void main (String[] args) {
		MengdeADT<Hobby> medlem1 = new TabellMengde<>();
		MengdeADT<Hobby> medlem2 = new TabellMengde<>();

		Hobby tegne = new Hobby("tegne");
		Hobby keramikk = new Hobby("keramikk");

		medlem1.leggTil(keramikk);
		medlem2.leggTil(tegne);
		medlem2.leggTil(keramikk);
		medlemData(medlem1);
		medlemData(medlem2);

	}
	public static void medlemData(MengdeADT<Hobby> medlem) {
		System.out.println(medlem.toString());
	}
}
