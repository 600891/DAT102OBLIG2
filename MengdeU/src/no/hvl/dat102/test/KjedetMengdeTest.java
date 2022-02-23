package no.hvl.dat102.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;

class KjedetMengdeTest extends MengdeADTTest{

	@Override
	protected MengdeADT<Integer> reset() {
		return new KjedetMengde<Integer>();
	}

}
