import { Component } from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatListModule} from '@angular/material/list';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
@Component({
  selector: 'app-menu-hospital',
  standalone: true,
  imports: [MatToolbarModule,MatButtonModule,MatIconModule,MatGridListModule,MatSidenavModule,MatListModule,RouterModule,HttpClientModule],
  templateUrl: './menu-hospital.component.html',
  styleUrl: './menu-hospital.component.css'
})
export class MenuHospitalComponent {

}
