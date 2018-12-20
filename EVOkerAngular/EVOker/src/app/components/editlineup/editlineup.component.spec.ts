import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditlineupComponent } from './editlineup.component';

describe('EditlineupComponent', () => {
  let component: EditlineupComponent;
  let fixture: ComponentFixture<EditlineupComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditlineupComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditlineupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
