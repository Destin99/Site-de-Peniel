import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from 'src/app/model/user';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.scss']
})
export class LoginPageComponent implements OnInit {

  loginFormGroup!: FormGroup;
  errorMessage:any;
  users=new User();

  constructor(private formBuIlder: FormBuilder, private authService:LoginService,
    private router: Router) { }

  ngOnInit(): void {
    this.loginFormGroup=this.formBuIlder.group({
      username : this.formBuIlder.control(""),
      password : this.formBuIlder.control("")
    });
  }

  handleLogin(){
    let username = this.loginFormGroup.value.username;
    let pwd = this.loginFormGroup.value.password;

    this.authService.loginUser(this.users).subscribe(
      data=>{
        console.log("response received")
             this.router.navigateByUrl("");
        },
        error=>{
        console.log("exception received");
        this.errorMessage = "Bad credentail, please enter valid email or pwd"
      })
      // next: (appUser:AppUser)=>{
      //   this.authService.AuthentificationUser(appUser).subscribe({
      //   next : (data)=>{
      //     this.router.navigateByUrl("");
      //   }  
      //   });
      // },
      
  }

}
