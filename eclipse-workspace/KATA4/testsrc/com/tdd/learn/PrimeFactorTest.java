package com.tdd.learn;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimeFactorTest 
{
	PrimeFactor aFact;
	@BeforeEach
	void setUp() throws Exception
	{
		aFact=new PrimeFactor();
	}
	List<Integer> getFactor(int... number)
	{
		List<Integer> gFact=new ArrayList<Integer>();
		for(int i:number)
			gFact.add(i);
		return gFact;
	}

	@Test
	void testGetFactor01() 
	{
		assertEquals(null,aFact.getFactor(1));
	}
	@Test
	void testGetFactor02() 
	{
		assertEquals(getFactor(2),aFact.getFactor(2));
	}
	@Test
	void testGetFactor03() 
	{
		assertEquals(getFactor(3),aFact.getFactor(3));
	}
	@Test
	void testGetFactor04() 
	{
		assertEquals(getFactor(2,2),aFact.getFactor(4));
	}

}
