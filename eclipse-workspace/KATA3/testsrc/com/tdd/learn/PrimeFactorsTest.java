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
	List<Integer> getfactor(int...number)
	{
		List<Integer> gFact=new ArrayList<Integer>();
		for(int no:number)
			gFact.add(no);
		return gFact;
	}

	@Test
	void testGetFactors01() 
	{
		assertEquals(null,aFact.getFactors(1));
	}
	@Test
	void testGetFactors02() 
	{
		assertEquals(getfactor(2),aFact.getFactors(2));
	}
	@Test
	void testGetFactors03() 
	{
		assertEquals(getfactor(3),aFact.getFactors(3));
	}
	@Test
	void testGetFactors04() 
	{
		assertEquals(getfactor(2,2),aFact.getFactors(4));
	}
	@Test
	void testGetFactors05() 
	{
		assertEquals(getfactor(2,2,2),aFact.getFactors(8));
	}
	@Test
	void testGetFactors06() 
	{
		assertEquals(getfactor(3,3),aFact.getFactors(9));
	}
	@Test
	void testGetFactors07() 
	{
		assertEquals(getfactor(3,3,3,47),aFact.getFactors(1269));
	}
	

}
