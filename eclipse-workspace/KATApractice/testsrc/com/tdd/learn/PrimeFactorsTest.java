package com.tdd.learn;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimeFactorsTest {
	PrimeFactors aFact;

	@BeforeEach
	void setUp() throws Exception 
	{
		aFact=new PrimeFactors();
	}
	List<Integer> getFactor(int... number)
	{
		List<Integer>gFact=new ArrayList<Integer>();
		for(int i:number)
			gFact.add(i);
		return gFact;
	}
	@Test
	void testGetFactors01() {
		assertEquals(null,aFact.getFactors(1))	;
		}
	@Test
	void testGetFactors02() {
		assertEquals(getFactor(2),aFact.getFactors(2))	;
		}
	@Test
	void testGetFactors03() {
		assertEquals(getFactor(3),aFact.getFactors(3))	;
		}
	@Test
	void testGetFactors04() {
		assertEquals(getFactor(2,2),aFact.getFactors(4))	;
		}
	@Test
	void testGetFactors05() {
		assertEquals(getFactor(2,2,2),aFact.getFactors(8))	;
		}
	@Test
	void testGetFactors06() {
		assertEquals(getFactor(3,3),aFact.getFactors(9))	;
		}
	@Test
	void testGetFactors07() {
		assertEquals(getFactor(3,3,3,47),aFact.getFactors(1269))	;
		}

}
