import { NumberFormatStyle } from '@angular/common';
import { Component } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
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
  imports: [MatFormFieldModule,MatProgressSpinnerModule,ReactiveFormsModule,MatIconModule,MatCardModule,MatInputModule,HttpClientModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
[x: string]: any;
  formUsuario:FormGroup;
  

  constructor(private fb: FormBuilder, private snackbar: MatSnackBar, private router: Router) {
    this.formUsuario = this.fb.group({
      usuario: ['', Validators.required],
      password: ['', Validators.required]
    });
  }
  ingresar() {
    const usuario = this.formUsuario.value.usuario;
    const password = this.formUsuario.value.password;

    if (usuario === 'admin' && password === 'admin') {
 
            this.router.navigate(['Registrar']); // Redirige a 'Registrar'
    
    } else {
        this.snackbar.open("Usuario o Contraseña son invalidos", '', {
            duration: 5000,
            horizontalPosition: 'center',
            verticalPosition: 'bottom'
        });
        this.formUsuario.reset();
    }
  }
}
