package com.example.LoginSecurity1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LoginSecurity1.Dto.BusinessDto;
import com.example.LoginSecurity1.Entity.RegisterBusiness;
import com.example.LoginSecurity1.Repository.BusinessRepository;

@Service
public class ImplBusinessService implements BusinessService {
	@Autowired
	BusinessRepository businessRepository;
	
	@Override
	public String addBusiness(BusinessDto businessDto) {
		RegisterBusiness register = new RegisterBusiness(
				businessDto.getId(),
                businessDto.getName(),
                businessDto.getOwner(),
                businessDto.getType(),
                businessDto.getEmail()
        );
		businessRepository.save(register);
        return register.getName();
	}
	BusinessDto businessDto;
}
