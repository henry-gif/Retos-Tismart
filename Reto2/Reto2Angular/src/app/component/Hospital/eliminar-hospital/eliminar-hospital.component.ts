import { Component, OnInit } from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatListModule} from '@angular/material/list';
import { HospitalServicesService } from '../../../services/hospital-services.service';
import { Hospital } from '../../../models/hospital';
import { MatTableDataSource } from '@angular/material/table';
import {MatCardModule} from '@angular/material/card';
@Component({
  selector: 'app-eliminar-hospital',
  standalone: true,
  imports: [MatToolbarModule,MatButtonModule,MatIconModule,MatSidenavModule,MatListModule,MatCardModule],
  providers: [HospitalServicesService],
  templateUrl: './eliminar-hospital.component.html',
  styleUrl: './eliminar-hospital.component.css'
})
export class EliminarHospitalComponent  implements OnInit{

  titulo="Eliminar Hospital"
  displayedColumns: string[] = ['idHospital', 'nombre', 'antiguedad', 'area'];
  dataSource: MatTableDataSource<Hospital>;
  searchid!: number;



  constructor(private hospitalService: HospitalServicesService) {
    this.dataSource = new MatTableDataSource<Hospital>();
  
  }
  ngOnInit(): void {

   this.hospitalService.buscarid(this.searchid);
  }
  buscarHospital(): void {
    if (this.searchid !== null) {
      this.hospitalService.buscarid(this.searchid)
        .subscribe(hospital => {
          if (hospital) {
            this.dataSource.data = [hospital];
          } else {
            this.dataSource.data = [];
           
          }
        });
    }
  }


}
