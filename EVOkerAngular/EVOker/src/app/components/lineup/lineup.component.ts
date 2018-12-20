import { Component, OnInit } from '@angular/core';
import { SessionServiceService } from 'src/app/services/session-service.service';
import { AddcharacterService } from 'src/app/services/addcharacter.service';
import { EditcharacterService } from 'src/app/services/editcharacter.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-lineup',
  templateUrl: './lineup.component.html',
  styleUrls: ['./lineup.component.css']
})
export class LineupComponent implements OnInit {

  characterName = '';
  constructor(private sessionService: SessionServiceService, private addcharacterService: AddcharacterService, private router: Router,
    private editcharacterService: EditcharacterService) { }
  player = JSON.parse(sessionStorage.getItem('user'));
  lineup = (this.player.lineup);
  addCharacter() {
    this.addcharacterService.addcharacter(this.characterName).subscribe((val) =>  { Object.assign(this.sessionService.player, val);
       sessionStorage.setItem('user', JSON.stringify(val)); location.reload(); });
  }
  ngOnInit() {
  }

}
