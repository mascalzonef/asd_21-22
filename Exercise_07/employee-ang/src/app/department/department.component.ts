import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrls: ['./department.component.css']
})
export class DepartmentComponent implements OnInit {

  constructor() { }

  ngOnInit(): void { }
  
  profitTmp: number = 0;
  @Input() companyName: string = "";
  @Output('addProfit') profit = new EventEmitter;

  addProfit() {
    this.profit.emit(this.profitTmp);
  }
}
