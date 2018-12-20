import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EvokerloginComponent } from './evokerlogin.component';

describe('EvokerloginComponent', () => {
  let component: EvokerloginComponent;
  let fixture: ComponentFixture<EvokerloginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EvokerloginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EvokerloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
