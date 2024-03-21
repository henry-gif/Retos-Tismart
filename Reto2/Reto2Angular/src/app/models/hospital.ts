export class Hospital {
  idHospital: number;
  nombre: string;
  antiguedad: number;
  area: number;
  idDistrito: number;
  idSede: number;
  idGerente: number;
  idCondicion: number;
  fexhaCreacion:Date;
  id: any;
  constructor(
  
  ) {
    this.idHospital = 0;
    this.nombre ="";
    this.antiguedad = 0;
    this.area = 0;
    this.idDistrito = 0;
    this.idSede = 0;
    this.idGerente = 0;
    this.idCondicion =0;
    this.fexhaCreacion=new Date;
  }
}
