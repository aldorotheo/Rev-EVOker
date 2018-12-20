import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { validateConfig } from '@angular/router/src/config';
import { Tournament, Judge } from 'src/app/types';
import { AddplayerService } from 'src/app/services/addplayer.service';

@Component({
  selector: 'app-playertournament',
  templateUrl: './playertournament.component.html',
  styleUrls: ['./playertournament.component.css']
})
export class PlayertournamentComponent implements OnInit {
  tournid = 0;
  show = false;
  currentTournaments: Tournament[];
  tourn: Tournament = new Tournament();
  constructor(private httpClient: HttpClient, private addPlayerService: AddplayerService) { }
  readonly url = 'http://localhost:8080/EVOker/tournament/';
  ngOnInit() {
    this.httpClient.get(this.url).subscribe((val) => {
    sessionStorage.setItem('tournamentList', JSON.stringify(val)); });
    this.currentTournaments = JSON.parse(sessionStorage.getItem('tournamentList'));
  }

  viewTournInfo(i: number) {
    this.tourn = this.currentTournaments[i];
    if (this.tourn.tournamentJudge === null) {
      this.tourn.tournamentJudge = new Judge();
      this.tourn.tournamentJudge.judgeLogin.userName = 'N/A';
    }
    if (this.show === false) {
      this.show = true;
    } else if (this.tournid === i) {
      this.show = false;
    }
    this.tournid = i;
  }

  addPlayerToTournament(i: number) {
    this.addPlayerService.addPlayer(this.currentTournaments[i]).subscribe((val) => { sessionStorage.setItem('tournamentList',
     JSON.stringify(val)); location.reload(); });
  }

}
