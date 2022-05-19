import { TestBed } from '@angular/core/testing';

import { ExamreportsService } from './examreports.service';

describe('ExamreportsService', () => {
  let service: ExamreportsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ExamreportsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
