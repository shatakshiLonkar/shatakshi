package com.tdd.learn;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimeFactorsTest 
{
	PrimeFactors pFact;
	@BeforeEach
	void setUp() throws Exception
	{
		pFact=new PrimeFactors();
	}
	List<Integer> getFactor(int... number)
	{
		List<Integer> gFact=new ArrayList<Integer>();
		for (int i:number)
			gFact.add(i);
		return gFact;
	}

	@Test
	void testGetFactors01()
	{
		assertEquals(null,pFact.getFactors(1));
	}
	@Test
	void testGetFactors02()
	{
		assertEquals(getFactor(2),pFact.getFactors(2));
	}

	@Test
	void testGetFactors03()
		{
		assertEquals(getFactor(3),pFact.getFactors(3));
}
	@Test
	void testGetFactors04()
		{
		assertEquals(getFactor(2,2),pFact.getFactors(4));
}

}
