import { Component, OnInit } from '@angular/core';
import { SessionServiceService } from 'src/app/services/session-service.service';

@Component({
  selector: 'app-evokerplayer',
  templateUrl: './evokerplayer.component.html',
  styleUrls: ['./evokerplayer.component.css']
})
export class EvokerplayerComponent implements OnInit {

  constructor(private sessionService: SessionServiceService) { }
  player = JSON.parse(sessionStorage.getItem('user'));
  wins = this.player.wins;
  losses = this.player.losses;
  username = this.player.login.userName;
  winloss: number;
  ngOnInit() {
    if ((this.wins === 0) && (this.losses === 0)) {
    this.winloss = 100;
    } else if ((this.wins === 0) || (this.losses === 0)) {
    this.winloss = 0;
    } else {
      this.winloss = this.wins / (this.wins + this.losses) * 100;
    }
  }

}
