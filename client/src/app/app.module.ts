import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'; // this is what allows us to access API

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TicketComponent } from './ticket/ticket.component';
import { TicketDetailComponent } from './ticket-detail/ticket-detail.component';

@NgModule({
  declarations: [
    // declare all your components here
    AppComponent,
    TicketComponent,
    TicketDetailComponent
  ],
  imports: [
    // declare your imported modules here
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
