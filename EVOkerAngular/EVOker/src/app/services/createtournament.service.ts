import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Tournament, Organizer, Ruleset } from '../types';

@Injectable({
  providedIn: 'root'
})
export class CreatetournamentService {

  constructor(private httpClient: HttpClient) { }
  readonly url = 'http://localhost:8080/EVOker/tournament/add';
  tournament: Tournament = new Tournament();
  organizer: Organizer = JSON.parse(sessionStorage.getItem('user'));
  createTournament(newTournament: Tournament, newRuleset: Ruleset) {
    this.tournament = newTournament;
    this.tournament.ruleset = newRuleset;
    this.tournament.tournamentOrganizer = this.organizer;
    return this.httpClient.post(this.url, {'organizer': this.organizer, 'tournament': this.tournament});
  }
}
