import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { JudgetournamentComponent } from './judgetournament.component';

describe('JudgetournamentComponent', () => {
  let component: JudgetournamentComponent;
  let fixture: ComponentFixture<JudgetournamentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ JudgetournamentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(JudgetournamentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
