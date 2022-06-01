import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import Stateful from './Components/Stateful';
import Stateless from './Components/Stateless';
import Button from './Components/Button';
import GetGreeting from './Components/GetGreeting';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <Stateless />
    <Stateful />
    <Button />
    <GetGreeting />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
