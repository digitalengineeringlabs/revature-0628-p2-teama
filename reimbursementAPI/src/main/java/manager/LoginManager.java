package manager;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.revature.reimbursementAPI.model.Employee;


public interface LoginManager{
		
	public Employee findbyUserAndPass(String username, String password);

	public Employee create(@Valid Employee emp);
	
}
