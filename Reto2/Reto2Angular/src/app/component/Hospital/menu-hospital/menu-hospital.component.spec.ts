import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuHospitalComponent } from './menu-hospital.component';

describe('MenuHospitalComponent', () => {
  let component: MenuHospitalComponent;
  let fixture: ComponentFixture<MenuHospitalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MenuHospitalComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(MenuHospitalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
