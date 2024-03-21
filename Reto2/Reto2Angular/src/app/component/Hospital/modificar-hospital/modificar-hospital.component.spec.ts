import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModificarHospitalComponent } from './modificar-hospital.component';

describe('ModificarHospitalComponent', () => {
  let component: ModificarHospitalComponent;
  let fixture: ComponentFixture<ModificarHospitalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ModificarHospitalComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ModificarHospitalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
