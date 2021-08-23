package com.revature.reimbursementAPI.model;

import javax.persistence.*;

//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
// 
@Entity
@Table(name="employee", schema="reimbursementschema")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="first_name")
	private String firstName;
    @Column(name="last_name")
	private String lastName;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String role;

	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String username, String password, String role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public Employee(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
//	@Override
//    public Set<? extends GrantedAuthority> getAuthorities() {
//        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
//        authorities.add(new SimpleGrantedAuthority(role));
//        return authorities;
//    }
//	 
//		public String getRole() {
//			return role;
//		}
//
//		public void setRole(String role) {
//			this.role = role;
//		}
//	
//	 @Override
//	    public boolean isAccountNonExpired() {
//	        return true;
//	    }
//	 
//	    @Override
//	    public boolean isAccountNonLocked() {
//	        return true;
//	    }
//	 
//	    @Override
//	    public boolean isCredentialsNonExpired() {
//	        return true;
//	    }
//	 
//	    @Override
//	    public boolean isEnabled() {
//	        return true;
//	    }
	 
	    @Override
	    public String toString() {
	        return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	    }

}
