import React, { Component } from "react";
import './App.css';
import { ClienteService } from "./service/ClienteService";
import {DataTable} from 'primereact/datatable';
import {Column} from 'primereact/column'

import "primereact/resources/themes/vela-blue/theme.css";
import "primereact/resources/primereact.min.css";
import "primeicons/primeicons.css";

export default class App extends Component{
  constructor(){
    super();
    this.state = {};
   this.clienteService = new ClienteService();
  }

componentDidMount(){
  this.clienteService.getAll().then(data => this.setState({clientes: data})) 
}


render(){
  return (
    <DataTable value={this.state.clientes}>
      <Column field="id" header="ID"></Column>
      <Column field="nit" header="Nit"></Column>
      <Column field="tipoCliente" header="Tipo de Cliente"></Column>
      <Column field="nombre" header="Nombre"></Column>
      <Column field="apellido" header="Apellido"></Column>
      <Column field="genero" header="Genero"></Column>
      <Column field="fechadenacimeinto" header="Fecha de Nacimiento"></Column>
    </DataTable>
  );
}

}