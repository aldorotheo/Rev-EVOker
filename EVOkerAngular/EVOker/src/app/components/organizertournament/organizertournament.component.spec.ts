import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OrganizertournamentComponent } from './organizertournament.component';

describe('OrganizertournamentComponent', () => {
  let component: OrganizertournamentComponent;
  let fixture: ComponentFixture<OrganizertournamentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OrganizertournamentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OrganizertournamentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
