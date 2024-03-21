import { Component } from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatListModule} from '@angular/material/list';
import { HospitalServicesService } from '../../../services/hospital-services.service';
import { MatCardContent } from '@angular/material/card';
import {MatCardModule} from '@angular/material/card';
import { MatSnackBar, MatSnackBarModule } from '@angular/material/snack-bar';
import { Hospital } from '../../../models/hospital';
import {  MatDialog, MatDialogModule } from '@angular/material/dialog';
import { MatTableDataSource } from '@angular/material/table';
import { ModalComponent } from './modal/modal.component';



@Component({
  selector: 'app-buscar-hospital',
  standalone: true,
  imports: [MatToolbarModule,MatButtonModule,MatIconModule,MatSidenavModule,MatListModule,MatCardModule,MatDialogModule,MatSnackBarModule,MatDialogModule],
  providers: [HospitalServicesService],
  templateUrl: './buscar-hospital.component.html',
  styleUrl: './buscar-hospital.component.css'
})
export class BuscarHospitalComponent {
 
  hospitals: Hospital[] = [];
  selectedHospital: Hospital | null = null;
  dataSource = new MatTableDataSource<Hospital>();

  constructor(private hospitalService: HospitalServicesService, private snackBar: MatSnackBar, public dialog: MatDialog) { }


  ngOnInit(): void {
    this.getHospitals();
  }

    getHospitals(): void {
    this.hospitalService.Listar().subscribe(hospitals => {
      this.dataSource.data = hospitals;
    });
  }

  searchById(id: number): void {
    this.hospitalService.buscarid(id).subscribe(hospital => {
      this.dataSource.data = [hospital];
    });
  }

  deleteHospital(id: number): void {
    const dialogRef = this.dialog.open(ModalComponent, {
      width: '350px',
      data: "Desea eliminar este obeto"
    });
  
    dialogRef.afterClosed().subscribe(result => {
      if(result) {
        this.hospitalService.Eliminar(id).subscribe(
          () => {
            this.dataSource.data = this.dataSource.data.filter(hospital => hospital.idHospital !== id);
          },
          error => {
            this.snackBar.open('Error al eliminar hospital ' + error.message, 'Close', {
              duration: 3000,
            });
          }
        );
      }
    });
  }
  
  }
  
  
  


