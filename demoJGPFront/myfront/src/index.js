import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import StatelessDemo from './componentsdemoreact/Stateless';
import Stateful from './componentsdemoreact/Stateful';
import Button from './componentsdemoreact/Button';
import reportWebVitals from './reportWebVitals';
import GetGreeting from './componentsdemoreact/GetGreeting';
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <StatelessDemo />
    <Stateful />
    <Button />
    <GetGreeting />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
