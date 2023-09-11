package com.example.LoginSecurity1.Controller;


public class BusinessRequest {
	
    private String BusinessName;

    private String BusinessType;
    
    private String BusinessOwner;

	public String getBusinessName() {
		return BusinessName;
	}

	public void setBusinessName(String businessName) {
		BusinessName = businessName;
	}

	public String getBusinessType() {
		return BusinessType;
	}

	public void setBusinessType(String businessType) {
		BusinessType = businessType;
	}

	public String getBusinessOwner() {
		return BusinessOwner;
	}

	public void setBusinessOwner(String businessOwner) {
		BusinessOwner = businessOwner;
	}
       
}
