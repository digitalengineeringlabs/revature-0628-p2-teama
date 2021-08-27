import { HttpClient } from "@angular/common/http";
import { Component } from "@angular/core";
import { NgForm } from "@angular/forms";
import { Router } from "@angular/router";
import { Login } from "../login";
import { LoginService } from "../login.service";

@Component({
selector: 'app-login',
templateUrl: './login.component.html'

})
export class LoginComponent {

  login: Login[] = [];

  success = "";

  constructor(private loginService: LoginService, private router: Router) { }


    ngOnInit(): void {

    }

    onSubmit(form:NgForm) {
    /*loginForm(login:Login,  username:string, password:string): void {*/
       this.loginService.login(JSON.stringify({username:form.value.username,password:form.value.password}))
         .subscribe(user => 
          console.log("success")
          //this.router.navigate([''])
        );
     }
    }
      /*
      onSubmit(form:NgForm){
        console.log(form);
        this.http.post('http://localhost:8080/login',
            JSON.stringify({username:form.value.username,password:form.value.password}))
            .subscribe({
                next: (data:any)=>{
                    if(data.status === 'success') {
                        localStorage.setItem("username", form.value.username);
                    }
                    this.router.navigate([''])
                }
            })
    }
  }*/

          


