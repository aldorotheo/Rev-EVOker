import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PlayertournamentComponent } from './playertournament.component';

describe('PlayertournamentComponent', () => {
  let component: PlayertournamentComponent;
  let fixture: ComponentFixture<PlayertournamentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PlayertournamentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PlayertournamentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
