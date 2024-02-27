import React, { useState } from 'react'
import "./MenuCard.css"
import "./menuApi.js"
import Menu from "./menuApi";


function MenuCard() {

  const[menuData,setMenuData]=useState(Menu);
  console.log(menuData);
  return (

    <div className='card'>
      <div className='images'>
        <img src="/images/paratha.jpg" alt="food" title='' />
      </div>
      <div className='heading'>
        <h4>hey</h4>
        <p id="description">Elit occaecat aliqua ut veniam eu excepteur et dolore dolor labore incididunt aute.</p>
        <div className='order'>
          <p id="price">$20.00</p>
          <button id="place-order">ORDER</button>
        </div>
      </div>
    </div>

  )
}

export default MenuCard