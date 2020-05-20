import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Feedback Management System';
  flag:boolean=false;
  
  
  constructor(private route: Router){
    if(sessionStorage.getItem('user')!=null){
      this.flag=true;
    }
  }

  logout(){
    localStorage.clear();
    this.route.navigate(['login']);
  }
 
}
