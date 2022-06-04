import axios from 'axios';

export class ClienteService{
    url = "http://localhost:8080/api/ClienteCustomAPI/"

    getAll(){
        return axios.get(this.url + "Clientegetall").then(res => res.data );
            
        }
    
    
    save(cliente){
        return axios.post(this.url + "Clienteadd", cliente).then(res => res.data );
        }


    delete(id){
        console.log(`El id es ${id}`)
        return axios.delete(this.url + "Clientedelete/" +id).then(res => res.data);
    }

    }

    