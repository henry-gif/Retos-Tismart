import { Component, OnInit } from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatListModule} from '@angular/material/list';
import {MatCardModule} from '@angular/material/card';
import { MatFormFieldModule } from '@angular/material/form-field';
import {provideNativeDateAdapter} from '@angular/material/core';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatGridListModule} from '@angular/material/grid-list';
import { Hospital } from '../../../models/hospital';
import { HospitalServicesService } from '../../../services/hospital-services.service';
@Component({
  selector: 'app-registrar-hospital',
  standalone: true,
  providers: [provideNativeDateAdapter(),HospitalServicesService],
  imports: [MatToolbarModule,MatButtonModule,MatIconModule,MatSidenavModule,MatListModule,MatCardModule,MatCardModule,MatFormFieldModule,MatDatepickerModule,MatGridListModule],
  templateUrl: './registrar-hospital.component.html',
  styleUrl: './registrar-hospital.component.css'
})
export class RegistrarHospitalComponent implements OnInit {
  
  // Variables para almacenar los valores de los campos del formulario
  idHospital: string = '';
  nombre: string = '';
  idDistrito: string = '';
  antiguedad: string = '';
  area: string = '';
  idSede: string = '';
  idGerente: string = '';
  idCondicion: string = '';
  fechaRegistro: string = '';

  constructor() { }

  ngOnInit() {
  }

  // Método para limpiar todos los campos del formulario
  limpiarCampos() {
    this.idHospital = '';
    this.nombre = '';
    this.idDistrito = '';
    this.antiguedad = '';
    this.area = '';
    this.idSede = '';
    this.idGerente = '';
    this.idCondicion = '';
    this.fechaRegistro = '';
  }
  

}
