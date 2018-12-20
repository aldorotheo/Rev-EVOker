import { TestBed } from '@angular/core/testing';

import { EditcharacterService } from './editcharacter.service';

describe('EditcharacterService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EditcharacterService = TestBed.get(EditcharacterService);
    expect(service).toBeTruthy();
  });
});
