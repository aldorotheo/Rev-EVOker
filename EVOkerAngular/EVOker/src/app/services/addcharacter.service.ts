import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { SessionServiceService } from 'src/app/services/session-service.service';
import { Player } from '../types';

@Injectable({
  providedIn: 'root'
})
export class AddcharacterService {

  constructor(private httpClient: HttpClient, private sessionService: SessionServiceService) { }
  readonly url = 'http://localhost:8080/EVOker/lineup/add';
  player = JSON.parse(sessionStorage.getItem('user'));

  addcharacter(charactername: string) {
    return this.httpClient.post(this.url, {'charname': charactername, 'player': this.player});
  }
}
