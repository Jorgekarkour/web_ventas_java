import { TestBed } from '@angular/core/testing';

import { ServicioProductosService } from './servicio-productos.service';

describe('ServicioProductosService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServicioProductosService = TestBed.get(ServicioProductosService);
    expect(service).toBeTruthy();
  });
});
