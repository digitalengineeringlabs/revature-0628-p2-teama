import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SubmitTicketComponent } from './submit-ticket/submit-ticket.component';
import { TicketComponent } from './ticket/ticket.component';
import { TicketDetailComponent } from './ticket-detail/ticket-detail.component';
import { LoginComponent } from './login/login.component';
import { EmployeeComponent } from './employee/employee.component';


const routes: Routes = [
  // making ticket default url for now we can change it
  {path: 'login', component:LoginComponent},
  { path: 'submitTicket', component: SubmitTicketComponent },
  {path: 'ticket', component:TicketComponent},
  {path: 'ticket/:ticket_id', component:TicketDetailComponent},
  {path: 'employee', component:EmployeeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }