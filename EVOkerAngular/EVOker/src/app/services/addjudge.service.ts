import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Tournament } from '../types';

@Injectable({
  providedIn: 'root'
})
export class AddjudgeService {

  constructor(private httpClient: HttpClient) { }
  readonly url = 'http://localhost:8080/EVOker/tournament/judge';
  judge = JSON.parse(sessionStorage.getItem('user'));

  addJudge(tournament: Tournament) {
    return this.httpClient.post(this.url, {'tournament': tournament, 'judge': this.judge});
  }
}
