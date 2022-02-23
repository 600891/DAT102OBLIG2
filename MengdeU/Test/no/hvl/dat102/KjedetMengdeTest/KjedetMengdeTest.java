package no.hvl.dat102.KjedetMengdeTest;

import no.hvl.dat102.MengdeADTTest.MengdeADTTest;
import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;

class KjedetMengdeTest extends MengdeADTTest{

	@Override
	protected MengdeADT<Integer> reset() {
		return new KjedetMengde<>();
	}

}
