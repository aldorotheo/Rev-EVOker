import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EvokerplayerComponent } from './evokerplayer.component';

describe('EvokerplayerComponent', () => {
  let component: EvokerplayerComponent;
  let fixture: ComponentFixture<EvokerplayerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EvokerplayerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EvokerplayerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
