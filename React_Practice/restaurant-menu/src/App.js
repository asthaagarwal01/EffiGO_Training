import React from 'react';
import './App.css';
import Navbar from './Components/Navbar';
import Card from './Components/Card';

function App() {
  return (
   
      <div className='container'>
        <div className='header'>
          <Navbar/>
        </div>
        <h2>Our Menu</h2>
        <Card/>
      </div>
    
  );
}

export default App;
