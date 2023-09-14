package com.example.LoginSecurity1.Security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.LoginSecurity1.Entity.User;
import com.example.LoginSecurity1.Repository.UserRepository;
import com.example.LoginSecurity1.Service.UserService;

@Service
public class CustomUserDetailsService implements UserDetailsService, UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String usernameOrEmail)
            throws UsernameNotFoundException {
        // Let people login with either username or email
        User user = userRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail)
                .orElseThrow(() -> 
                        new UsernameNotFoundException("User not found with username or email : " + usernameOrEmail)
        );

        return UserPrincipal.create(user);
    }

    // This method is used by JWTAuthenticationFilter
    @Transactional
    public UserDetails loadUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(
            () -> new UsernameNotFoundException("User not found with id : " + id)
        );

        return UserPrincipal.create(user);
    }

    //private static final long lock_duration_time = 1 * 60 * 60 *1000;
    private static final long lock_duration_time = 60000;
    
    
	@Override
	public void increaseFailedAttempt(User user) {
		int attempt = user.getFailedAttempt()+1;
		userRepository.updateFailedAttempt(attempt,  user.getEmail());
		
	}

	@Override
	public void resetAttempt(String email) {
		userRepository.updateFailedAttempt(0, email);
		
	}

	@Override
	public void lock(User user) {
		user.setAccountNonLocked(false);
		user.setLocktime(new Date());
		userRepository.save(user);
		
	}

	@Override
	public boolean unlockAccountTimeExpired(User user) {
		long lockTimeInMills = user.getLocktime().getTime();
		long currentTimeInMills = System.currentTimeMillis();
		if(lockTimeInMillis)
		return false;
		
	}
    
    
}
