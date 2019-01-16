package id.go.pajak.iht.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	
	private Collection<? extends GrantedAuthority> authorities;
	private String password;
	private String username;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return authorities;
	}
	
	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		
		this.authorities = authorities;
	}

	@Override
	public String getPassword() {
		
		return password;
	}

	public void setUsername(String username) {
		
		this.username = username;
	}
	
	@Override
	public String getUsername() {
		
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
