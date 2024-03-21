import { HttpClient, HttpHandler, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Hospital } from '../models/hospital';

@Injectable({
  providedIn: 'root'
})
export class HospitalServicesService {
  deleteHospital(id: number) {
    throw new Error('Method not implemented.');
  }
  getHospitals() {
    throw new Error('Method not implemented.');
  }
  ObtenerPorId(hospitalId: Number) {
    throw new Error('Method not implemented.');
  }
  private apiUrl = 'https://ejemplo.com/api'; // URL de tu API
  private cabeceras:HttpHeaders=new HttpHeaders({'Content-Type':'aplication/json'});

  constructor(private http: HttpClient) { }

  public Listar():Observable<Hospital[]>{
 
    return this.http.get<any[]>(`${this.apiUrl}/datos`);
  }
  
  public buscarid(id:number):Observable<Hospital>{
    return this.http.get<Hospital>( `${this.apiUrl}/${id}`);
  }
  public Crear(hospital:Hospital):Observable<Hospital>{
    return this.http.post<Hospital>(this.apiUrl,hospital,{headers:this.cabeceras});
  }
  public Modificar(hospital:Hospital):Observable<Hospital>{
    return this.http.put<Hospital>(`${this.apiUrl}/${hospital.idHospital}`,hospital,{headers:this.cabeceras});
  }
  public Eliminar(id:number):Observable<void>{
    return this.http.delete<void>( `${this.apiUrl}/${id}`);
  }
  public ListarPaginas(page:string,size:string):Observable<any>{
    const params=new HttpParams().set('page',page).set('size',size);
    return this.http.get<any>(`${this.apiUrl}/pagina`,{params:params});
      
     
  }
}

 
