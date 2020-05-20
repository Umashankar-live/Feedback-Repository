import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListFeedbackTrainingProgramComponent } from './list-feedback-training-program.component';

describe('ListFeedbackTrainingProgramComponent', () => {
  let component: ListFeedbackTrainingProgramComponent;
  let fixture: ComponentFixture<ListFeedbackTrainingProgramComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListFeedbackTrainingProgramComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListFeedbackTrainingProgramComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
