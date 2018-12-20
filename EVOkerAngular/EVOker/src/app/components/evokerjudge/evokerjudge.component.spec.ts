import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EvokerjudgeComponent } from './evokerjudge.component';

describe('EvokerjudgeComponent', () => {
  let component: EvokerjudgeComponent;
  let fixture: ComponentFixture<EvokerjudgeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EvokerjudgeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EvokerjudgeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
