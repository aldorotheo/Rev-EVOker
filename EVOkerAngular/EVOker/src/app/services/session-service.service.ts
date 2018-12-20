import { Injectable } from '@angular/core';
import { Login, Player, Judge, Organizer } from '../types';

@Injectable({
  providedIn: 'root'
})
export class SessionServiceService {

  login: Login;
  player: Player = new Player();
  organizer: Organizer = new Organizer();
  judge: Judge = new Judge();


  constructor() {
    this.login = new Login();
    this.judge = new Judge();
    this.player = new Player();
    this.organizer = new Organizer();
  }


}
