import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TicketComponent } from './ticket/ticket.component';
import { TicketDetailComponent } from './ticket-detail/ticket-detail.component';

const routes: Routes = [
  // making ticket default url for now we can change it
  {path: '' , redirectTo: '/ticket', pathMatch: 'full'},
  {path: 'ticket', component:TicketComponent},
  {path: 'ticket/:ticket_id', component:TicketDetailComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
