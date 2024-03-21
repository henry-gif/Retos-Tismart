import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EliminarHospitalComponent } from './eliminar-hospital.component';

describe('EliminarHospitalComponent', () => {
  let component: EliminarHospitalComponent;
  let fixture: ComponentFixture<EliminarHospitalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EliminarHospitalComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EliminarHospitalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
