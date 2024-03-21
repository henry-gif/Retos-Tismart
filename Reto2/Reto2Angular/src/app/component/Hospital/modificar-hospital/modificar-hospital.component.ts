import { Component } from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatMenuModule} from '@angular/material/menu';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatListModule} from '@angular/material/list';
import {MatCardModule} from '@angular/material/card';
import { HospitalServicesService } from '../../../services/hospital-services.service';
@Component({
  selector: 'app-modificar-hospital',
  standalone: true,
  imports: [MatToolbarModule,MatButtonModule,MatIconModule,MatMenuModule,MatSidenavModule,MatListModule,MatCardModule],
  providers: [HospitalServicesService],
  templateUrl: './modificar-hospital.component.html',
  styleUrl: './modificar-hospital.component.css'
})
export class ModificarHospitalComponent {

}
