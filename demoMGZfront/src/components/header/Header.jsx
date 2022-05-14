import React from "react";
import './Header.scss';
import { Link } from "react-router-dom";
//import "../assets/styles/components/Header.scss";
//import logo from "../assets/static/logo.png";

const Header = () => (
  <header className="header">
    <Link to="/">
     {/* <img className="header__img" src="{ logo }" alt="Logo" /> */}
     <img src="imagenes/logo.png" alt="" width="90" />
    </Link>

    <div className="header__menu">
      <div className="header__menu--profile">
        <img src="{ userIcon }" alt="" />
        <img src="imagenes/menu.png" alt="" />
      </div>
      <ul>
        <li>
          <a href="/">Home</a>
        </li>
        <li>
          <a href="/TipoProductotable">---</a>
        </li>
        <li>
          <Link to="/TipoProducto">TipoProducto</Link>
        </li>
      </ul>
    </div>
  </header>
);
export default Header;  
