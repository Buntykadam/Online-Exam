import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JavaExamComponent } from './java-exam.component';

describe('JavaExamComponent', () => {
  let component: JavaExamComponent;
  let fixture: ComponentFixture<JavaExamComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ JavaExamComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(JavaExamComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
