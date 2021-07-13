package com.example.yebelo.services;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.yebelo.dao.YebeloRepository;
import com.example.yebelo.entity.EntityClass;

@Service
public class YebeloService {

	public Integer generateNewNumber(Integer n)
	{
		n=n+1;
		int sum = 0;
	    
	    // Loop to do sum while
	    // sum is not less than
	    // or equal to 9
	    while(n > 0 || sum > 9)
	    {
	        if(n == 0)
	        {
	            n = sum;
	            sum = 0;
	        }
	        sum += n % 10;
	        n /= 10;
	    }
	    if(sum!=1)
	    	sum=generateNewNumber(n+2);
	    return n;
	}
	@Autowired
	private EntityManager entityManager;
	@Autowired
	private YebeloRepository yebeloRepository;
	public EntityClass getNumbers(Integer categoryCode) {
		EntityClass oldEntity=yebeloRepository.getById(categoryCode);
		int oldnum=oldEntity.getNewNumber();
		System.out.println(oldnum);
		return null;
	}

}
