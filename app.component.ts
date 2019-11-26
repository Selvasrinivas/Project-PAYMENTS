import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-learning';
  favoriteMovie="Lord of the Rings";
  id:number=3;
  Name:string="John";
  Salary:number=10000;
  Permanent:boolean=true;
  stringpermanent:string="Yes";
  deptno:number=1;
  deptname:string="Payroll";
  skills:any=[{id:1,name:"HTML"},{id:2,name:"CSS"},{id:3,name:"JavaScript"},];
  date=new Date('12/31/2000');
  date1=new Date('04/21/2019');
}
