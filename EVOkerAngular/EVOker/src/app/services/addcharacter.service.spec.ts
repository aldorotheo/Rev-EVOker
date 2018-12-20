import { TestBed } from '@angular/core/testing';

import { AddcharacterService } from './addcharacter.service';

describe('AddcharacterService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AddcharacterService = TestBed.get(AddcharacterService);
    expect(service).toBeTruthy();
  });
});
