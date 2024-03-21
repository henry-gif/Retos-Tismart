import { Component } from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatListModule} from '@angular/material/list';
@Component({
  selector: 'app-buscar-hospital',
  standalone: true,
  imports: [MatToolbarModule,MatButtonModule,MatIconModule,MatSidenavModule,MatListModule],
  templateUrl: './buscar-hospital.component.html',
  styleUrl: './buscar-hospital.component.css'
})
export class BuscarHospitalComponent {

}
