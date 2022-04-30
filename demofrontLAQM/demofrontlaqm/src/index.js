import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';
import Stateful from './components/Stateful';
import Stateless from './components/Stateless';
import Button from './components/Button';
import Button1 from './components/Button1';
import FlavorForm from './components/FlavorForm';
import Calculator from './components/ConvTemperatura';
import GetGreeting from './components/GetGreeting';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    
    <GetGreeting/>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
