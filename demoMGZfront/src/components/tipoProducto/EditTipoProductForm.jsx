import React, {useState, useEffect } from "react";

const EditTipoProductoForm = (props) => {
    const [TipoProductos, setTipoProductos] = useState(props.currentTipoProducto);

    const handleInputChange = (event) => {
        const {name, value} = event.target;
        setTipoProductos({ ...TipoProductos, [name]: value});
    };

    useEffect(() => {
        setTipoProductos(props.currentTipoProducto);
    }, [props]);

    return (
        <form 
        onSubmit={(event) =>{
            event.preventDefault();
            props.updateTipoProductos(TipoProductos.id, TipoProductos);
        }}
        >
            <label>Referencia</label>
            <input 
            type = "text"
            name = "Referencia"
            value={TipoProductos.referencia}
            onChange={handleInputChange}
            />

            <label>Nombre</label>
            <input 
            type = "text"
            name = "Nombre"
            value={TipoProductos.nombre}
            onClick={handleInputChange}
            
            />

            <label>Color</label>
            <input 
            type = "text"
            name = "Color"
            value={TipoProductos.color}
            onChange={handleInputChange}
            />

            <label>Edad</label>
            <input 
            type = "text"
            name = "Edad"
            value={TipoProductos.edad}
            onChange={handleInputChange}
            />

            <label>NivelAzucar</label>
            <input 
            type = "text"
            name = "nivelAzucar"
            value={TipoProductos.NivelAzucar}
            onChange={handleInputChange}
            />

            <label>Cepa</label>
            <input 
            type = "text"
            name = "Cepa"
            value={TipoProductos.cepa}
            onChange={handleInputChange}
            />

            <label>Crianza</label>
            <input 
            type = "text"
            name = "Crianza"
            value={TipoProductos.crianza}
            onChange={handleInputChange}
            />

            <label>Metodo de Elaboracion</label>
            <input 
            type = "text"
            name = "MetodoElaboracion"
            value={TipoProductos.MetodoElaboracion}
            onChange={handleInputChange}
            />

            <button>Actualizar</button>
            <button
            onClick={() => props.setEditing(false)} 
            className = "button muted-button"
            >

            </button>
        </form>
    );
};

export default EditTipoProductoForm;