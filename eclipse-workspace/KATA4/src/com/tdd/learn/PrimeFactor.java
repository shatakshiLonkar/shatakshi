package com.tdd.learn;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor implements FindFactors 
{

	@Override
	public List<Integer> getFactor(int number)
	{
		List<Integer> pFact=new ArrayList<Integer>();
		// TODO Auto-generated method stub
		if(number==1)
			pFact=null;
		if(number%2==0)
		{
			pFact.add(2);
		number/=2;
	}
		if(number>1)
			pFact.add(number);
		return pFact;
	}

}
