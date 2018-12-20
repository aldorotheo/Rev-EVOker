import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Login } from '../types';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  readonly url = 'http://localhost:8080/EVOker/login/';
  readonly url2 = 'http://localhost:8080/EVOker/login/player';
  readonly url3 = 'http://localhost:8080/EVOker/login/judge';
  readonly url4 = 'http://localhost:8080/EVOker/login/organizer';

  constructor(private httpClient: HttpClient) { }

  login(username: string, password: string) {
    return this.httpClient.post(this.url, { 'username': username, 'password': password });
  }

  playerLogin(login: Login) {
    return this.httpClient.post(this.url2, login);
  }
  judgeLogin(login: Login) {
    return this.httpClient.post(this.url3, login);
  }
  organizerLogin(login: Login) {
    return this.httpClient.post(this.url4, login);
  }

}
