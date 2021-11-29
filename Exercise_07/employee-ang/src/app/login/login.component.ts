import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(
    private route: Router
  ) { }

  username: string = "";
  password: string = "";

  isAuthenticated: boolean = false;
  showMessage = false;
  errorMessage = "Error! Username or password not valid!"
  infoMessage = "Access Allowed!"

  ngOnInit(): void {
  }

  doLogin() {
    console.log(this.username+"-"+this.password);
    this.showMessage = true;
    if(this.username === "ciccio" && this.password === "123") {
      this.isAuthenticated = true;
      this.route.navigate(['welcome', this.username])
    }
    else {
      this.isAuthenticated = false;
    }
  }

}
