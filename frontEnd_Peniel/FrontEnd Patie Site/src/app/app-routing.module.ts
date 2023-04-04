import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { CommunicationComponent } from './components/communication/communication.component';
import { LoginPageComponent } from './components/login-page/login-page.component';
import { LoginComponent } from './components/login/login.component';
import { SignUpComponent } from './components/sign-up/sign-up.component';

const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: 'loginPage', component: LoginPageComponent},
  {path: 'inscrire', component: SignUpComponent},
  {path: '', component: CommunicationComponent},
  
  // {path: '', redirectTo: '/accueil', pathMatch: 'full'},
  // Marche pour toutes absente
  // {path: '**', redirectTo: '/accueil', pathMatch: 'full'}
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
