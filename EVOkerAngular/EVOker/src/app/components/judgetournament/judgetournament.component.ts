import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Tournament, Judge } from 'src/app/types';
import { AddjudgeService } from 'src/app/services/addjudge.service';

@Component({
  selector: 'app-judgetournament',
  templateUrl: './judgetournament.component.html',
  styleUrls: ['./judgetournament.component.css']
})
export class JudgetournamentComponent implements OnInit {
  tournid = 0;
  show = false;
  currentTournaments: Tournament[];
  tourn: Tournament = new Tournament();
  constructor(private httpClient: HttpClient, private addJudgeService: AddjudgeService) { }
  readonly url = 'http://localhost:8080/EVOker/tournament/';
  ngOnInit() {
    this.httpClient.get(this.url).subscribe((val) => {
    sessionStorage.setItem('tournamentList', JSON.stringify(val)); });
    this.currentTournaments = JSON.parse(sessionStorage.getItem('tournamentList'));
  }
  addJudgeToTournament(i: number) {
    this.addJudgeService.addJudge(this.currentTournaments[i]).subscribe((val) => { sessionStorage.setItem('tournamentList',
     JSON.stringify(val)); location.reload(); });
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
}
