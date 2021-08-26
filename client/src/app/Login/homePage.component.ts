import { Component } from "@angular/core";
import { Router } from "@angular/router";



@Component({
    selector: 'app-homePage',
    template: `
        <div>
        <h1>Welcome Home!</h1>
        
        <ul>
        <li><a routerLink="">Home Page</a></li>
        <li><a routerLink="employee">Employees</a></li>
        </ul>
        <button (click)="logout()">LogOut</button>
        </div>
     `

})
export class HomePageComponent{

    constructor( private router:Router){}

    logout(){
        localStorage.clear()
        this.router.navigate(['login'])
    }

}