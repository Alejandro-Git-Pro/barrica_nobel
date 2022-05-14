import React, {useState} from "react";

const AddTipoProductoForm = (props) => {
    const initialFormState = { id: null, referencia: "", nombre: "", color: "", edad: "", NivelAzucar: "", cepa: "", crianza: "",
     MetodoElaboracion: "" };
     const [TipoProductos, setTipoProductos] = useState(initialFormState);


     const handleInputChange = (event) => {
         const {name, value} = event.target;

         setTipoProductos({...TipoProductos, [name]: value});
     };

     return (
         <form 
         onSubmit={(event) => {
            event.preventDefault();
            if (!TipoProductos.referencia || !TipoProductos.nombre || !TipoProductos.color 
                || TipoProductos.edad || TipoProductos.NivelAzucar || TipoProductos.cepa 
                || TipoProductos.crianza || TipoProductos.MetodoElaboracion)

                return;
                props.addtipoproducto(TipoProducto);
                setTipoProductos(initialFormState);
         }} 
         >
            <br/>
            <label>Referencia</label><br/>
            <input 
            type = "text"
            name = "Referencia"
            value={TipoProductos.referencia}
            onChange={handleInputChange}
            />
            <br/>
            <label>Nombre</label><br/>
            <input 
            type = "text"
            name = "Nombre"
            value={TipoProductos.nombre}
            onChange={handleInputChange}
            />
            <br/>
            <label>Color</label><br/>
            <input 
            type = "text"
            name = "Color"
            value={TipoProductos.color}
            onChange={handleInputChange}
            />
            <br/>
            <label>Edad</label><br/>
            <input 
            type = "text"
            name = "Edad"
            value={TipoProductos.edad}
            onChange={handleInputChange}
            />
            <br/>
            <label>Nivel de Azucar</label><br/>
            <input 
            type = "text"
            name = "nivelAzucar"
            value={TipoProductos.NivelAzucar}
            onChange={handleInputChange}
            />
            <br/>
            <label>Cepa</label><br/>
            <input 
            type = "text"
            name = "Cepa"
            value={TipoProductos.cepa}
            onChange={handleInputChange}
            />
            <br/>
            <label>Crianza</label><br/>
            <input 
            type = "text"
            name = "Crianza"
            value={TipoProductos.crianza}
            onChange={handleInputChange}
            />
            <br/>
            <label>Metodo de Elaboracion</label><br/>
            <input 
            type = "text"
            name = "MetodoElaboracion"
            value={TipoProductos.MetodoElaboracion}
            onChange={handleInputChange}
            /><br/><br/>
            <button>Agregar</button>
         </form>
     );
};

export default AddTipoProductoForm;