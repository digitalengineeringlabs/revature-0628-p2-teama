package com.revature.reimbursementAPI.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.reimbursementAPI.model.Employee;

import com.revature.reimbursementAPI.manager.LoginManager;

import com.revature.reimbursementAPI.manager.EmployeeManager;

@RestController
@RequestMapping(path="/auth")
public class LoginController {

	@Autowired
	private LoginManager manager;

	@Autowired
	private EmployeeManager er;

	@PostMapping(consumes="application/json", produces="application/json")
	public Employee findbyUserAndPass(String username, String password) {
		System.out.println();
		return manager.findbyUserAndPass(username, password);
	}

	@GetMapping(produces="application/json")
	public List<Employee> getAllEmployees(){
		return er.findAll();
	}

	@PostMapping(consumes="application/json", produces="application/json")
	public Employee create(@Valid @RequestBody Employee emp) {
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