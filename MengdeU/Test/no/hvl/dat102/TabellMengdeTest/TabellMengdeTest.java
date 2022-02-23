package no.hvl.dat102.TabellMengdeTest;

import no.hvl.dat102.MengdeADTTest.MengdeADTTest;
import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.tabell.TabellMengde;

class TabellMengdeTest extends MengdeADTTest{

	@Override
	protected MengdeADT<Integer> reset() {
		return new TabellMengde<>();
	}

}
