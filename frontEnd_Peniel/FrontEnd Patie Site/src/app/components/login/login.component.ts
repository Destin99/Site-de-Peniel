import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  isAuthenticated: boolean = false;
  userFullName: string = '';
  storage: Storage = sessionStorage;

  constructor(private formBuIlder: FormBuilder, private router: Router) { }

  ngOnInit(): void {
  }

  logout(){
    
  }

}
