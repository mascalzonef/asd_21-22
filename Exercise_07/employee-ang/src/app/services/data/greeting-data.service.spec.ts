import { TestBed } from '@angular/core/testing';

import { GreetingDataService } from './greeting-data.service';

describe('GreetingDataService', () => {
  let service: GreetingDataService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GreetingDataService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
