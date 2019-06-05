import { Component, OnInit } from '@angular/core';
import { ServicioProductosService } from 'src/app/services/servicio-productos.service';

@Component({
  selector: 'app-listado-productos',
  templateUrl: './listado-productos.component.html',
  styleUrls: ['./listado-productos.component.scss']
})
export class ListadoProductosComponent implements OnInit {

  result: any;
 

  constructor(public service: ServicioProductosService) { }

  ngOnInit() {
    this.service.getRequest('http://localhost:8084/WebProductosRest/api/productos').subscribe(
      (data) => this.processResult(data)
    );
  }

  processResult(data: any) {
    this.result = data;
    return this.result;
  }

  }

