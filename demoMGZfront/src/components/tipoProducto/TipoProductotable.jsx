import React from "react";

const TipoProductotable = (props) =>(
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Referencia</th>
        <th>Nombre</th>
        <th>Color</th>
        <th>Edad</th>
        <th>Nivel de azucar</th>
        <th>Cepa</th>
        <th>Crianza</th>
        <th>Metodo de elaboracion</th>
    </tr>
    </thead>
    <tbody>
      {undefined !== props.TipoProductos && props.TipoProductos.lengh > 0 ?(
          props.TipoProductos.map((TipoProducto)=>(
            <tr key={TipoProductos.id.toString()}>
                <td>{TipoProductos.id}</td>
                <td>{TipoProductos.referencia}</td>
                <td>{TipoProductos.nombre}</td>
                <td>{TipoProductos.color}</td>

                <td>{TipoProductos.edad}</td>
                <td>{TipoProductos.nivel_azucar}</td>
                <td>{TipoProductos.cepa}</td>
                <td>{TipoProductos.crianza}</td>
                <td>{TipoProductos.metodo_elaboracion}</td>
                <td>
                    <button
                        onClick = {()=> {
                        props.editRow(TipoProducto);
                        }}
                        className="button muted-button"
                    >
                        
                    </button>
                    <button
                        onClick={() => props.deleteTipoProducto(TipoProductos.id)}
                        className="button muted-button"
                    >
                    </button>
                </td>
            </tr>
          ))
      ) : (
          <tr>
              <td colSpan={3}>No products</td>
          </tr>
      )}
    </tbody>
</table>
);

export default TipoProductotable;