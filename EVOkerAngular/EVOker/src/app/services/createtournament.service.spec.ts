import { TestBed } from '@angular/core/testing';

import { CreatetournamentService } from './createtournament.service';

describe('CreatetournamentService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CreatetournamentService = TestBed.get(CreatetournamentService);
    expect(service).toBeTruthy();
  });
});
