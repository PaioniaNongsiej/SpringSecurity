package com.example.LoginSecurity1.Service;

import com.example.LoginSecurity1.Entity.User;

public interface UserService {
	public void increaseFailedAttempt(User user);
	public void resetAttempt(String email);
	public void lock(User user);
	public boolean unlockAccountTimeExpired(User user);
}
