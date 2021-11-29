import { AuthService } from './../services/auth.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {

  constructor(
    private route: Router,
    private authService: AuthService) { }

  username: string = "";
  password: string = "";

  isAuthenticate: Boolean = false;
  ngOnInit() {
  }

  doLogin() {
    console.log(this.username);
    this.authService.authenticate(this.username, this.password).subscribe(
      response => {

        if (response == true) {
          sessionStorage.setItem("user", this.username);
          this.isAuthenticate = true;
          this.route.navigate(['main', this.username]);
        }
        else {
          this.isAuthenticate = false;
        }
      }
    )
  }

}
