import { Component, OnInit } from '@angular/core';
import { Tournament, Organizer, Ruleset, Judge } from '../../types';
import { CreatetournamentService } from 'src/app/services/createtournament.service';
@Component({
  selector: 'app-organizertournament',
  templateUrl: './organizertournament.component.html',
  styleUrls: ['./organizertournament.component.css']
})
export class OrganizertournamentComponent implements OnInit {

  constructor(private createtournamentService: CreatetournamentService) {}
  tournamentName = '';
  date = '';
  minDate = new Date();
  minYear = this.minDate.getFullYear();
  minMonth = this.minDate.getMonth() + 1;
  minDay = this.minDate.getDate();
  min = '';
  timed = 0;
  stock = 0;
  supers = 0;
  newTournament: Tournament = new Tournament();
  organizer: Organizer = JSON.parse(sessionStorage.getItem('user'));
  addTournament() {
    this.newTournament.tournamentOrganizer = this.organizer;
    this.newTournament.ruleset = new Ruleset();
    this.newTournament.tournamentName = this.tournamentName;
    this.newTournament.tournamentDate = this.date;
    this.newTournament.ruleset.stock = this.stock;
    this.newTournament.ruleset.timed = this.timed;
    this.newTournament.ruleset.supers = this.supers;
    this.newTournament.tournamentJudge = new Judge();
    this.createtournamentService.createTournament(this.newTournament, this.newTournament.ruleset).subscribe((val) => {
       sessionStorage.setItem('user', JSON.stringify(val)); location.reload(); });
  }
  ngOnInit() {
      this.minYear = this.minDate.getFullYear();
      this.minMonth = this.minDate.getMonth() + 1;
      this.minDay = this.minDate.getDate();
      this.min = this.minYear + '-' + this.minMonth + '-' + this.minDay;
  }
}
