import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../employee/employee.component';
import { GreetingDataService } from '../services/data/greeting-data.service';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  message: string = '';
  user = "";
  messageWs = "";

  constructor(
    private route: ActivatedRoute,
    private greetingDataService: GreetingDataService
  ) { }

  

  ngOnInit(): void {
    this.message = "Welcome!!!";
    this.user = this.route.snapshot.params['username'];
  }

  getGreeting() {
    /*
    this.greetingDataService.getGreeting().subscribe(
     response => this.handleResponse(response) 
    )
    */
    
    this.greetingDataService.getGreetingByName(this.user).subscribe(
      response => this.messageWs = response.toString(),
      
      error => this.messageWs = error.error.message
      
     )
  }

  handleResponse(response: Object) {
    this.messageWs = response.toString();
  }



}
