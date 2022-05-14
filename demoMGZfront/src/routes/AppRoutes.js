import React from "react";

import {BrowserRouter, Switch, Route} from "react-router-dom";

import Layout from "../containers/app/LayoutPrincipal/LayoutPrincipal";
import Home from "../components/home/home";
import TipoProducto from "../components/tipoProducto/TipoProducto";
import NotFound from "../components/Notfound/Notfound";

const AppRoutes = () => (
    <BrowserRouter>
    <Layout>
       
        <Switch>
            <Route exact path="/" component ={Home}/>
            <Route exact path="/TipoProducto" component ={TipoProducto}/>   
            <Route component ={NotFound}/>
        </Switch>
    </Layout>
    </BrowserRouter>
);

export default AppRoutes;