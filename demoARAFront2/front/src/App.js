import React, { Component } from "react";
import './App.css';
import { ClienteService } from "./service/ClienteService";
import {DataTable} from 'primereact/datatable';
import {Column} from 'primereact/column';
import {Panel} from 'primereact/panel';
import {Menubar} from 'primereact/menubar';
import {Dialog} from 'primereact/dialog';
import {InputText} from 'primereact/inputtext';
import {Button} from 'primereact/button';




import "primereact/resources/themes/vela-blue/theme.css";
import "primereact/resources/primereact.min.css";
import "primeicons/primeicons.css";

export default class App extends Component{
  constructor(){
    super();
    this.state = {
      visible: false,
     cliente: {
      id: null,
      nit: null,
      tipocliente: null,
      nombre: null,
      apellido: null,
      genero: null,
      fechadenacimeinto: null
     },
     selectedCliente : {

     }
    };
    
    this.items=[{
      label: 'nuevo',
      icon: 'pi pi-fw pi-plus',
      command: () => {this.showSaveDialog()}
    },
    {
      label: 'Editar',
      icon: 'pi pi-fw pi-pencil',
      command: () => {this.showEditDialog()}
    },
    {
      label: 'Borrar',
      icon: 'pi pi-fw pi-trash',
      command: () => {this.delete()}
    }


    ];
    this.clienteService = new ClienteService();
   this.save = this.save.bind(this);
   this.delete = this.delete.bind(this);
    this.footer = (
      <div>
        <Button label="Guardar" icon="pi pi-check" onClick={this.save} />
      </div>
    );
   
  }

componentDidMount(){
  this.clienteService.getAll().then(data => this.setState({clientes: data})) 
}

save(){
  this.clienteService.save(this.state.cliente).then(data => {
    this.setState({
      visible: false,
      cliente: {
        id: null,
        nit: null,
        tipocliente: null,
        nombre: null,
        apellido: null,
        genero: null,
        fechadenacimeinto: null
       }
    });
    this.clienteService.getAll().then(data => this.setState({clientes: data})) 
  })
}

delete(){
 if(window.confirm("de verdad?")){
  this.clienteService.delete(this.state.selectedCliente.id).then(data =>{
    this.clienteService.getAll().then(data => this.setState({clientes: data}));
  });
 } 
    

}


render(){
  return (

    <div style={{width:'90%', marginTop: '20px', margin: '0 auto'}}>
      <Menubar model = {this.items}/>
      <Panel header ="Crud for customer table" >
        <DataTable value={this.state.clientes} selectionMode="single" selection ={this.state.selectedCliente} onSelectionChange={e => this.setState({selectedCliente : e.value})} >
            <Column field="id" header="ID"></Column>
            <Column field="nit" header="Nit"></Column>
            <Column field="tipoCliente" header="Tipo de Cliente"></Column>
            <Column field="nombre" header="Nombre"></Column>
            <Column field="apellido" header="Apellido"></Column>
            <Column field="genero" header="Genero"></Column>
            <Column field="fechadenacimeinto" header="Fecha de Nacimiento"></Column>
        </DataTable>
      </Panel>
      <Dialog header="Crear Cliente" visible ={this.state.visible} style={{width: '400px'}} footer={this.footer} modal={true} onHide={() => this.setState({visible: false})}>
            <form id="persona-form">
            <span className="p-float-label">  
              <InputText style={{width:'100%'}}  id="nit" onChange={(e) => {
                 let val = e.target.value;
                 this.setState(prevState => {
                  let cliente = Object.assign({}, prevState.cliente)
                  cliente.nit = val;
                  
                  return {cliente};
              } )}
              } />
              <label htmlFor="nit">Nit</label>
              </span>
              <br></br>
              <span className="p-float-label">  
              <InputText style={{width:'100%'}}  id="tipoCliente" onChange={(e) => {
                let val = e.target.value;
                this.setState(prevState => {
                 let cliente = Object.assign({}, prevState.cliente)
                 cliente.tipoCliente = val;
                 
                 return {cliente};
              } )} 
              }/>
              <label htmlFor="tipoCliente">Tipo de Cliente</label>
              </span>
              <br></br>
              <span className="p-float-label">  
              <InputText style={{width:'100%'}}  id="nombre" onChange={(e) => {
               let val = e.target.value;
               this.setState(prevState => {
                 let cliente = Object.assign({}, prevState.cliente)
                 cliente.nombre = val;
                 
                 return {cliente};
              } )} 
              }/>
              <label htmlFor="nombre">Nombre</label>
              </span>
              <br></br>
              <span className="p-float-label">  
              <InputText style={{width:'100%'}}  id="apellido" onChange={(e) => {
                let val = e.target.value;
                this.setState(prevState => {
                 let cliente = Object.assign({}, prevState.cliente)
                 cliente.apellido = val;
                 
                 return {cliente};
              } )} 
              }/>
              <label htmlFor="apellido">Apellido</label>
              </span>
              <br></br>
              <span className="p-float-label">  
              <InputText style={{width:'100%'}} id="genero" onChange={(e) => {
               let val = e.target.value;
               this.setState(prevState => {
                 let cliente = Object.assign({}, prevState.cliente)
                 cliente.genero = val
                 
                 return {cliente};
              } )} 
              }/>
              <label htmlFor="genero">Genero</label>
              </span>
              <br></br>
              <span className="p-float-label">  
              <InputText style={{width:'100%'}}  id="fechadenacimeinto" onChange={(e) => {
                let val = e.target.value;
                this.setState(prevState => {
                 let cliente = Object.assign({}, prevState.cliente)
                 cliente.fechadenacimeinto = val;
                 
                 return {cliente};
              } )} }/>
              <label htmlFor="fechadenacimeinto">Fecha de Nacimiento</label>
              </span>
              </form>
      </Dialog>
      
    </div>

  );
}


showSaveDialog(){
  this.setState({
    visible: true,
    cliente: {
      id: null,
      nit: null,
      tipocliente: null,
      nombre: null,
      apellido: null,
      genero: null,
      fechadenacimeinto: null
     }
  });

  document.getElementById('persona-form').reset();
    
}

showEditDialog(){
  this.setState({
    visible: true,
    cliente: {
      id: this.state.selectedCliente.id,
      nit: this.state.selectedCliente.nit,
      tipocliente: this.state.selectedCliente.tipoCliente,
      nombre: this.state.selectedCliente.nombre,
      apellido: this.state.selectedCliente.apellido,
      genero: this.state.selectedCliente.genero,
      fechadenacimeinto: this.state.selectedCliente.fechadenacimeinto
     }
  })
}

}