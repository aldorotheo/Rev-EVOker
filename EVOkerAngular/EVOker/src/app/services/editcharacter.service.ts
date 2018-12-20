import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EditcharacterService {

  constructor(private httpClient: HttpClient) { }
  readonly url = 'http://localhost:8080/EVOker/lineup/edit';

  editcharacter(oldcharactername: string, newcharactername: string) {
    return this.httpClient.post(this.url, {'oldCharacterName': oldcharactername, 'newCharacterName': newcharactername,
     'player': JSON.parse(sessionStorage.getItem('user')) });
  }
}
