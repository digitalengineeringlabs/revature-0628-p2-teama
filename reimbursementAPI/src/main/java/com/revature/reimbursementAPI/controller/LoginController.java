package com.revature.reimbursementAPI.controller;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.reimbursementAPI.manager.LoginManager;
import com.revature.reimbursementAPI.model.Employee;

@RestController
@RequestMapping(path="/login")
public class LoginController {

	@Autowired
	private LoginManager manager;

//	@Autowired
//	private EmployeeManager er;

	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(consumes="application/json", produces="application/json")
	public Employee findbyUsernameAndPassword(@RequestBody Employee e) {
		System.out.println();
		return manager.findByUsernameAndPassword(e.getUsername(), e.getPassword());
	}

//	@GetMapping(produces="application/json")
//	public List<Employee> getAllEmployees(){
//		return manager.findAll();
//	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path="/r", consumes="application/json", produces="application/json")
	public Employee create(@Valid @RequestBody Employee emp) {
		System.out.println("new user created!");
		return manager.create(emp);
	}
//
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public Map<String, String> handleValidationExceptions(
//	  MethodArgumentNotValidException ex) {
//	    Map<String, String> errors = new HashMap<>();
//	    ex.getBindingResult().getAllErrors().forEach((error) -> {
//	        String fieldName = ((FieldError) error).getField();
//	        String errorMessage = error.getDefaultMessage();
//	        errors.put(fieldName, errorMessage);
//	    });
//	    return errors;
//	}


//    @Bean(name = "pwdEncoder")
//    public PasswordEncoder getPasswordEncoder() {
//        DelegatingPasswordEncoder delPasswordEncoder = (DelegatingPasswordEncoder) PasswordEncoderFactories
//                .createDelegatingPasswordEncoder();
//        BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
//        delPasswordEncoder.setDefaultPasswordEncoderForMatches(bcryptPasswordEncoder);
//        return delPasswordEncoder;
//    }
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		http
//				.authorizeRequests()
//				.antMatchers("/index.html")
//				.hasAnyRole("role","Manager")
//				.antMatchers("/admin/admin.html")
//				.hasRole("Manager")
//				.and()
//				.formLogin()
//
//				.and()
//				.logout();
//
//	}
}