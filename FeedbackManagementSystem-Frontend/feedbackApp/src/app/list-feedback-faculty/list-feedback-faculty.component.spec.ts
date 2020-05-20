import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListFeedbackFacultyComponent } from './list-feedback-faculty.component';

describe('ListFeedbackFacultyComponent', () => {
  let component: ListFeedbackFacultyComponent;
  let fixture: ComponentFixture<ListFeedbackFacultyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListFeedbackFacultyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListFeedbackFacultyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
