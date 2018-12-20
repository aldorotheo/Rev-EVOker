import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service';
import { Login, Organizer, Player, Judge } from '../../types';
import { Router } from '@angular/router';
import { SessionServiceService } from 'src/app/services/session-service.service';


@Component({
  selector: 'app-evokerlogin',
  templateUrl: './evokerlogin.component.html',
  styleUrls: ['./evokerlogin.component.css']
})
export class EvokerloginComponent implements OnInit {

  constructor(private loginService: LoginService, private router: Router, private sessionService: SessionServiceService) { }

  username = '';
  password = '';
  login: Login = new Login();

  ngOnInit() {
      this.sessionService.judge = new Judge();
      this.sessionService.login = new Login();
      this.sessionService.organizer = new Organizer();
      this.sessionService.player = new Player();
      sessionStorage.clear();
  }

  loginUser() {
    this.loginService.login(this.username, this.password).subscribe((val) => { this.userAuth(val); } );
  }

  userAuth(obj: Object) {
    this.login = Object.assign(this.login, obj);
    if (this.login.userType === 1) {
      this.loginService.playerLogin(this.login).subscribe((val) => { this.router.navigateByUrl('/player');
       Object.assign(this.sessionService.player, val); sessionStorage.setItem('user', JSON.stringify(val)); });
    }
    if (this.login.userType === 2) {
      this.loginService.judgeLogin(this.login).subscribe((val) => { this.router.navigateByUrl('/judge');
      Object.assign(this.sessionService.judge, val); sessionStorage.setItem('user', JSON.stringify(val)); });
    }
    if (this.login.userType === 3) {
      this.loginService.organizerLogin(this.login).subscribe((val) => { this.router.navigateByUrl('/organizer');
      Object.assign(this.sessionService.organizer, val); sessionStorage.setItem('user', JSON.stringify(val)); });
    }
  }

}
