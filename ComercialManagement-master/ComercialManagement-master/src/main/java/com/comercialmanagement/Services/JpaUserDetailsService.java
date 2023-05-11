package com.comercialmanagement.Services;


import com.comercialmanagement.Models.SecurityUser;
import com.comercialmanagement.Repository.JpaUserDetailsRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JpaUserDetailsService implements UserDetailsService {

    private JpaUserDetailsRepository jpaUserDetailsRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        var user=jpaUserDetailsRepository.findByUsername(username);
        return user.map(SecurityUser::new).orElseThrow(()->new UsernameNotFoundException("User Not found: "+username));
    }
}
