import { Routes } from '@angular/router';
import { LoginComponent } from './component/login/login.component';
import { MenuHospitalComponent } from './component/Hospital/menu-hospital/menu-hospital.component';
import { Component } from '@angular/core';
import { RegistrarHospitalComponent } from './component/Hospital/registrar-hospital/registrar-hospital.component';
import { BuscarHospitalComponent } from './component/Hospital/buscar-hospital/buscar-hospital.component';
import { EliminarHospitalComponent } from './component/Hospital/eliminar-hospital/eliminar-hospital.component';
import { ModificarHospitalComponent } from './component/Hospital/modificar-hospital/modificar-hospital.component';



export const routes: Routes = [
    {path:'Login' ,component:LoginComponent },
    {path:'Menu',component:MenuHospitalComponent},
    { path: 'Buscar', component: BuscarHospitalComponent },
    {path:'Eliminar',component:EliminarHospitalComponent},
    {path:'Modificar',component:ModificarHospitalComponent},
    {path:'Registrar',component:RegistrarHospitalComponent},
    {path: '',redirectTo:'/Buscar',pathMatch:'full'}
    
];
