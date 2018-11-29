package com.tdd.learn;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimeFactorsTest 
{
	PrimeFactors aFact;
	@BeforeEach
	void setUp() throws Exception
	{
		aFact=new PrimeFactors();
	}
	List<Integer> getfactors(int... number)
	{
		List<Integer> gFact=new ArrayList<Integer>();
		for(int NO:number)
			gFact.add(NO);
		return gFact;
	}
	@Test
	void testGetFactos01() {
		assertEquals(null,aFact.getFactos(1));
	}
	@Test
	void testGetFactos02() {
		assertEquals(getfactors(2),aFact.getFactos(2));
	}

	@Test
	void testGetFactos03() {
	assertEquals(getfactors(3),aFact.getFactos(3));
}
	@Test
	void testGetFactos04() {
	assertEquals(getfactors(2,2),aFact.getFactos(4));
}

	@Test
	void testGetFactos05() {
	assertEquals(getfactors(2,2,2),aFact.getFactos(8));
}
	@Test
	void testGetFactos06() {
	assertEquals(getfactors(3,3),aFact.getFactos(9));
}
	@Test
	void testGetFactos07() {
	assertEquals(getfactors(3,3,3,47),aFact.getFactos(1269));
}

}
