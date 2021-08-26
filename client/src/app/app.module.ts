import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http'
import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { LoginComponent } from './Login/login.component';
import { HomePageComponent } from './Login/homePage.component';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './Login/auth.guard';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';

const routes:Routes = [
  { path: 'login', component: LoginComponent, canActivate: [AuthGuard], children: 
  [{ path: 'employee', component: EmployeeComponent}]},
  
]
@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    LoginComponent,
    HomePageComponent
  ],


  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule, 
    FormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
