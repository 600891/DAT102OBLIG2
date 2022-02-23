package no.hvl.dat102.mengde.klient;

import no.hvl.dat102.mengde.adt.MengdeADT;

public class Medlem {
	private String navn;
	private MengdeADT<Hobby> hobbyer;
	private int statusIndeks;

	public Medlem(String navn, MengdeADT<Hobby> hobbyer, int status) {
		this.navn = navn;
		this.hobbyer = hobbyer;
		this.statusIndeks = status;
	}
}
