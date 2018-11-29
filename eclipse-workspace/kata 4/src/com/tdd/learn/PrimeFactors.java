package com.tdd.learn;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors implements FindFactors 
{
	PrimeFactors aFact;
	@Override
	
	public List<Integer> getFactors(int number) 
	{
		// TODO Auto-generated method stub
		List<Integer> aFact=new ArrayList<Integer>();
		if(number==1)
			aFact=null;
		return aFact;
	}

}
