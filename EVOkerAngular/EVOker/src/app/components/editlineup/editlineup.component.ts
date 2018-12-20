import { Component, OnInit } from '@angular/core';
import { SessionServiceService } from 'src/app/services/session-service.service';
import { EditcharacterService } from 'src/app/services/editcharacter.service';
import { Router } from '@angular/router';
import { AddcharacterService } from 'src/app/services/addcharacter.service';

@Component({
  selector: 'app-editlineup',
  templateUrl: './editlineup.component.html',
  styleUrls: ['./editlineup.component.css']
})
export class EditlineupComponent implements OnInit {
  characterName1 = '';
  characterName2 = '';
  constructor(private sessionService: SessionServiceService, private addCharacterService: AddcharacterService, private router: Router,
    private editcharacterService: EditcharacterService) { }
  player = JSON.parse(sessionStorage.getItem('user'));
  lineup = (this.player.lineup);
  editCharacter() {
    this.editcharacterService.editcharacter(this.characterName1, this.characterName2).subscribe((val) =>  {
      Object.assign(this.sessionService.player, val);
       sessionStorage.setItem('user', JSON.stringify(val)); location.reload(); });
  }
  ngOnInit() {
  }

}
