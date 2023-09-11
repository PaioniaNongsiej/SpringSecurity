package com.example.LoginSecurity1.Dto;


public class BusinessDto {
	private Long id;

    private String name;

    private String type;
    
    private String owner;
    
    private String email;

	public BusinessDto(Long id, String name, String type, String owner, String email) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.owner = owner;
		this.email = email;
	}

	@Override
	public String toString() {
		return "BusinessDto [id=" + id + ", name=" + name + ", type=" + type + ", owner=" + owner + ", email=" + email
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    
}
