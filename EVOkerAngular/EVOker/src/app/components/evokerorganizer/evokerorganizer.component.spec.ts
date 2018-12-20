import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EvokerorganizerComponent } from './evokerorganizer.component';

describe('EvokerorganizerComponent', () => {
  let component: EvokerorganizerComponent;
  let fixture: ComponentFixture<EvokerorganizerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EvokerorganizerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EvokerorganizerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
