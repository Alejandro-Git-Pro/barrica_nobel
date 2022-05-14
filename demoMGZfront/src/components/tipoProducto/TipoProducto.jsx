
import './TipoProducto.scss';
import TipoProductoTable from "./TipoProductotable";
import AddTipoProductForm from "./AddTipoProductoForm";
import EditTipoProductoForm from "./EditTipoProductForm";
import React, {useState, useEffect } from "react"; 
import axios from "axios";



const TipoProducto = () => {
    const tipoProductodatos = [
        {id: 1, referencia: 'BarricaNoble', nombre: "Versace", color: "Tinto", 
        edad: "joven", nivel_azucar: "seco",cepa: "Merlot", crianza:"Añejo",metodo_elaboracion:"Vendimia seleccionada" },
        {id: 2, referencia: "BarricaNoble", nombre: "pioni", color: "Rosado", 
        edad: "joven", nivel_azucar: "Abocados",cepa: "Pinot noir", crianza:"Viejo",metodo_elaboracion:"Vinos especiales" },
        {id: 3, referencia: "BarricaNoble", nombre: "LV", color: "Blanco", edad: "Crianza", 
        nivel_azucar: "Dulce",cepa: "Merlot", crianza:"Cabernet Sauvignon",metodo_elaboracion:"Vinos especiales" },
    ];
    const [TipoProducto, setTipoProducto] = useState(tipoProductodatos);
    const [showLoading, setShowLoading] = useState(true);
    const apiUrl = "http://localhost:8080/api/TipoProducto";
    useEffect(()=>{
        const fechData = async () =>{ 
            const result = await axios(apiUrl+"/getTipoProductos" )
            setTipoProducto(result.data.TipoProductolist);
        };
        fechData();
    }, []);
    const addtipoproducto = (TipoProducto) => {
        SetshowLoading(true);
        const data ={
            referencia: TipoProducto.referencia,
            nombre: TipoProducto.nombre,
            color: TipoProducto.color,
            edad: TipoProducto.edad,
            nivel_azucar: TipoProducto.nivel_azucar,
            cepa: TipoProducto.cepa,
            crianza: TipoProducto.crianza,
            metodo_elaboracion: TipoProducto.metodo_elaboracion,
        };
        axios
        .post(apiUrl + "/agregar", data)
        .then((result) => {
          setTipoProducto([...TipoProductos, result.data]);
        })
        .catch((error) => setShowLoading(false));
    };
    const deleteTipoProducto = (id) => {
        setTipoProducto(TipoProductos.filter((TipoProducto) => TipoProducto.id !== id));
        const data = {
            referencia:"",
            nombre: "",
            color: "",
            edad:"",
            nivel_azucar:"",
            cepa: "",
            crianza: "",
            metodo_elaboracion: "",
        };
        axios
          .post(apiUrl + "/delete", data)
          .then((result) => {
          })
          .catch((error) => setShowLoading(false));
      };
      const [editing, setEditing] = useState(false);

      const initialFormState= {
        id: null,
        referencia:"",
        nombre: "",
        color: "",
        edad:"",
        nivel_azucar:"",
        cepa: "",
        crianza: "",
        metodo_elaboracion: "",
      };

      const [currentTipoProducto, setCurrentTipoProducto] = useState(initialFormState);

      const editRow = (TipoProducto) => {
        setEditing(true);
        setCurrentTipoproducto({
            id: TipoProducto.id,
            referencia: TipoProducto.referencia,
            nombre: TipoProducto.nombre,
            color: TipoProducto.color,
            edad: TipoProducto.edad,
            nivel_azucar: TipoProducto.nivel_azucar,
            cepa: TipoProducto.cepa,
            crianza: TipoProducto.crianza,
            metodo_elaboracion: TipoProducto.metodo_elaboracion,
        });
      };
      const updateTipoProducto = (id, updateTipoProducto) => {
        setEditing(false);
        setTipoProductos(
          TipoProductos.map((TipoProducto) =>
          TipoProducto.id === id ? updateTipoProducto : TipoProducto
          )
        );
        const data = {
            referencia: TipoProducto.referencia,
            nombre: TipoProducto.nombre,
            color: TipoProducto.color,
            edad: TipoProducto.edad,
            nivel_azucar: TipoProducto.nivel_azucar,
            cepa: TipoProducto.cepa,
            crianza: TipoProducto.crianza,
            metodo_elaboracion: TipoProducto.metodo_elaboracion,
          };
          axios
          .post(apiUrl + "/actualizar", data)
          .then((result) => {
          })
          .catch((error) => setShowLoading(false));
      };
    
      
      return (
        <div className="container">
          <h1>CRUD </h1>
          <div className="flex-row">
            <div className="flex-large">
              {editing ? (
                <div>
                  <h2>Edit TipoProducto</h2>
                  <EditTipoProductoForm
                    setEditing={setEditing}
                    currentTipoProducto={currentTipoProducto}
                    updateTipoProducto={updateTipoProducto}
                  />
                </div>
              ) : (
                <div>
                  <h2>Agregar producto</h2>
                  <AddTipoProductForm addtipoproducto={addtipoproducto} />
                </div>
              )}
            </div>
    
            <div className="flex-large">
              <h2>Ver productos</h2>
              <TipoProductoTable
                tipoproducto={TipoProducto}
                deleteTipoProducto={deleteTipoProducto}
                editRow={editRow}
              />
            </div>
          </div>
        </div>
    );
};
   
export default TipoProducto;
