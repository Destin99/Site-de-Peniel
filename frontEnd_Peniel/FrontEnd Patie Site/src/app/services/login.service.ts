import { Injectable } from '@angular/core';
import { User } from '../model/user';
import { UUID } from 'angular2-uuid';
import { Observable, of, throwError } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  users= new User();
  // authentificationUser! :AppUser;

  constructor(private httpClient: HttpClient){}

  public loginUser(user :User):Observable<any>{
    return this.httpClient.post<any>("http://localhost:8080/login", user)
  }
  
  public registrationUser(user :User):Observable<any>{
    return this.httpClient.post<any>("http://localhost:8080/register", user)
  }

  // constructor() { 
  //   this.users.push({userId: UUID.UUID(),username: 'user1',password: '1234', role: ["User"]})
  //   this.users.push({userId: UUID.UUID(),username: 'user2',password: '1234', role: ["User"]})
  //   this.users.push({userId: UUID.UUID(),username: 'admin',password: '1234', role: ["User","ADMIN"]})
  // }
  // Observable:ça emet des data qui peuvent modifier dans le temps. Il faut préciser le type de data attendues
  // of permet de retourner un observable, une seule valeur
  // Subscribe est comme un abonnement qui permet d'avoir les datas
  // public Authentification(username: string, password: string):Observable<AppUser>{
  //   let appUser = this.users.find(u=>u.username==username)
  //   if(!appUser) return throwError(()=>new Error("User not found"));
  //   if(appUser.password!=password){
  //     return throwError(()=>new Error("Bad pwd"));
  //   }
  //   return of(appUser);
  // }

  // public AuthentificationUser(appUser : AppUser):Observable<boolean>{
  //   this.authentificationUser = appUser;
  //   localStorage.setItem("authUser", JSON.stringify({username:appUser.username, roles:appUser.role,
  //   jwt:"JWT_TOKEN"}));
  //   return of(true);
  // }

  // public hasRole(role:string) : boolean{
  //  return this.authentificationUser.role.includes(role);
  // }

  // public isAuthenticated() : boolean{
  //   return this.authentificationUser !=undefined;
  //  }
}

