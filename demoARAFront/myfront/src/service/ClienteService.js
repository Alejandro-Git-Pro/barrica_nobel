import axios from 'axios';

export class ClienteService{
    url = "http://localhost:8080/api/ClienteCustomAPI/"

    getAll(){
        return axios.get(this.url + "Clientegetall").then(res => res.data );
            
        }
    }