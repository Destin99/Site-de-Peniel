import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CommunicationComponent } from './components/communication/communication.component';
import { LoginComponent } from './components/login/login.component'
import { ReactiveFormsModule } from '@angular/forms';
import { LoginPageComponent } from './components/login-page/login-page.component';
import { SignUpComponent } from './components/sign-up/sign-up.component';
import { DashboardComponent } from './adminSide/dashboard/dashboard.component';
import { ListeUsersComponent } from './adminSide/liste-users/liste-users.component';



@NgModule({
  declarations: [
    AppComponent,
    CommunicationComponent,
    LoginComponent,
    LoginPageComponent,
    SignUpComponent,
    DashboardComponent,
    ListeUsersComponent
  ],
  imports: [
    // Configuration des routes basées sur nos routes définies
    BrowserModule,
    AppRoutingModule,HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
