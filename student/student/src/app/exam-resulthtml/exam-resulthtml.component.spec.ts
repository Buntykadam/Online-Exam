import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExamResulthtmlComponent } from './exam-resulthtml.component';

describe('ExamResulthtmlComponent', () => {
  let component: ExamResulthtmlComponent;
  let fixture: ComponentFixture<ExamResulthtmlComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExamResulthtmlComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ExamResulthtmlComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
