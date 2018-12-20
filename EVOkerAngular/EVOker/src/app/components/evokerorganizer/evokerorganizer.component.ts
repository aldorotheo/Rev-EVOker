import { Component, OnInit } from '@angular/core';
import { SessionServiceService } from 'src/app/services/session-service.service';
@Component({
  selector: 'app-evokerorganizer',
  templateUrl: './evokerorganizer.component.html',
  styleUrls: ['./evokerorganizer.component.css']
})
export class EvokerorganizerComponent implements OnInit {

  constructor(private sessionService: SessionServiceService) { }
  organizer = JSON.parse(sessionStorage.getItem('user'));
  username = this.organizer.orgLogin.userName;
  numRan = this.organizer.numRan;
  ngOnInit() {
  }

}
