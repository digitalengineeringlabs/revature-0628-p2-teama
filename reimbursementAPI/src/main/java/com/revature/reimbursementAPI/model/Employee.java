package com.revature.reimbursementAPI.model;

import javax.persistence.*;

 
@Entity
@Table(name="employee", schema="reimbursementschema")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_id;

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
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.role = role;
	}

//	public Employee(String username, String password, String role) {
//		super();
//		this.username = username;
//		this.password = password;
//		this.role = role;
//	}

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

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	
	    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

		@Override
	    public String toString() {
	        return "User [id=" + employee_id + ", username=" + username + ", password=" + password + "]";
	    }

}