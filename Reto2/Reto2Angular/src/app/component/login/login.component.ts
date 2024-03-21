import { NumberFormatStyle } from '@angular/common';
import { Component } from '@angular/core';
import { FormGroup,FormBuilder,Validators, ReactiveFormsModule } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { MatFormFieldModule } from '@angular/material/form-field';
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner';
import {MatIconModule} from '@angular/material/icon';
import {MatCardModule} from '@angular/material/card';
import {MatInputModule} from '@angular/material/input';
@Component({
  selector: 'app-login',
  standalone: true,
  imports: [MatFormFieldModule,MatProgressSpinnerModule,ReactiveFormsModule,MatIconModule,MatCardModule,MatInputModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  formUsuario:FormGroup;
  loading=false;
  IsLoggin=false;
  usuarioss:any={};
  hide = true;
  
  ArrayUser:any[]=[
    {
      Username:'admin',
      password: 'admin'
    },
    {
      Username:'developer',
      password: 'developer'
    },
    {
      Username:'qa',
      password: 'qa'
    }
  
  
  ];
  
  
  constructor(private fb:FormBuilder,private snackbar:MatSnackBar,private router:Router ){
    this.formUsuario=this.fb.group({
      usuario:['',Validators.required],
      password:['',Validators.required]
    })
  
  }

  
    ingresar(){

      this.isADMIN();
      this.iNormaluser();
      
    
    }

    isADMIN(){
      const usuario=this.formUsuario.value.usuario;
      const password=this.formUsuario.value.password;
      if(this.usuarioss.Username=="admin" && this.usuarioss.password=="admin"){
       
        localStorage.setItem("usuario",this.usuarioss.Username),
        localStorage.setItem("contraseña",this.usuarioss.password),
        localStorage.getItem("usuario"),
        localStorage.getItem("contraseña"),
        this.fakeLoading();
      }
      else{
        this.error();
        this.formUsuario.reset();
      }
     
    }
    iNormaluser(){
      const usuario=this.formUsuario.value.usuario;
      const password=this.formUsuario.value.password;
      if(this.usuarioss.Username=="developer" && this.usuarioss.password=="developer" ){
       
        localStorage.setItem("usuario",this.usuarioss.Username),
        localStorage.setItem("contraseña",this.usuarioss.password),
        localStorage.getItem("usuario"),
        localStorage.getItem("contraseña"),
        this.fakeLoading2();
      }
      else{
        this.error();
        this.formUsuario.reset();
      }
    }
  
    error(){
      this.snackbar.open("Usuario o Contraseña son invalidos",'',{
        duration:5000,
        horizontalPosition:'center',
        verticalPosition: 'bottom'
  
      })
    }
    fakeLoading(){
      this.loading=true;
      setTimeout(()=>{
        
        this.router.navigate(['Crud']);
      },1500)
    }
    fakeLoading2(){
      this.loading=true;
      setTimeout(()=>{
        
        this.router.navigate(['Index']);
      },1500)
    }
}
