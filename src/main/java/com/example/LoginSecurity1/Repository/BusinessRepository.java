package com.example.LoginSecurity1.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.LoginSecurity1.Entity.RegisterBusiness;

@Repository
public interface BusinessRepository extends JpaRepository<RegisterBusiness, Long>{
	RegisterBusiness findByEmail(String email);
}
