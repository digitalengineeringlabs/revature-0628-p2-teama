import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TicketDetailComponent } from '../ticket-detail/ticket-detail.component';
import { TicketComponent } from '../ticket/ticket.component';


const routes: Routes = [
  {path: 'ticket', component: TicketComponent },
  {path: 'ticket/:id', component: TicketDetailComponent}
]



@NgModule({
  imports: [RouterModule.forRoot(routes)], //  Creates and configures a module with all the router providers and directives
  exports: [RouterModule]
})
export class AppRoutingModule { }
