import { TestBed } from '@angular/core/testing';

import { AddplayerService } from './addplayer.service';

describe('AddplayerService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AddplayerService = TestBed.get(AddplayerService);
    expect(service).toBeTruthy();
  });
});
