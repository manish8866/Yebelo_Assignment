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
		1>10
		10>19>1+9=10>1+0=1
		19>28->2+9=10>1+0=1
		28>37
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
	    return sum;
	}
	@Autowired
	private EntityManager entityManager;
	@Autowired
	private YebeloRepository yebeloRepository;
	public EntityClass getNumbers(Integer categoryCode) {
		EntityClass oldEntity=yebeloRepository.getById(categoryCode);
		int oldnum=oldEntity.getNewNumber();
		
		return null;
	}

}
