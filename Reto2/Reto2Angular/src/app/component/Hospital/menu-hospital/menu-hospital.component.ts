import { Component } from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatListModule} from '@angular/material/list';
@Component({
  selector: 'app-menu-hospital',
  standalone: true,
  imports: [MatToolbarModule,MatButtonModule,MatIconModule,MatGridListModule,MatSidenavModule,MatListModule],
  templateUrl: './menu-hospital.component.html',
  styleUrl: './menu-hospital.component.css'
})
export class MenuHospitalComponent {

}
