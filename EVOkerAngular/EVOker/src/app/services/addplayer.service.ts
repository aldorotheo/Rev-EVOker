import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Tournament } from '../types';

@Injectable({
  providedIn: 'root'
})
export class AddplayerService {

  constructor(private httpClient: HttpClient) { }
  readonly url = 'http://localhost:8080/EVOker/tournament/join';
  player = JSON.parse(sessionStorage.getItem('user'));

  addPlayer(tournament: Tournament) {
    return this.httpClient.post(this.url, {'tournament': tournament, 'player': this.player});
  }
}
