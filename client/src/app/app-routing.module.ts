import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SubmitTicketComponent } from './submit-ticket/submit-ticket.component';
import { TicketComponent } from './ticket/ticket.component';
import { TicketDetailComponent } from './ticket-detail/ticket-detail.component';
import { LoginComponent } from './login/login.component';
import { EmployeesComponent } from './employees/employees.component';

const routes: Routes = [
  // making ticket default url for now we can change it
  {path: '' , redirectTo: '/ticket', pathMatch: 'full'},
  { path: 'submitTicket', component: SubmitTicketComponent },
  {path: 'ticket', component:TicketComponent},
  {path: 'ticket/:ticket_id', component:TicketDetailComponent},
  {path: 'login', component:LoginComponent},
 {path: 'employees', component:EmployeesComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
