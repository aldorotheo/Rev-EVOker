import { Component, OnInit } from '@angular/core';
import { SessionServiceService } from 'src/app/services/session-service.service';

@Component({
  selector: 'app-evokerjudge',
  templateUrl: './evokerjudge.component.html',
  styleUrls: ['./evokerjudge.component.css']
})
export class EvokerjudgeComponent implements OnInit {

  constructor() { }
  judge = JSON.parse(sessionStorage.getItem('user'));
  username = this.judge.judgeLogin.userName;
  numJudged = this.judge.numJudged;
  ngOnInit() {
  }

}
