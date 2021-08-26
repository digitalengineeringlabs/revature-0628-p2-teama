import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'; // this is what allows us to access API

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TicketComponent } from './ticket/ticket.component';
import { TicketDetailComponent } from './ticket-detail/ticket-detail.component';
import { FormsModule } from '@angular/forms'; // <-- NgModel lives here
import { SubmitTicketComponent } from './submit-ticket/submit-ticket.component';
import { TicketsComponent } from './tickets/tickets.component';

@NgModule({
  declarations: [
    // declare all your components here
    AppComponent,
    TicketComponent,
    TicketDetailComponent,
    SubmitTicketComponent,
    TicketsComponent
    ],
  imports: [
    // declare your imported modules here
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
