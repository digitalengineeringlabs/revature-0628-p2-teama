import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './Login/login.component';
import { EmployeeComponent } from './employee/employee.component';


const routes:Routes = [
  {path: 'login', component: LoginComponent}, 
  {path: 'employees', component: EmployeeComponent}
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
