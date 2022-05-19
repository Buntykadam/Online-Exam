import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CPPExamComponent } from './cpp-exam.component';

describe('CPPExamComponent', () => {
  let component: CPPExamComponent;
  let fixture: ComponentFixture<CPPExamComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CPPExamComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CPPExamComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
