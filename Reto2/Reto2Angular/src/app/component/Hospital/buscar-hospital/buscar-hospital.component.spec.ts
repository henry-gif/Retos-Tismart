import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BuscarHospitalComponent } from './buscar-hospital.component';

describe('BuscarHospitalComponent', () => {
  let component: BuscarHospitalComponent;
  let fixture: ComponentFixture<BuscarHospitalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BuscarHospitalComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(BuscarHospitalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
